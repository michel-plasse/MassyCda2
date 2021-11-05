package demo;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DemoTest {
  
  @Test
  public void test1() {
    System.out.println("test1");
    double d = Double.parseDouble("12.5");
    assertEquals(12.5,d,0.01);
    d = Double.parseDouble("un");
    assertEquals(1,d,0.01);
  }
  
  @Test
  public void test2() {
    System.out.println("test2");
  }

  public void test3() {
    System.out.println("test3");
  }
  
  @BeforeEach
  public void doBefore() {
    System.out.println("\nbefore");
  }
  
  @AfterEach
  public void doAfter() {
    System.out.println("after");
  }
}
