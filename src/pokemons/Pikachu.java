package pokemons;

public class Pikachu  extends Pokemon{
    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
    }

    public Pikachu() {
        System.out.println("Pika Pika");
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
        System.out.println(this.getName()+" makes a lightning attack at "+targetPokemon.getName()+".");
    }
}
