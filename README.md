# Magical Arena

## Overview
This project implements a simple simulation of a magical arena where two players can fight matches. Each player is defined by attributes such as health, strength, and attack. Players take turns attacking and defending until one player's health reaches zero.

## Features
- Players attack in turns.
- Attacking player rolls an attacking dice, and the defending player rolls a defending dice.
- Attack damage is calculated as `attack value * attacking dice roll`.
- Defense strength is calculated as `strength value * defending dice roll`.
- Excess attack damage reduces the defender's health.
- Game ends when any player's health reaches zero.
- Players with lower health attack first at the start of a match.
- Input validation for player attributes to ensure positive integers.

## Prerequisites
- Java Development Kit (JDK) installed (version 8 or higher).
- JUnit 5 for running unit tests.

## How to Run
1. **Compile the Java files:**
    ```sh
    javac *.java
    ```

2. **Run the program:**
    ```sh
    java Main
    ```

3. **Input Player Details:**
    - Enter name for Player A.
    - Enter health for Player A (positive integer).
    - Enter strength for Player A (positive integer).
    - Enter attack for Player A (positive integer).
    - Repeat the same steps for Player B.

4. **Game Output:**
    - The game will display the match's progress and the final result.

## Example Run
