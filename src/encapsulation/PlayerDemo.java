package encapsulation;

public class PlayerDemo {
    public static void main(String[] args) {
        Player tim = new Player("Tim");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
