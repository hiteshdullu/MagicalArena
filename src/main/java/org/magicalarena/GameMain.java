package org.magicalarena;

import org.magicalarena.model.Arena;
import org.magicalarena.model.Player;
import org.magicalarena.service.PlayService;

public class GameMain {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        PlayService gameService = new PlayService();
        Player winner = gameService.fight(arena);

        System.out.println("The winner is: " + winner);
    }
}
