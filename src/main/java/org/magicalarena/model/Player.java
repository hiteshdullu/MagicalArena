package org.magicalarena.model;

public class Player {
    private int health;
    private int strength;
    private int attack;

    // Constructor
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter for strength
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Getter and Setter for attack
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // Method to check if the player is alive
    public boolean isAlive() {
        return health > 0;
    }
}
