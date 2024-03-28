package pokemons;

public class Pikachu extends Pokemon {
    public Pikachu() {
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type: Electric");
    }

    @Override
    public void attack() {
        System.out.println("Wide area lightning attack!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with 100,000 volts!");
    }
}
