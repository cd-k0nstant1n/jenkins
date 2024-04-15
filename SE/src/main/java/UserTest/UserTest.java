package UserTest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.Answer;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserTest {
    private User user;
    private User mockUser;

    @Before
    public void setUp() {
        user = new User("testUser", "19216");
        mockUser = mock(User.class);
        when(mockUser.authenticate("19216")).thenAnswer((Answer<Boolean>) invocation -> {
            throw new Exception("Course number");
        });
        when(mockUser.authenticate(anyString())).thenAnswer((Answer<Boolean>) invocation -> {
            Object arg = invocation.getArgument(0);
            if (!"19216".equals(arg)) {
                return false;
            }
            return false;
        });
    }

    @Test
    public void testAuthenticateSuccess() {
        assertTrue(user.authenticate("19216"));
    }

    @Test
    public void testAuthenticateFailure() {
        assertFalse(user.authenticate("19216_false"));
    }

    @Test
    public void testLockUser() {
        user.lockUser();
        assertTrue(user.isLocked());
    }

    @Test
    public void testUnlockUser() {
        user.lockUser();
        user.unlockUser();
        assertFalse(user.isLocked());
    }

    @Test
    public void testResetPasswordAndUnlock() {
        user.lockUser();
        user.resetPassword("new19216");
        assertTrue(user.authenticate("new19216"));
        assertFalse(user.isLocked());
    }

    @Test
    public void testMockAuthenticateSuccess() {
        User mockUser = mock(User.class);
        when(mockUser.authenticate(anyString())).thenReturn(true);
        assertTrue(mockUser.authenticate("anyPassword"));

    }

    @Test
    public void testMockAuthenticateFailure() {
        User mockUser = mock(User.class);
        when(mockUser.authenticate(anyString())).thenReturn(false);
        assertFalse(mockUser.authenticate("anyPassword"));
    }
}
