package pokemons;

import java.util.List;
import java.util.Map;

public abstract class  Pokemon{
    private String name;
    private int hp;
    protected int attackPoint;
    //protected String[] skills;
    //protected int[] skillPoints;
//    protected List<String> skills;
//    protected List<Integer> skillPoints;
    protected Map<Integer, String> skills;
    Flyable flyable;
    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
    public void performFly(){
        System.out.print(this.getName());
        this.flyable.fly();
    }
    public Pokemon(){
        this.name="nameless";
        this.hp=10;
    }
    public Pokemon(String name, int hp) {
        this.name=name;
        this.hp=hp;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void info(){
        System.out.println("Name : "+getName());
        System.out.println("Hp : "+getHp());
    }
    public  abstract void attack();
    public  abstract void attack(Pokemon targetPokemon, int s);

    //public abstract void fly();
}