package Polymorphism;

public class Character {
    private String name;
    private String specialMove;
    private int numberOfLives;



    //Default Constructor
    public Character(){
    }

    //Overloaded Constructor
    public Character(String name, String specialMove, int numberOfLives) {
        this.name = name;
        this.specialMove = specialMove;
        this.numberOfLives = numberOfLives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(String specialMove) {
        this.specialMove = specialMove;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }
}
