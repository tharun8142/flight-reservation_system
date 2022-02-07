import java.util.Scanner;

public class Address {
    String city;
    String state;
    String country;
    String street_area;
    int pin_code;
    protected String departure;
    protected String arrival;
    //  String FlightClass;
    String FlightDate;
    int choice;
    String name;
    void show4() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Your Full Name");
        name = sc.nextLine();
        System.out.println("Enter Your Street Area:");
        street_area = sc.nextLine();
        System.out.println("Enter Your Pin_Code:");
        pin_code = sc.nextInt();
        System.out.println("Enter city");
        city = sc.next();
        System.out.println("Enter State");
        state = sc.next();
        System.out.println("Enter Your Country");
        country = sc.next();



        System.out.println("Enter Departure Location");
        setDeparture(sc.next());
        System.out.println("Enter Arrival Location");
        setArrival(sc.next());
//    System.out.println("Enter Flight Ticket Type(Regular & Tourist)");
//    FlightClass = sc.next().toUpperCase();
        System.out.println("Enter Flight Date");
        FlightDate = sc.next();
        System.out.println("Enter Output Preference PRESS 1 For \n.Both Fare And Flight Time\n" + " ");
        choice = sc.nextInt();
    }
    public void print(){

    }



    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
