class Pokemon{
    private String name;
    private int hp;
    public Pokemon(){
        System.out.println("default constructor!");
    }
    public Pokemon(String name, int hp) {  //default constructor
        name=name;
        hp=hp;
        System.out.println("parameter constructor!");
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
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon p2 = new Pokemon("SQRT", 1000); //parameter constructor
        Pokemon p1 = new Pokemon(); //default constructor
        //p1.hp=50;     // hp has private access in Pokemon
        p1.setHp(60);
        p1.setName("PPiKKaCChu");
        System.out.println(p1.getName()+"'s health is "+p1.getHp()+".");
        System.out.println(p2.getName()+"'s health is "+p2.getHp()+"."); //null's hp is 0
    }
}
