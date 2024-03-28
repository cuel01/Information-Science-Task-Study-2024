import pokemons.Charizard;
import pokemons.Pikachu;
import pokemons.Pokemon;
import pokemons.Squirtle;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard c1=new Charizard();
        c1.setHp(1040);
        c1.setName("liza");
        Pikachu p1 = new Pikachu("Pikachu", 70);
        Squirtle s2 = new Squirtle("SQRT", 90);
        c1.fly();
        s2.attack(p1);
        p1.attack(s2);
        c1.attack();
        c1.attack(p1);
        c1.attack(s2);
    }
}
