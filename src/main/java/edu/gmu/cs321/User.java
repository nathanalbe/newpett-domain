package edu.gmu.cs321;

public class User {
    private int id;
    
    public User() {
        this.id = id++;
        System.out.println("User created with id: " + id);
    }
}
