package pokemons;

public class Squirtle extends Pokemon{
    public Squirtle() {
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type: Water");
    }

    @Override
    public void attack() {
        System.out.println("Wide area water Cannon attack!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with Water cannon!");
    }
}
