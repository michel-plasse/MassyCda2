package demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void demoFor() {
        for (int i = 0; i < 2; i++) {
            System.out.println("test :  " + i);
        }
    }

    @Test
    public void test1() {
        System.out.println("test1");
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
