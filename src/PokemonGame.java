class Pokemon{
    private String name;
    private int hp;

    public Pokemon() {
        System.out.println("default constructor!");
    }

    public Pokemon(String name, int hp) {
        name = name; // remove this keyword
        hp = hp; // remove this keyword
        System.out.println("parameter constructor~");
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
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon p2 = new Pokemon("Squirtle", 70);

        Pokemon p1 = new Pokemon();
        //p1.hp = 50;
        p1.setHp(50);
        p1.setName("Pikachu");
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        System.out.println(p2.getName() + "'s health is " + p2.getHp() + "."); // null's health is 0.
    }
}
