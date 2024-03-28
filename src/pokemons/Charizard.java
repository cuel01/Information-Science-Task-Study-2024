package pokemons;

public class Charizard extends Pokemon implements Flyable{

    @Override
    public void attack() {
        System.out.println("Wide area Fire Attack!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName()+" fires a flamethrower attack at "+targetPokemon.getName()+".");
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+" flies ");
    }
}
