import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CustomerActivityLogTest {

    @Test
    public void testCustomerActivityLogAction() {
        CustomerActivityLog log = Mockito.mock(CustomerActivityLog.class);

        when(log.getAction()).thenReturn("User logged in");

        assertEquals("User logged in", log.getAction());
    }
}
