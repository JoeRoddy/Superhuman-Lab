/**
 * Created by Joe on 1/28/16.
 */
public class SuperHuman extends Human{
    enum Allegiances{GOOD,EVIL}
    private Allegiances allegiance;
    private String superPower;
    private String heroName;

    public SuperHuman(String name, int age, String job, String address, Allegiances allegiance, String superPower, String heroName) {
        super(name, age, job, address);
        this.allegiance = allegiance;
        this.superPower = superPower;
        this.heroName = heroName;
    }

    public void printAllegiance(){
        System.out.println(this.getAllegiance());
    }
    public void printSuperPower(){
        System.out.println(this.getSuperPower());
    }
    public void printHeroName(){
        System.out.println(this.getHeroName());
    }

    public Allegiances getAllegiance() {
        return allegiance;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getHeroName() {
        return heroName;
    }
}
