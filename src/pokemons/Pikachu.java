package pokemons;
import java.util.ArrayList;

public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("Pika Pika~");
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 15;

//        this.skills = new String[]{"cheeks bulging", "electric shock", "100,000 volts"};
//        this.skillPoints = new Integer[]{20, 40, 90};

        this.skills = new ArrayList<>();
        this.skills.add("cheeks bulging");
        this.skills.add("electric shock");
        this.skills.add("100,000 volts");

        this.skillPoints = new ArrayList<>();
        this.skillPoints.add(20);
        this.skillPoints.add(40);
        this.skillPoints.add(90);

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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints.get(s)));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with " + this.skills.get(s) + "!");
        System.out.println(targetPokemon.getName() + " got damage " + (this.skillPoints.get(s) + this.attackPoint));
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
