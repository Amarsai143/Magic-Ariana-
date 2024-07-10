public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        if (health <= 0) {
            throw new IllegalArgumentException("Health must be a positive integer.");
        }
        if (strength <= 0) {
            throw new IllegalArgumentException("Strength must be a positive integer.");
        }
        if (attack <= 0) {
            throw new IllegalArgumentException("Attack must be a positive integer.");
        }
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public int attackDamage() {
        return this.attack * rollDice();
    }

    public int defenseStrength() {
        return this.strength * rollDice();
    }

    private int rollDice() {
    	int dice=(int)(Math.random() * 6) + 1;
    	System.out.println(this.name +" Rolls Dice with: "+dice);
        return dice;
    }

    public int getHealth() {
    	if(this.health<0)
    		return 0;
    	
        return this.health;
    }

    public String getName() {
        return this.name;
    }
}
