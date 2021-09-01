import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldJunit4Test {

    @Test
    public void hello() {

        JavaHelloWorld jhw = new JavaHelloWorld();
        assertEquals(jhw.hello(), "Hello World");
    }
}