import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testSetAndGetAccountNumber() {
        Account account = new Account();
        account.setAccountNumber("12345");
        assertEquals("12345", account.getAccountNumber());
    }
}
