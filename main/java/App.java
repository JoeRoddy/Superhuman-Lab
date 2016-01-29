/**
 * Created by Joe on 1/28/16.
 */
public class App {
    public static void main(String[] args) {

        SuperHuman joe =new SuperHuman("Joe Roddy",25,"Programmer","69 Nunya Bizness Lane",SuperHuman.Allegiances.EVIL,"Every Superpower","Joe, The Merciful");

        System.out.println("Superhuman false identity:");
        joe.printName();
        System.out.println("Superhuman address:");
        joe.printAddress();
    }
}
