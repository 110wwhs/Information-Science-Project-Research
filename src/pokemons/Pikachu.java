package pokemons;

public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("Pika-!");
        this.attackPoint = 15;
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 15;
        System.out.println("Pika-!");
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
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with 100,000 volts!");
        System.out.println(targetPokemon.getName() + " got damage " + this.attackPoint);
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }
}
