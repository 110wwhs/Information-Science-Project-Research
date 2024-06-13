package pokemons;
import java.util.HashMap;

public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("Pika Pika~");
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 15;

        this.skills = new HashMap<>();
        skills.put(1, "cheeks bulging");
        skills.put(2, "electric shock");
        skills.put(3, "100,000 volts");

        this.skillPoints = new HashMap<>();
        skillPoints.put("cheeks bulging", 20);
        skillPoints.put("electric shock", 40);
        skillPoints.put("100,000 volts", 90);

        System.out.println("Pika Pika~");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Electric");
    }

    @Override
    public void attack() {
        System.out.println("Wide area lightning attack-!");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints.get(this.skills.get(s))));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with " + this.skillPoints.get(this.skills.get(s)) + "!");
        System.out.println(targetPokemon.getName() + " got damage " + this.skillPoints.get(this.skills.get(s)) + this.attackPoint);
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with 100,000 volts!");
        System.out.println(targetPokemon.getName() + " got damage " + this.attackPoint);
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }
}
