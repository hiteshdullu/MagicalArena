package org.magicalarena.model;

public class Arena {
    private Player player1;
    private Player player2;

    // Constructor
    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // Getter and Setter for player1
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    // Getter and Setter for player2
    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
