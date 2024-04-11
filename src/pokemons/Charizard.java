package pokemons;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 20;
        this.skills = new String[] {"Claw", "dragon's breath", "Flare Drive"};
        this.skillPoints = new Integer[] {20,60,120};
        System.out.println("Rizar--!");
    }

    public Charizard() {
        System.out.println("Rizar--!");
        this.attackPoint = 20;
    }

    @Override
    public void attack() {
        System.out.println("Wide area fire attack!");

    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints[s]));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with " + this.skills[s] + "!");
        System.out.println(targetPokemon.getName() + " got damage " + (this.skillPoints[s] + this.attackPoint));
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with flamethrower!");
        System.out.println(targetPokemon.getName() + " got damage " + this.attackPoint);
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }

}
