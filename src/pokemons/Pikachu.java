package pokemons;

public class Pikachu extends Pokemon {
    public Pikachu() {
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type: Electric");
    }
}
