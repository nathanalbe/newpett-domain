package edu.gmu.cs321;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

public class DependentTest {

    @Test
    public void testDependentCreation() {
        // Test the creation of an Imm
        // Ensure that the constructor works as expected
        String name = "John Doe";
        String birthdate = "1990-01-01";
        String address = "123 Main St, Springfield, USA";
        String email = "doe@gmail.com";
        String relationship = "Child"; // Added relationship for Dependent
        Dependent user = new Dependent(name, birthdate, address, email, relationship);

        // Simulate valid creation
        boolean result = user.createImmigrant();
        assertTrue(result);  // TDD placeholder

        // Simulate invalid creation (missing fields)
        user = new Dependent("", "", "", "", "");
        result = user.createImmigrant();
        assertTrue(result);
    }

    @Test
    public void testDependentUpdate() {
        // Test the creation of an Imm
        // Ensure that the constructor works as expected
        String name = "John Doe";
        String birthdate = "1990-01-01";
        String address = "123 Main St, Springfield, USA";
        String email = "doe@gmail.com";
        String relationship = "Child"; // Added relationship for Dependent
        Dependent user = new Dependent(name, birthdate, address, email, relationship);

        // Simulate valid update
        boolean result = user.updateImmigrant("456 Elm St, Springfield, USA", "new@example.com");
        assertTrue(result);  // TDD placeholder

        // Simulate invalid update (missing fields)
        result = user.updateImmigrant("", "");
        assertTrue(result);  // TDD placeholder
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDependentGet() {
        // Test the creation of an Imm
        // Ensure that the constructor works as expected
        String name = "John Doe";
        String birthdate = "1990-01-01";
        String address = "123 Main St, Springfield, USA";
        String email = "doe@gmail.com";
        String relationship = "Child"; // Added relationship for Dependent
        Dependent user = new Dependent(name, birthdate, address, email, relationship);

        // Simulate valid ID
        Dependent found = (Dependent) user.getImmigrantByID(1);
        assertNotNull(found);  // TDD placeholder (will be fixed later)
        assertThat(found, isA(Dependent.class));
        
        // Simulate invalid ID
        Dependent invalid = (Dependent) user.getImmigrantByID(-5);  
        assertNotNull(invalid);  // TDD placeholder (will be fixed later)
        assertThat(found, isA(Dependent.class));
    }
}
