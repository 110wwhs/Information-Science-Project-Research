package pokemons;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 20;
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
    public void attack(Pokemon targetPokemon) {
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with flamethrower!");
        System.out.println(targetPokemon.getName() + " got damage " + this.attackPoint);
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }

}
