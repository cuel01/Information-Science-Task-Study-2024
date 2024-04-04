package pokemons;
public class Charizard extends Pokemon{
    public Charizard() {
        System.out.println("Lizzzzzzzza");
    }

    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        System.out.println("Lizzzzzzzza");
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