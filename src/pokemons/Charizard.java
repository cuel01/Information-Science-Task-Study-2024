package pokemons;

public class Charizard extends Pokemon{

    public Charizard(String name, int hp, Flyable fly) {
        super(name, hp);
        super.setFlyable(fly);
    }

    @Override
    public void attack() {
        System.out.println("Wide area Fire Attack!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName()+" fires a flamethrower attack at "+targetPokemon.getName()+".");
    }
}
