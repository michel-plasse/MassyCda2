package genericite;

import demo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EchantillonTest {
  private Echantillon echantillon;
  private double precision = 0.0001;
  
  @Test
  public void testConstructeur() {
    System.out.println("constructeur");
    Echantillon instance = new Echantillon();
    assertEquals(0, instance.getTaille());
  }
  
  @Test
  public void testAjouterUneFois() {
    System.out.println("ajouterUneFois");
    double precision = 0.0001;
    Echantillon instance = new Echantillon();
    instance.ajouter(10.5);
    assertEquals(1, instance.getTaille());
    // assertEquals(double, double) est déprécié
    // car il peut y avoir une erreur d'arrondi
    // => ajouter la précision
    assertEquals(10.5, instance.getMinimum(), precision);
    assertEquals(10.5, instance.getMoyenne(), precision);
    assertEquals(10.5, instance.getMaximum(), precision);
  }

  @BeforeEach
  public void ajouterNFois() {
    System.out.println("\najouterNFois");
    echantillon = new Echantillon();
    echantillon.ajouter(-5.5);
    echantillon.ajouter(0);
    echantillon.ajouter(8.5);
  }
  
  @Test
  public void testGetMinimum() {
    System.out.println("getMinimum");
    assertEquals(-5.5, echantillon.getMinimum(), precision);
  }
  
  @Test
  public void testGetMoyenne() {
    System.out.println("getMoyenne");
    assertEquals(1, echantillon.getMoyenne(), precision);
  }
  
  @Test
  public void testGetMaximum() {
    System.out.println("getMaximum");
    assertEquals(8.5, echantillon.getMaximum(), precision);
  }
  
}
