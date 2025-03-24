package edu.gmu.cs321;

public class Petition {

    private String petitionID;
    private String petitionerID;
    private String submissionDate;
    private String status;

    public Petition(String petitionID, String petitionerID, String submissionDate, String status) {
        this.petitionID = petitionID;
        this.petitionerID = petitionerID;
        this.submissionDate = submissionDate;
        this.status = status;
    }

    public boolean createPetition() { return false; }

    public boolean updatePetitionID(String newPetitionID) { return false; }

    public boolean getPetitionerID() { return false; }
}
