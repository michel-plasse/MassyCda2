package recipient.v2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecipientTest {

  @Test
  public void testMettreUnDans() {
    // Declarons un objet de type Recipient
    // Cela ajoute dans la pile la taille d'une adresse mémoire (l'adresse de l'objet)
    Recipient recipient;
    // Allouer la mémoire pour l'objet
    // avec une quantité de 3 et une capacité de 5
    recipient = new Recipient(3, 5);
    // Declarer et allouer un autre récipient
    Recipient autre;
    autre = new Recipient(2, 4);
    // Faire l'opération à tester
    recipient.mettreUnDans(autre);
    // Vérifier les garanties (les postconditions)
    // recipient.getQuantite() doit valoir 2
    int expected = 2;
    int result = recipient.getQuantite();
    assertEquals(expected, result);
    assertEquals(3, autre.getQuantite());
    assertEquals(5, recipient.getCapacite());
    assertEquals(4, autre.getCapacite());
    // Verifier les invariants
    assertTrue(recipient.invariantEstOk());
    assertTrue(autre.invariantEstOk());
  }

  @Test
  public void testViderDans() {
    //Declarons un objet de type Recipient
    // Cela ajoute dans la pile la traille d'une adresse memoire (l'adresse de l'objet)
    Recipient recipient;
    //Allouer la memoire pour l'objet
    recipient = new Recipient(6, 7);
    //Declarer et allouer un autre recipient
    Recipient autre;
    autre = new Recipient(4, 11);
    recipient.viderDans(autre);
    // Verifierles garanties (les postconconditions)
    // recipient.getQuantite() doit valoir 2
    assertTrue(recipient.estVide());
    assertEquals(10, autre.getQuantite());
    assertEquals(7, recipient.getCapacite());
    assertEquals(11, autre.getCapacite());

    //invariant pour les 2 instances
    assertTrue(recipient.invariantEstOk());
    assertTrue(autre.invariantEstOk());
  }

  @Test
  public void testRemplir() {
    Recipient recipient;
    Recipient autre;
    recipient = new Recipient(6, 8);
    autre = new Recipient(2, 6);

    recipient.remplir(autre);
    //verifier qu'on a rempli
    assertTrue(autre.estPlein());
    assertEquals(2, recipient.getQuantite());
    assertEquals(8, recipient.getCapacite());
    assertEquals(6, autre.getCapacite());
    //invariant pour les 2 instances
    assertTrue(recipient.invariantEstOk());
    assertTrue(autre.invariantEstOk());
  }
}
