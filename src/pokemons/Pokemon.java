package pokemons;

public abstract class Pokemon{
    private String name;
    private int hp;
    protected int attackPoint;

    protected String[] skills;
    protected Integer[] skillPoints;

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