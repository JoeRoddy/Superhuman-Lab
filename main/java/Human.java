/**
 * Created by Joe on 1/28/16.
 */
public class Human {
    private String name;
    private int age;
    private String occupation;
    private String address;

    Human(String name, int age, String job, String address){
        this.name=name;
        this.age = age;
        this.occupation=job;
        this.address=address;
    }

    public void printName(){
        System.out.println(this.getName());
    }
    public void printAge(){
        System.out.println(this.getAge());
    }
    public void printOccupation(){
        System.out.println(this.getOccupation());
    }
    public void printAddress(){
        System.out.println(this.getAddress());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAddress() {
        return address;
    }

}
