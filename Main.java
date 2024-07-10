import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("WELCOME TO Magical ARENA");
        Scanner scanner = new Scanner(System.in);

        Player playerA = createPlayer(scanner, "A");
        Player playerB = createPlayer(scanner, "B");

        Arena arena = new Arena(playerA, playerB);
        arena.startMatch();

        scanner.close();
    }

    private static Player createPlayer(Scanner scanner, String playerLabel) {
        String name;
        int health = 0, strength = 0, attack = 0;

        System.out.println("Enter name for Player " + playerLabel + ": ");
        name = scanner.nextLine();

    
        while (true) {
            System.out.println("Enter health for Player " + playerLabel + " (positive integer): ");
            if (scanner.hasNextInt()) {
                health = scanner.nextInt();
                if (health > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Health must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }

        
        while (true) {
            System.out.println("Enter strength for Player " + playerLabel + " (positive integer): ");
            if (scanner.hasNextInt()) {
                strength = scanner.nextInt();
                if (strength > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Strength must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }

     
        while (true) {
            System.out.println("Enter attack for Player " + playerLabel + " (positive integer): ");
            if (scanner.hasNextInt()) {
                attack = scanner.nextInt();
                if (attack > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Attack must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }

        scanner.nextLine();

        return new Player(name, health, strength, attack);
    }
}
