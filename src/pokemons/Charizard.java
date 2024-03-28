package pokemons;

public class Charizard extends Pokemon implements Flyable{
    @Override
    public void attack() {
        System.out.println("Wide area fire attack!");

    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with flamethrower!");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " start to fly in the sky!");
    }
}
