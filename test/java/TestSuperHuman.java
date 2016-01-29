import org.junit.Test;
import static org.junit.Assert.*;
public class TestSuperHuman {
    @Test
    public void tester(){
        SuperHuman joe = new SuperHuman("Joe Roddy",25,"Programmer","69 Nunya Bizness Lane",SuperHuman.Allegiances.EVIL,"Every Superpower","Joe, The Merciful");

        //testing getters:
        assertTrue("getName() failed",joe.getName().equals("Joe Roddy"));
        assertTrue("getAge() failed",joe.getAge()==25);
        assertTrue("getJob() failed",joe.getOccupation().equals("Programmer"));
        assertTrue("getAddress() failed",joe.getAddress().equals("69 Nunya Bizness Lane"));
        assertTrue("getAllegiance() failed",joe.getAllegiance().equals(SuperHuman.Allegiances.EVIL));
        assertTrue("getSuperPowers() failed",joe.getSuperPower().equals("Every Superpower"));
        assertTrue("getHeroName() failed",joe.getHeroName().equals("Joe, The Merciful"));

        System.out.println("All test cases passed.");


    }
}
