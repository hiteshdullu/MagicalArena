# Magical Arena

## Overview
Magical Arena is a simple simulation of a turn-based combat game where two players fight in an arena until one player's health reaches zero. Each player is characterized by three attributes: health, strength, and attack.

## Game Mechanics
- Players take turns attacking each other.
- The attacking player rolls a 6-sided die to determine their attack damage.
- The defending player rolls a 6-sided die to determine their defense.
- The attack damage is calculated as: `attack * attackDieRoll`.
- The defense is calculated as: `strength * defenseDieRoll`.
- The defender's health is reduced by the difference between the attack damage and the defense.
- The game continues until one player's health reaches zero.

## Player Input
- Players' attributes (health, strength, and attack) are provided via user input at the start of the game.

## How to Run

### Prerequisites
- Java 8 or higher
- Maven

### Setup

1. **Clone the repository:**
    ```bash
    git clone <repository_url>
    cd MagicalArena
    ```

2. **Build the project using Maven:**
    ```bash
    mvn clean install
    ```

3. **Run the game:**
    ```bash
    mvn exec:java -Dexec.mainClass="com.magicalarena.Game"
    ```

4. **Run the tests:**
    ```bash
    mvn test
    ```

### Running the Game
Upon running the game, you will be prompted to enter the attributes for Player A and Player B:

