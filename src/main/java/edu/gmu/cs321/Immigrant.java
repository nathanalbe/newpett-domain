package edu.gmu.cs321;

public class Immigrant {
    private int id = 0;
    
    public Immigrant() {
        this.id = id++;
        System.out.println("Immigrant created with id: " + id);
    }
}
