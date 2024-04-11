package pokemons;

public class Squirtle extends Pokemon{
    public Squirtle() {
        System.out.println("Sqrrrrrrrt");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint=12;
        this.skills = new String[]{"body slam", "water cannon", "hydro pump"};
        this.skillPoints= new int[]{35, 40, 110};
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
        targetPokemon.setHp(targetPokemon.getHp()-(this.attackPoint+this.skillPoints[s]));
        System.out.println(this.getName()+" attacks "+targetPokemon.getName()+" with a "+this.skills[s]+".");
        System.out.println("The health of the wild Pokemon "+targetPokemon.getName()+" has been reduces to "+targetPokemon.getHp()+" due to "+this.getName()+"'s attack.");
    }
}
