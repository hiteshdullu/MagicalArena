package org.magicalarena;

import org.magicalarena.model.Arena;
import org.magicalarena.model.Player;
import org.magicalarena.service.GameService;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameService gameService = new GameService();

        System.out.println("Enter details for Player A:");
        Player playerA = gameService.createPlayer(scanner);

        System.out.println("Enter details for Player B:");
        Player playerB = gameService.createPlayer(scanner);

        Arena arena = new Arena(playerA, playerB);
        Player winner = gameService.fight(arena);

        gameService.printWinner(winner, playerA, playerB);
    }
}
