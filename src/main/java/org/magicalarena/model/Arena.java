package org.magicalarena.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter

public class Arena {
    private Player player1;
    private Player player2;
    private Random random;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }
}
