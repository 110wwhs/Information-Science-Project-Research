package pokemons;

public class Squirtle extends Pokemon{
    public Squirtle() {
        System.out.println("Crrrrrrr-");
        this.attackPoint = 12;
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 12;
        this.skills = new String[] {"body slam", "water cannon", "hydro pump"};
        this.skillPoints = new Integer[] {35,40,110};
        System.out.println("Crrrrrrr-");
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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints[s]));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with " + this.skills[s] + "!");
        System.out.println(targetPokemon.getName() + " got damage " + (this.skillPoints[s] + this.attackPoint));
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
