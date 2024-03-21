class Pokemon{
    //private String m_name; //prefix
    private String name;
    private int hp;
    public Pokemon(){
        this.name="nameless";
        this.hp=10;
        System.out.println("default constructor!");
    }
    public Pokemon(String name, int hp) {  //default constructor
   // public Pokemon(String n, int h) {  //default constructor
        //name=name; //remove this keyword
        //hp=hp;

        //below code works, violate readability
        //name=n;
        //hp=h;

        //m_name=name;
        this.name=name;
        this.hp=hp;

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
        System.out.println(p1.getName()+"'s health is "+p1.getHp()+".");
        //p1.hp=50;     // hp has private access in Pokemon
        p1.setHp(60);
        p1.setName("PPiKKaCChu");
        System.out.println(p1.getName()+"'s health is "+p1.getHp()+".");
        System.out.println(p2.getName()+"'s health is "+p2.getHp()+"."); //null's hp is 0
    }
}
