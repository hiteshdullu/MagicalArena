package org.magicalarena;

import org.magicalarena.model.Arena;
import org.magicalarena.model.Player;
import org.magicalarena.service.GameService;

public class GameMain {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        GameService gameService = new GameService();
        Player winner = gameService.fight(arena);

        gameService.printWinner(winner, playerA, playerB);
    }
}
