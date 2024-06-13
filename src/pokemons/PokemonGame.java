package pokemons;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    static Pokemon wildPokemon;
    public static void produceEnemyPokemon(){
        Random random = new Random();
        //random.setSeed(32);

        System.out.println("A wild Pokémon has appeared.");
        int select = random.nextInt(3);
        if(select == 0)
            wildPokemon = new Pikachu("Pikachu", 50);
        else if (select == 1)
            wildPokemon = new Squirtle("Squirtle", 55);
        else if (select == 2)
            wildPokemon = new Charizard("Charizard", 74);
        else
            wildPokemon = new Pikachu("Pikachu", 50);
    }
    public static void main(String[] args) {
//        Random random = new Random();
//        random.setSeed(32);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your Pokemonster. 1) Pikachu(default)  2) Squirtle  3) Charizard : ");
        int select = scanner.nextInt();

        Pokemon playerPokemon;
        if(select == 1)
            playerPokemon = new Pikachu("Pikachu", 50);
        else if (select == 2)
            playerPokemon = new Squirtle("Squirtle", 55);
        else if (select == 3)
            playerPokemon = new Charizard("Charizard", 74);
        else
            playerPokemon = new Pikachu("Pikachu", 50);  // default

        // enemyPokemon Produce
        produceEnemyPokemon();

        while(true){
            System.out.print("1) Battle  2) Run away  3) Quit : ");
            int menu = scanner.nextInt();
            if(menu == 3){
                System.out.println("Exit the program...");
                break;
            } else if (menu == 1) {
//                System.out.print("\t1) " + playerPokemon.skills.get(1) + "  2) " + playerPokemon.skills.get(2) + "  3) " + playerPokemon.skills.get(3) + "  : ");
//                int skill = scanner.nextInt();

                for(Map.Entry<Integer, String> mapSill : playerPokemon.skills.entrySet()) {
                    System.out.println(mapSill.getKey() + ") " + mapSill.getValue());
                }

                playerPokemon.attack(wildPokemon, scanner.nextInt());
                System.out.println("=====================");
                wildPokemon.attack(playerPokemon, scanner.nextInt());
            } else if (menu == 2) {
                System.out.println("The player's Pokémon runs away.");
                playerPokemon.performFly();
                produceEnemyPokemon();
            }
        }
    }
}