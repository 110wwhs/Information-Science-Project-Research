package pokemons;

import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(32);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your {Pokemonster. 1) Pikachu(default)  2) Squirtle  3) Charizard : ");
        int select = scanner.nextInt();

        Pokemon playerPokemon, wildPokemon;
        if(select == 1)
            playerPokemon = new Pikachu();
        else if (select == 2)
            playerPokemon = new Squirtle();
        else if (select == 3)
            playerPokemon = new Charizard();
        else
            playerPokemon = new Pikachu(); // default

        System.out.println("A wild Pokémon has appeared.");
        select = random.nextInt(3);
        if(select == 0)
            wildPokemon = new Pikachu("Pikachu", 50);
        else if (select == 1)
            wildPokemon = new Squirtle("Squirtle", 55);
        else if (select == 2)
            wildPokemon = new Charizard("Charizard", 74);
        else
            wildPokemon = new Pikachu("Pikachu", 50);


        while(true){
            System.out.print("1) Battle 2) Run away 3) Quit");
            int menu = scanner.nextInt();
            if (menu == 3){
                System.out.println("Exit the Game");
                break;
            } else if (menu == 2){
                System.out.println("You ran away from the battle.");
            } else if (menu == 1){
                playerPokemon.attack(wildPokemon);
            }
        }
    }
}