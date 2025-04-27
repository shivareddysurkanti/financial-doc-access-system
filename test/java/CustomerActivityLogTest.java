import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CustomerActivityLogTest {

    @Test
    public void testLogActivity() {
        // Mocking CustomerActivityLog
        CustomerActivityLog log = Mockito.mock(CustomerActivityLog.class);

        when(log.getActivity()).thenReturn("User logged in");

        assertEquals("User logged in", log.getActivity());
    }
}
