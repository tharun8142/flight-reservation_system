import java.util.Scanner;
public class Contact extends Address {
    static String Mobile_NO;
    static String email_id;
    String getFlightDate (){
        return  FlightDate ;
    }
    public void setFlightDate (String  FlightDate ){
        this. FlightDate = FlightDate ;
    }
    void show(){
        System.out.println("Enter Your Mobile Number");
        Scanner sc=new Scanner(System.in);
        Mobile_NO=sc.next();
        System.out.println("Enter Your Email ID");
        email_id=sc.next();
        System.out.println("Passenger Detail"+"\n"+"Name: "+name+"\n"+"Area: "+street_area+"\n"+"pin_code: "+pin_code+"\n"+"City: "+city+"\n"+"state: "+state+"\n"+"country: "+country+"\n");
        System.out.println("Passenger Contact");
        System.out.println("Passenger Mobile_NO: "+Mobile_NO+"\n"+"Passenger Email_ID: "+email_id);
        System.out.println("Ticket Booking  Successful");



    }
}
