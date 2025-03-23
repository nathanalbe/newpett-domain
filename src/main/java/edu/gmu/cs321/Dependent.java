package edu.gmu.cs321;

public class Dependent extends Immigrant{
    private String relationship; 

    public Dependent(String name, String birthdate, String address, String email, String relationship) {
        super(name, birthdate, address, email);
        this.relationship = relationship;
    }

}
