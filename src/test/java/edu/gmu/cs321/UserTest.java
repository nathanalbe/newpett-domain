package edu.gmu.cs321;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User();
        assertTrue(user != null, "User should be created successfully");
    }
}
