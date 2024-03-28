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

    @Override
    public void attack() {
        System.out.println("Wide area Lightning Flash!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println("Attacks " + targetPokemon.getName()+" with 100,000 volts of electricity");
    }
}
