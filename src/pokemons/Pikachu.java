package pokemons;

public class Pikachu  extends Pokemon{
    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 15;
        this.skills = new String[]{"cheeks bulging", "electric shock", "100,000 volts"};
        this.skillPoints=new int[]{20, 40, 90};
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
        targetPokemon.setHp(targetPokemon.getHp()-(this.attackPoint+this.skillPoints[s]));
        System.out.println(this.getName()+" makes a "+this.skills[s]+" at "+targetPokemon.getName()+".");
        System.out.println("The health of the wild Pokemon "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}
