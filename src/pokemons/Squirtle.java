package pokemons;
import java.util.ArrayList;

public class Squirtle extends Pokemon{
    public Squirtle() {
        System.out.println("Crrrrrrrr~");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 12;
//        this.skills = new String[]{"body slam", "water canon", "hydro pump"};
//        this.skillPoints = new Integer[]{35, 40, 110};

        this.skills = new ArrayList<>();
        this.skills.add("body slam");
        this.skills.add("water canon");
        this.skills.add("hydro pump");

        this.skillPoints = new ArrayList<>();
        this.skillPoints.add(35);
        this.skillPoints.add(40);
        this.skillPoints.add(110);

        System.out.println("Crrrrrrrr~");
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
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints.get(s)));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with " + this.skills.get(s) + "!");
        System.out.println(targetPokemon.getName() + " got damage " + (this.skillPoints.get(s) + this.attackPoint));
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with Water cannon!");
        System.out.println(targetPokemon.getName() + " got damage " + this.attackPoint);
        System.out.println(targetPokemon.getName() + " HP: " + targetPokemon.getHp() + "!");
    }
}
