package org.magicalarena.service;

import org.magicalarena.model.Arena;
import org.magicalarena.model.Player;

public class PlayService {
    private Arena arena;

    private int rollDice() {
        return arena.getRandom().nextInt(6) + 1;
    }

    private void performAttack(Player attacker, Player defender) {
        int attackRoll = rollDice();
        int defendRoll = rollDice();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defense = defender.getStrength() * defendRoll;

        int damageDealt = Math.max(0, attackDamage - defense);

        defender.setHealth(defender.getHealth() - damageDealt);

        System.out.println(attacker + " attacks " + defender + " with roll " + attackRoll + " causing " + damageDealt + " damage");
    }

    public Player fight() {
        var player1=arena.getPlayer1();
        var player2=arena.getPlayer2();

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
}
