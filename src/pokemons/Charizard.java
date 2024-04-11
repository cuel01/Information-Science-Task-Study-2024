package pokemons;

import java.util.ArrayList;

public class Charizard extends Pokemon{
    public Charizard() {
        System.out.println("Lizzzzzzzza");
    }

    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint=25;
        //this.skills = new String[]{"claw", "dragon's breath", "Flare Drive"};
        //this.skillPoints=new int[]{40, 60, 120};

        this.skills = new ArrayList<>();
        this.skills.add("claw");
        this.skills.add("dragon's breath");
        this.skills.add("Flare Drive");

        this.skillPoints = new ArrayList<>();
        this.skillPoints.add(40);
        this.skillPoints.add(60);
        this.skillPoints.add(120);

        System.out.println("Lizzzzzzzza");
    }

    @Override
    public void attack() {
        System.out.println("Wide area Fire Attack!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp()-(this.attackPoint+this.skillPoints.get(s)));
        System.out.println(this.getName()+" fires a "+this.skills.get(s)+" attack at "+targetPokemon.getName()+".");
        System.out.println("The health of the wild Pokemon "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}