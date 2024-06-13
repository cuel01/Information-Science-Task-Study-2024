package pokemons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Pikachu  extends Pokemon{
    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 15;

        //this.skills = new String[]{"cheeks bulging", "electric shock", "100,000 volts"};
        //this.skillPoints=new int[]{20, 40, 90};

 //       this.skills = new ArrayList<>(
 //               Arrays.asList("cheeks bulging", "electric shock", "100,000 volts")
 //       );
        this.skills = new HashMap<>();
        skills.put(1, "cheeks bulging");
        skills.put(2, "electric shock");
        skills.put(3, "100,000 volts");
        //this.skills.add("cheeks bulging");
        //this.skills.add("electric shock");
        //this.skills.add("100,000 volts");

        this.skillPoints = new HashMap<>();
        skillPoints.put("cheeks bulging", 20);
        skillPoints.put("electric shock", 40);
        skillPoints.put("100,000 volts", 90);
        //this.skillPoints = new ArrayList<>(
        //        Arrays.asList(20, 40, 90)
        //);
        //this.skillPoints.add(20);
        //this.skillPoints.add(40);
        //this.skillPoints.add(90);

        System.out.println("Pika Pika");
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
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp()-(this.attackPoint+this.skillPoints.get(s)));
        System.out.println(this.getName()+" makes a "+this.skills.get(s)+" at "+targetPokemon.getName()+".");
        System.out.println("The health of the "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}
