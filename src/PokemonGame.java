class Pokemon{
    private String name;
    private int hp;

    public Pokemon() {  // default constructor
        System.out.println("default constructor!");
    }

    public Pokemon(String name, int hp) {  // parameter constructor
        this.name = name;
        this.hp = hp;
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
        Pokemon p2 = new Pokemon("Squirtle", 70);  // parameter constructor

        Pokemon p1 = new Pokemon();  // default consturctor
        //p1.hp = 50;  // hp has private access in Pokemon
        p1.setHp(50);
        p1.setName("Pikachu");
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
    }
}
