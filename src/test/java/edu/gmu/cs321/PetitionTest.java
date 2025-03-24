package edu.gmu.cs321;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PetitionTest {

    @Test
    public void testPetitionCreation() {
        // Test the creation of a Petition
        // Test the Petition Constructor works correctly
        String petitionID = "P0123456";
        String petitionerID = "U9876543";
        String submissionDate = "030525";
        String status = "processing";
        Petition entry = new Petition(petitionID, petitionerID, submissionDate, status);

        // Check a valid petition creation
        boolean result = entry.createPetition();
        assertTrue(result);

        // Check an invalid petition creation
        entry = new Petition("", "", "", "");
        result = entry.createPetition();
        assertTrue(result);
    }

    @Test
    public void testUpdatePetitionID() {
        // Test the updatePetitionID method
        String petitionID = "P0123456";
        String petitionerID = "U9876543";
        String submissionDate = "030525";
        String status = "processing";
        Petition entry = new Petition(petitionID, petitionerID, submissionDate, status);

        // Check a valid petition ID update
        boolean result = entry.updatePetitionID("P0122333");
        assertTrue(result);

        // Check an invalid petition ID update
        result = entry.updatePetitionID("");
        assertTrue(result);
    }

    @Test
    public void testGetPetitionerID() {
        // Test the getPetitionerID method
        String petitionID = "P0123456";
        String petitionerID = "U9876543";
        String submissionDate = "030525";
        String status = "processing";
        Petition entry = new Petition(petitionID, petitionerID, submissionDate, status);

        // Check a valid petitioner ID retrieval
        boolean result = entry.getPetitionerID();

        // Check an invalid petitioner ID retrieval
        result = entry.getPetitionerID();
    }
}
