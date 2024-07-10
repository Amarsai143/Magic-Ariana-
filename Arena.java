public class Arena {
    private Player playerA;
    private Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }


    public void startMatch() {
        Player attacker = determineFirstAttacker();
        Player defender = (attacker == playerA) ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            takeTurn(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("Match Over! Winner: " + (playerA.isAlive() ? playerA.getName() : playerB.getName()));
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackDamage = attacker.attackDamage();
        int defenseStrength = defender.defenseStrength();
        int damage = attackDamage - defenseStrength;

        if (damage > 0) {
            defender.takeDamage(damage);
        }

        System.out.println(attacker.getName() + " attacks " + defender.getName() +
                " | Attack Damage: " + attackDamage + " | "+defender.getName()+"'s Strength: " + defenseStrength +
                " | " + defender.getName() + "'s Health: " + defender.getHealth());
    }
    private Player determineFirstAttacker() {
    	Player firstPlayer = (playerA.getHealth() <= playerB.getHealth()) ? playerA : playerB;
    	System.out.println("First Attacker =>"+firstPlayer.getName()+"    Health->"+firstPlayer.getHealth());
        return firstPlayer;
    }
}
