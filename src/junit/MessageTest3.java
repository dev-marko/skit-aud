package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest3 {

    String message = "Tom";
    Message messageObject = new Message(message);

    @Test
    public void goodbyeMessageTrue() {
        assertEquals("Goodbye " + message, messageObject.goodbyeMessage());
    }

    @Test
    public void goodbyeMessageFalse() {
        assertEquals("Bye " + message, messageObject.goodbyeMessage());
    }
}