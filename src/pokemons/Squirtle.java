package pokemons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Squirtle extends Pokemon{
    public Squirtle() {
        System.out.println("Sqrrrrrrrt");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint=12;
        //this.skills = new String[]{"body slam", "water cannon", "hydro pump"};
        //this.skillPoints= new int[]{35, 40, 110};


        this.skills = new HashMap<>();
        skills.put(1, "body slam");
        skills.put(2, "water cannon");
        skills.put(3, "hydro pump");
        //this.skills.add("body slam");
        //this.skills.add("water cannon");
        //this.skills.add("hydro pump");

        this.skillPoints = new HashMap<>();
        skillPoints.put("body slam", 35);
        skillPoints.put("water cannon", 40);
        skillPoints.put("hydro pump", 110);
        //this.skillPoints.add(35);
        //this.skillPoints.add(40);
        //this.skillPoints.add(110);

        System.out.println("Sqrrrrrrrt");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Water");
    }

    @Override
    public void attack() {
        System.out.println("Wide area Water Cannon Attack!!!");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp()-(this.attackPoint+this.skillPoints.get(this.skills.get(s))));
        System.out.println(this.getName()+" attacks "+targetPokemon.getName()+" with a "+this.skills.get(s)+".");
        System.out.println("The health of the "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}
