package edu.gmu.cs321;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ImmigrantTest {

    @Test
    public void testImmigrantCreation() {
        Immigrant user = new Immigrant();
        assertTrue(user != null, "User should be created successfully");
    }
}
