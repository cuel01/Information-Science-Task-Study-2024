package pokemons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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

//        this.skills = new ArrayList<>(
//                Arrays.asList("claw", "dragon's breath", "Flare Drive")
//        );
        this.skills = new HashMap<>();
        skills.put(1, "claw");
        skills.put(2, "dragon's breath");
        skills.put(3, "Flare Drive");

//        this.skills.add("claw");
//        this.skills.add("dragon's breath");
//        this.skills.add("Flare Drive");

//        this.skillPoints = new ArrayList<>(
//                Arrays.asList(40, 60, 90)
//        );
        this.skillPoints = new HashMap<>();
        skillPoints.put("claw", 40);
        skillPoints.put("dragon's breath", 60);
        skillPoints.put("Flare Drive", 120);

//        this.skillPoints.add(40);
//        this.skillPoints.add(60);
//        this.skillPoints.add(120);

        System.out.println("Lizzzzzzzza");
    }

    @Override
    public void attack() {
        System.out.println("Wide area Fire Attack!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp()-(this.attackPoint+this.skillPoints.get(this.skills.get(s))));
        System.out.println(this.getName()+" fires a "+this.skills.get(s)+" attack at "+targetPokemon.getName()+".");
        System.out.println("The health of the "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}