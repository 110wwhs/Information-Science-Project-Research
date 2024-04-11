package pokemons;

import java.util.ArrayList;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 25;
//        this.skills = new String[]{"claw", "dragon's breath", "flare drive"};
//        this.skillPoints = new Integer[]{20, 40, 90};

        this.skills = new ArrayList<>();
        this.skills.add("claw");
        this.skills.add("dragon's breath");
        this.skills.add("flare drive");

        this.skillPoints = new ArrayList<>();
        this.skillPoints.add(20);
        this.skillPoints.add(40);
        this.skillPoints.add(90);

        System.out.println("Riza~~");
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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints.get(s)));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with " + this.skills.get(s) + "!");
        System.out.println(targetPokemon.getName() + " got damage " + (this.skillPoints.get(s) + this.attackPoint));
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
