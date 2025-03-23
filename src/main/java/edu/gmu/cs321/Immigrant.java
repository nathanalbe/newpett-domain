package edu.gmu.cs321;

public class Immigrant {
    private int userID = 0;
    private String name;
    private String birthdate;
    private String address;
    private String email;

    
    public Immigrant(String name, String birthdate, String address, String email) {
        this.userID = userID++;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.email = email;
        System.out.println("Immigrant created with id: " + userID);
    }

     // Create new immigrant instance (will return false for now)
     public boolean createImmigrant() {
        return false;  // placeholder for TDD
    }

    // Update an immigrant's information
    public boolean updateImmigrant(String address, String email) {
        return false;  // placeholder
    }

    // Get immigrant object (simulate retrieval by userID)
    public Immigrant getImmigrantByID(int userID) {
        return null;  // placeholder
    }
}
