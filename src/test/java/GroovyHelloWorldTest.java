import org.junit.Test;

import static org.junit.Assert.*;

public class GroovyHelloWorldTest {

    @Test
    public void hello() {

        GroovyHelloWorld ghw = new GroovyHelloWorld();
        assertTrue(ghw.hello().equals("Hello Groovy World"));
    }
}