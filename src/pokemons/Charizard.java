package pokemons;
public class Charizard extends Pokemon{
    public Charizard() {
        System.out.println("Lizzzzzzzza");
    }

    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint=25;
        this.skills = new String[]{"claw", "dragon's breath", "Flare Drive"};
        this.skillPoints=new int[]{40, 60, 120};
        System.out.println("Lizzzzzzzza");
    }

    @Override
    public void attack() {
        System.out.println("Wide area Fire Attack!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp()-(this.attackPoint+this.skillPoints[s]));
        System.out.println(this.getName()+" fires a "+this.skills[s]+" attack at "+targetPokemon.getName()+".");
        System.out.println("The health of the wild Pokemon "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}