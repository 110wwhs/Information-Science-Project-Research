package pokemons;

public class PokemonGame {
    public static void main(String[] args) {
//        Pokemon p1 = new Pokemon();
//        p1.info();

        Pikachu pika1 = new Pikachu("Pikachu", 50);
//        Squirtle s1 = new Squirtle("Squirtle", 70);
        Charizard c1 = new Charizard("Charizard", 150);
//        c1.setName("Charizard");
//        c1.setHp(150);
//        pika1.setFlyable(new NoFly());
//        c1.setFlyable(new Wings());
//        c1.performFlyable();
        pika1.performFlyable();

        Roket roket = new Roket();
        pika1.setFlyable(roket);
        pika1.performFlyable();

//        pika1.info();
//        s1.info();

//        pika1.attack(s1);
//        s1.attack(pika1);
//        c1.attack();
//        c1.attack(pika1);
//        c1.attack(s1);

//        Squirtle s1 = new Squirtle("Squirtle", 70);
//        Squirtle s2 = new Squirtle();
//        System.out.println(pika1.getName());
//        Pokemon p2 = new Pokemon("Squirtle", 70);
//        System.out.println(s1.getName());
//        s2.setName("Squirtle2");
//        s2.setHp(65);

//        Pokemon p1 = new Pokemon();
//        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
//        p1.setHp(50);
//        p1.setName("Pikachu");
//        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
//        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");

    }
}
