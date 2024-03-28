import pokemons.Pikachu;
import pokemons.Pokemon;
import pokemons.Squirtle;

public class PokemonGame {
    public static void main(String[] args) {
        Pikachu p1 = new Pikachu("Pikachu", 70);
        Squirtle s2 = new Squirtle("SQRT", 90);
        s2.attack(p1);
        p1.attack(s2);
    }
}
