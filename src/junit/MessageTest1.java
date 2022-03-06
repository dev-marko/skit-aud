package junit;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest1 {

    String message = "Tom";
    Message messageObject = new Message(message);

    @Test
    public void testPrintMessageTrue() {
        assertEquals(message, messageObject.printMessage());
    }

    @Test
    public void testPrintMessageFalse() {
        assertEquals("Mark", messageObject.printMessage());
    }
}
