package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LecteurDoubleTest {

  public LecteurDoubleTest() {
  }

  @Test
  public void testOk() {
    System.out.println("ok");
    // Given
    LecteurDouble instance = new LecteurDouble();
    // When
    instance.setInput("25.4");
    // Then
    assertEquals(25.4, instance.getValue());
  }

  @Test
  public void testKo() {
    System.out.println("ok");
    // Given
    LecteurDouble instance = new LecteurDouble();
    // When
    instance.setInput("un");
    // Then
    assertEquals(null, instance.getValue());
  }

}
