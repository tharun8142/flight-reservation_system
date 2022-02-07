import java.util.Scanner;

public class FlightMain  {
    public static void main(String[] args) {


        Contact tharun=new Contact();
        RegularTicket tharun2=new RegularTicket();
        tharun2.Create_PNR();
        tharun2.SeatNO();
        tharun2.setFlight_time("3.22");
        tharun2.Ac_Details("not available");
        tharun2.setTicketFare(2000.00f);
        Tourist_Ticket tharun3=new Tourist_Ticket(" Chicken Cilli","samosa,eggs "," Chilled Water Available");

        tharun3.Create_PNR();
        tharun3.SeatNO();
        tharun3.setFlight_time("4.00");
        tharun3.Ac_Details("exclusive Available");
        tharun3.setTicketFare(5000.00f);
        Passenger tharun4=new Passenger();
        tharun4.setFlight_name("INDIAN AIRLINE");
        tharun4.Flight_No();
        tharun.setArrival(tharun.arrival);
        tharun.setDeparture(tharun.departure);
        tharun.setFlightDate(tharun.FlightDate);



        tharun.show4();

        tharun4.setName(tharun.name);
        tharun4.show1();
        int choice;
        System.out.println("Enter Flight Ticket Type Which you want(For Regular Press 1 & For Tourist Press 2)");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        tharun.show();


        tharun.print();



        System.out.println("Date: "+tharun.getFlightDate());
        System.out.println("Passenger ID: "+tharun4.AadharCard_No);
        System.out.println();
        System.out.println("||Flight Detail||");
        System.out.print  ( "\t|\t" +" Flight_Name: "+ tharun4.getFlight_name());
        System.out.print  ( "\t|\t" +"Flight_Number: "+ tharun4.Flight_No());
        System.out.print  ( "\t|\t" +"Arrival: "+ tharun.getArrival());
        System.out.println ("\t|\t" +"Departure: "+ tharun.getDeparture());

        switch (choice) {

            case 1:
                System.out.println("||REGULAR TICKET||");
                System.out.print("\t|\t" + "PNR_NO: " + tharun2.Create_PNR());
                System.out.print("\t|\t" + "Seat_NO: " + tharun2.SeatNO());
                System.out.print("\t|\t" + "Time: " + tharun2.getFlight_time());
                System.out.print("\t|\t" + "AC_Detail: " + tharun2.getAc_Details());
                System.out.println("\t|\t" + "Fare: " + tharun2.getTicketFare());
                System.out.println("NOTE: Food Facility Not Available For regular Ticket");
                break;
            case 2:
                System.out.println("||Tourist Ticket||");
                System.out.print("\t|\t" + "PNR_NO: " + tharun3.Create_PNR());
                System.out.print("\t|\t" + "Seat_NO: " + tharun3.SeatNO());
                System.out.print("   \t|\t" + "Time: " + tharun3.getFlight_time());
                System.out.print("\t|\t" + "AC_Detail: " + tharun3.getAc_Details());
                System.out.println("\t|\t" + "Fare: " + tharun3.getTicketFare());
                tharun3.print1();
                break;
            default:
                System.out.println("please enter valid option");
        }



    }
}
