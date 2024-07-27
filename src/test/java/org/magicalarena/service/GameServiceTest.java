package org.magicalarena.service;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.magicalarena.model.Arena;
import org.magicalarena.model.Player;

class GameServiceTest {
    @Test
    void testPerformAttack() {
        // Arrange
        GameService gameService = new GameService();
        Player attacker = new Player(1, 1, 1);

        // Act
        gameService.performAttack(attacker, new Player(1, 1, 1));
    }

    @Test
    void testFight() {
        // Arrange
        GameService gameService = new GameService();
        Player player1 = new Player(1, 1, 1);

        Player player2 = new Player(1, 1, 1);

        Arena arena = new Arena(player1, player2);

        // Act
        gameService.fight(arena);

        // Assert
        assertSame(player1, arena.getPlayer1());
        assertSame(player2, arena.getPlayer2());
    }

    @Test
    void testFight2() {
        // Arrange
        GameService gameService = new GameService();

        Player player1 = new Player(1, 1, 1);
        player1.setHealth(1);

        Player player2 = new Player(1, 1, 1);
        player2.setHealth(0);
        Player player12 = new Player(1, 1, 1);

        Arena arena = new Arena(player12, new Player(1, 1, 1));
        arena.setPlayer1(player1);
        arena.setPlayer2(player2);

        // Act
        Player actualFightResult = gameService.fight(arena);

        // Assert
        assertSame(player1, arena.getPlayer1());
        assertSame(player1, actualFightResult);
    }


    @Test
    void testFight3() {
        // Arrange
        GameService gameService = new GameService();

        Player player1 = new Player(1, 1, 1);
        player1.setHealth(1);

        Player player2 = new Player(1, 1, 1);
        player2.setHealth(1);
        Player player12 = new Player(1, 1, 1);

        Arena arena = new Arena(player12, new Player(1, 1, 1));
        arena.setPlayer1(player1);
        arena.setPlayer2(player2);

        // Act
        gameService.fight(arena);

        // Assert
        assertSame(player1, arena.getPlayer1());
        assertSame(player2, arena.getPlayer2());
    }

    @Test
    void testFight4() {
        // Arrange
        GameService gameService = new GameService();
        Player player1 = new Player(1, 1, 1);

        Player player2 = new Player(6, 1, 1);

        Arena arena = new Arena(player1, player2);

        // Act
        Player actualFightResult = gameService.fight(arena);

        // Assert
        assertSame(player1, arena.getPlayer1());
        assertSame(player2, actualFightResult);

    }

    @Test
    void testPrintWinner() {
        // Arrange
        GameService gameService = new GameService();
        Player winner = new Player(1, 1, 1);

        Player player1 = new Player(1, 1, 1);

        // Act
        gameService.printWinner(winner, player1, new Player(1, 1, 1));
    }

    @Test
    void testNewGameService() {
        // Arrange and Act
        new GameService();
    }
}
