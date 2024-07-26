package org.magicalarena.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
    private int health;
    private int strength;
    private int attack;

    public boolean isAlive() {
        return health > 0;
    }


}
