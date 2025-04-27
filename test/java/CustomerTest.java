import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void testSetAndGetName() {
        Customer customer = new Customer();
        customer.setName("Alice");
        assertEquals("Alice", customer.getName());
    }
}
