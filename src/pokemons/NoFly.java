package pokemons;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Pokemon can't fly");
    }
}
