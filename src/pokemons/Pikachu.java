package pokemons;

public class Pikachu  extends Pokemon{
    public Pikachu(String name, int hp) {
        super(name, hp);
    }

    public Pikachu() {
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Electric");
    }
}
