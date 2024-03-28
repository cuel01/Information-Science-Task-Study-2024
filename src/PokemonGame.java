import pokemons.*;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard c1 = new Charizard("liza", 1040);
        Pikachu p1 = new Pikachu("pokemon", 50);
//        p1.setFlyable(new NoFly());
//        c1.setFlyable(new Wings());
        p1.performFly();
        c1.performFly();
        Rocket rocket = new Rocket();
        p1.setFlyable(rocket);
        p1.performFly();
        /*Charizard c1=new Charizard();
        c1.setHp(1040);
        c1.setName("liza");
        Pikachu p1 = new Pikachu("Pikachu", 70);
        Squirtle s2 = new Squirtle("SQRT", 90);
        s2.attack(p1);
        p1.attack(s2);
        c1.attack();
        c1.attack(p1);
        c1.attack(s2);*/
    }
}
