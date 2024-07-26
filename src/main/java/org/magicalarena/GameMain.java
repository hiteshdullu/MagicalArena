package org.magicalarena;

import org.magicalarena.model.Arena;
import org.magicalarena.model.Player;
import org.magicalarena.service.GameService;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Player A:");
        Player playerA = createPlayer(scanner);

        System.out.println("Enter details for Player B:");
        Player playerB = createPlayer(scanner);

        Arena arena = new Arena(playerA, playerB);
        GameService gameService = new GameService();
        Player winner = gameService.fight(arena);

        gameService.printWinner(winner, playerA, playerB);
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.print("Enter health: ");
        int health = scanner.nextInt();

        System.out.print("Enter strength: ");
        int strength = scanner.nextInt();

        System.out.print("Enter attack: ");
        int attack = scanner.nextInt();

        return new Player(health, strength, attack);
    }
}
