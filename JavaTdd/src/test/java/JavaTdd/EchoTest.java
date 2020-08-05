package JavaTdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EchoTest {
    
    @Test
    public void testShoutReturnsUpperCase() {
        //Setup
        Echo echo = new Echo();
        // Execution
        String result = echo.shout("hello");
        // Assertions
        assertEquals("Hello!", result);
    }
}