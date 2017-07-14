package session8_assignment3;

public class Main {
    public static void main(String [] args) throws InterruptedException{
        Bus someCompany = new Bus();

        Passenger p1 = new Passenger(someCompany,"Sri");
        Passenger p2 = new Passenger(someCompany, "Nivas");

        p1.start();
        p2.start();

    }
}