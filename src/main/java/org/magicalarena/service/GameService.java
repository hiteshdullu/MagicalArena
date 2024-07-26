package org.magicalarena.service;

import org.magicalarena.model.Arena;
import org.magicalarena.model.Player;

import java.util.Random;

public class GameService {
    private Random random;

    public GameService() {
        this.random = new Random();
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    public void performAttack(Player attacker, Player defender) {
        int attackRoll = rollDice();
        int defendRoll = rollDice();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defense = defender.getStrength() * defendRoll;

        int damageDealt = Math.max(0, attackDamage - defense);

        defender.setHealth(defender.getHealth() - damageDealt);

        System.out.println(attacker + " attacks " + defender + " with roll " + attackRoll + " causing " + damageDealt + " damage");
    }

    public Player fight(Arena arena) {
        Player player1 = arena.getPlayer1();
        Player player2 = arena.getPlayer2();

        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() <= player2.getHealth()) {
                performAttack(player1, player2);
                if (!player2.isAlive()) break;
                performAttack(player2, player1);
            } else {
                performAttack(player2, player1);
                if (!player1.isAlive()) break;
                performAttack(player1, player2);
            }
        }
        return player1.isAlive() ? player1 : player2;
    }

    public void printWinner(Player winner, Player player1, Player player2) {
        String winnerName = (winner == player1) ? "Player A" : "Player B";
        System.out.println("The winner is: " + winnerName);
    }

}

