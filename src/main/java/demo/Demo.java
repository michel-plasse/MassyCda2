package demo;

// La classe Recipient, qui n'est pas dans le package courant,
// est celle du package recipient.
import recipient.Recipient;

/**
 * Composant Demo
 */
public class Demo {
  void foo() {
    Recipient recipient = new Recipient(1, 3);
  }
  
}
