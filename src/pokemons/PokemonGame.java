package pokemons;

import pokemons.*;

import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    static Pokemon wildPokemon;
    public static void produceEnemyPokemon(){
        Random random = new Random();

        System.out.println("A wild Pokemon has BBaBBam");
        int select = random.nextInt(3);
        if(select==0) wildPokemon = new Pikachu("Pika", 59);
        else if (select==1) wildPokemon = new Squirtle("sqrt", 66);
        else if (select==2) wildPokemon = new Charizard("liza", 100);
        else wildPokemon = new Pikachu("Pika", 29); // default

    }
    public static void main(String[] args) {

        Random random = new Random();
        //random.setSeed(1023);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemonster. 1) Pikachu(default) 2) SQRT 3) Charizard : ");
        int select =scanner.nextInt();

        Pokemon playerPokemon;
        if(select==1) playerPokemon = new Pikachu("Pika", 59);
        else if (select==2) playerPokemon = new Squirtle("sqrt", 66);
        else if (select==3) playerPokemon = new Charizard("liza", 100);
        else playerPokemon = new Pikachu("Pika", 29); // default

        // enemyPokemon11
        produceEnemyPokemon();

        while (true) {
            System.out.print("1) Battle 2) Run away 3) Quit : ");
            int menu = scanner.nextInt();
            if (menu==3) {
                System.out.println("Exit the program...");
                break;
            } else if (menu==1){
                System.out.print("\t1) "+playerPokemon.skills.get(0)+" 2) "+playerPokemon.skills.get(1)+" 3) "+playerPokemon.skills.get(2)+" : ");
                int skill = scanner.nextInt()-1;
                playerPokemon.attack(wildPokemon, skill);
                System.out.println("================");
                skill = random.nextInt(3);
                wildPokemon.attack(playerPokemon, skill);
            } else if (menu==2){
                System.out.println("your pokemon run away");
                playerPokemon.performFly();
                produceEnemyPokemon();
            }
        }
    }
}
