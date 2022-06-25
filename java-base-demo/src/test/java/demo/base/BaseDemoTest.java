package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_3() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 3;

        assertEquals(expected, baseDemo.sum(1,2));
    }

    @Test
    public void should_return_10() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 10;

        assertEquals(expected, baseDemo.sum(2,8));
    }
}
