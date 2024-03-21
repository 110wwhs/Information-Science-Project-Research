import pokemons.Pokemon;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon p2 = new Pokemon("Squirtle", 70);

        Pokemon p1 = new Pokemon();
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        //p1.hp = 50;
        p1.setHp(50);
        p1.setName("Pikachu");
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");

    }
}
