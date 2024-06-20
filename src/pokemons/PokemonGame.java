package pokemons;

import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    static Pokemon wildPokemon;
    public static void produceEnemyPokemon(){
        Random random = new Random();
        //random.setSeed(32);

        System.out.println("A wild Pokémon has appeared.");
        int select = random.nextInt(4);
        wildPokemon = switch (select){
            case 0 -> new Pikachu("Pikachu", 50);
            case 1 -> new Squirtle("Squirtle", 55);
            case 2 -> new Charizard("Charizard", 74);
            default -> new Pikachu("Pikachu", 50);
        };
    }
    public static void main(String[] args) {
//        Random random = new Random();
//        random.setSeed(32);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemonster. 1) Pikachu(default)  2) Squirtle  3) Charizard : ");
        int select = scanner.nextInt();

//        Pokemon playerPokemon;
//        if(select == 1)
//            playerPokemon = new Pikachu("Pikachu", 50);
//        else if (select == 2)
//            playerPokemon = new Squirtle("Squirtle", 55);
//        else if (select == 3)
//            playerPokemon = new Charizard("Charizard", 74);
//        else
//            playerPokemon = new Pikachu("Pikachu", 50);  // default

        Pokemon playerPokemon = switch (select){
            case 1 -> new Pikachu("Pikachu", 50);
            case 2 -> new Squirtle("Squirtle", 55);
            case 3 -> new Charizard("Charizard", 74);
            default -> new Pikachu("Pikachu", 50);
        };

        // enemyPokemon
        produceEnemyPokemon();

        while(true){
            System.out.print("1) Battle  2) Run away  3) Quit : ");
            int menu = scanner.nextInt();
            if(menu == 3){
                System.out.println("Exit the program...");
                break;
            } else if (menu == 1) {
                //System.out.print("\t1) " + playerPokemon.skills[0] + "  2) " + playerPokemon.skills[1] + "  3) " + playerPokemon.skills[2] + "  : ");
                //System.out.print("\t1) " + playerPokemon.skills.get(0) + "  2) " + playerPokemon.skills.get(1) + "  3) " + playerPokemon.skills.get(2) + "  : ");
//                for(String skill : playerPokemon.getSkills())
//                    System.out.println(skill);

                //System.out.print("\t1) " + playerPokemon.skills.get(1) + "  2) " + playerPokemon.skills.get(2) + "  3) " + playerPokemon.skills.get(3) + "  : ");
//                for(Map.Entry<Integer, String> mapSkill : playerPokemon.getSkills().entrySet())
//                    System.out.println(mapSkill.getKey() + ")" + mapSkill.getValue());

                playerPokemon.getSkills().forEach((k, v) -> System.out.println(k + ")" + v));
                playerPokemon.attack(wildPokemon, scanner.nextInt());
                System.out.println("=====================");
                Random random = new Random();
                wildPokemon.attack(playerPokemon, random.nextInt(3)+1);
            } else if (menu == 2) {
                System.out.println("The player's Pokémon runs away.");
                playerPokemon.performFly();
                produceEnemyPokemon();
            }
        }
    }
}