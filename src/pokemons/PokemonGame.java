package pokemons;

import pokemons.*;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    static Pokemon wildPokemon;
    public static void produceEnemyPokemon(){
        Random random = new Random();

        System.out.println("A wild Pokemon has BBaBBam");

        wildPokemon = switch (random.nextInt(3)){
            case 0->new Pikachu("Pika", 59);
            case 1->new Squirtle("sqrt", 66);
            case 2->new Charizard("liza", 100);
            default ->new Pikachu("Pika", 59);
        };
    }
    public static void main(String[] args) {

        Random random = new Random();
        //random.setSeed(1023);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemonster. 1) Pikachu(default) 2) SQRT 3) Charizard : ");
        int select =scanner.nextInt();

        //Pokemon playerPokemon;
        //if(select==1) playerPokemon = new Pikachu("Pika", 59);
        //else if (select==2) playerPokemon = new Squirtle("sqrt", 66);
        //else if (select==3) playerPokemon = new Charizard("liza", 100);
        //else playerPokemon = new Pikachu("Pika", 29); // default
        Pokemon playerPokemon = switch (select){
            case 1->new Pikachu("Pika", 59);
            case 2->new Squirtle("sqrt", 66);
            case 3->new Charizard("liza", 100);
            default ->new Pikachu("Pika", 59);
        };

        // enemyPokemon11
        produceEnemyPokemon();

        while (true) {
            System.out.print("1) Battle 2) Run away 3) Quit : ");
            int menu = scanner.nextInt();
            if (menu==3) {
                System.out.println("Exit the program...");
                break;
            } else if (menu==1){
                //System.out.print("\t1) "+playerPokemon.skills.get(1)+" 2) "+playerPokemon.skills.get(2)+" 3) "+playerPokemon.skills.get(3)+" : ");
   //             for(Map.Entry<Integer, String> mapSkill: playerPokemon.getSkills().entrySet()){
     //               System.out.print(mapSkill.getKey()+") 2"+mapSkill.getValue()+" ");
       //         }
                playerPokemon.getSkills().forEach((k, v) -> System.out.print(k+") "+v+" "));
                System.out.print(" : ");
                int skill = scanner.nextInt();
                playerPokemon.attack(wildPokemon, skill);
                System.out.println("================");
                skill = random.nextInt(3)+1;
                wildPokemon.attack(playerPokemon, skill);
            } else if (menu==2){
                System.out.println("your pokemon run away");
                playerPokemon.performFly();
                produceEnemyPokemon();
            }
        }
    }
}
