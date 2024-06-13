package pokemons;

import java.util.*;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 25;
//        this.skills = new String[]{"claw", "dragon's breath", "flare drive"};
//        this.skillPoints = new Integer[]{20, 40, 90};

        this.skills = new HashMap<>();
        skills.put(1, "claw");
        skills.put(2, "dragon's breath");
        skills.put(3, "flare drive");

        this.skillPoints = new HashMap<>();
        skillPoints.put("claw", 20);
        skillPoints.put("dragon's breath", 40);
        skillPoints.put("flare drive", 90);

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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints.get(this.skills.get(s))));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with " + this.skills.get(s) + "!");
        System.out.println(targetPokemon.getName() + " got damage " + (this.skillPoints.get(this.skills.get(s)) + this.attackPoint));
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
