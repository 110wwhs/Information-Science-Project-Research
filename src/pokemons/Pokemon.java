package pokemons;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public abstract class Pokemon{
    private int hp;
    protected int attackPoint;

    // protected ArrayList<String> skills; // Parameterize the ArrayList with the type String
    // protected List<Integer> skillPoints;

    protected HashMap<String, Integer> skills;

    Flyable flyable;  // has-a

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.getName());
        this.flyable.fly();
    }

    public Pokemon() {
        this.name = "nameless";
        this.hp = 10;
        //System.out.println("default constructor!");
    }

    private String name; // Declare the 'name' variable

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
        //System.out.println("parameter constructor~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void info(){
        System.out.println("Name : " + getName());
        System.out.println("HP : " + getHp());
    }

    public abstract void attack();
    public abstract void attack(Pokemon targetPokemon, int skill);

    public abstract void attack(Pokemon targetPokemon);

    //public abstract void fly();
}