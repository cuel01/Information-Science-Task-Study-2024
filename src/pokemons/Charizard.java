package pokemons;
public class Charizard extends Pokemon{
    public Charizard() {
        System.out.println("Lizzzzzzzza");
    }

    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint=25;
        System.out.println("Lizzzzzzzza");
    }

    @Override
    public void attack() {
        System.out.println("Wide area Fire Attack!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        targetPokemon.setHp(targetPokemon.getHp()-this.attackPoint);
        System.out.println(this.getName()+" fires a flamethrower attack at "+targetPokemon.getName()+".");
        System.out.println("The health of the wild Pokemon "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}