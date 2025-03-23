package edu.gmu.cs321;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;


public class ImmigrantTest {

    @Test
    public void testImmigrantCreation() {
        // Test the creation of an Imm
        // Ensure that the constructor works as expected
        String name = "John Doe";
        String birthdate = "1990-01-01";
        String address = "123 Main St, Springfield, USA";
        String email = "doe@gmail.com";
        Immigrant user = new Immigrant(name, birthdate, address, email);

        // Simulate valid creation
        boolean result = user.createImmigrant();
        assertTrue(result);  // TDD placeholder

        // Simulate invalid creation (missing fields)
        user = new Immigrant("", "", "", "");
        result = user.createImmigrant();
        assertTrue(result);
    }

    @Test
    public void testImmigrantUpdate() {
        // Test the creation of an Imm
        // Ensure that the constructor works as expected
        String name = "John Doe";
        String birthdate = "1990-01-01";
        String address = "123 Main St, Springfield, USA";
        String email = "doe@gmail.com";
        Immigrant user = new Immigrant(name, birthdate, address, email);

        // Simulate valid update
        boolean result = user.updateImmigrant("456 Elm St, Springfield, USA", "new@example.com");
        assertTrue(result);  // TDD placeholder

        // Simulate invalid update (missing fields)
        result = user.updateImmigrant("", "");
        assertTrue(result);  // TDD placeholder
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testImmigrantGet() {
        // Test the creation of an Imm
        // Ensure that the constructor works as expected
        String name = "John Doe";
        String birthdate = "1990-01-01";
        String address = "123 Main St, Springfield, USA";
        String email = "doe@gmail.com";
        Immigrant user = new Immigrant(name, birthdate, address, email);

        // Simulate valid ID
        Immigrant found = user.getImmigrantByID(1);
        assertNotNull(found);  // TDD placeholder (will be fixed later)
        assertThat(found, isA(Immigrant.class));
        
        // Simulate invalid ID
        Immigrant invalid = user.getImmigrantByID(-5);  
        assertNotNull(invalid);  // TDD placeholder (will be fixed later)
        assertThat(found, isA(Immigrant.class));
    }
}
