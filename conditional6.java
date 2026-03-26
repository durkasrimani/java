import java.util.Scanner;
public class conditional6{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        String bookingclass=Scan.next();
        int daysuntildeparture=Scan.nextInt();
        double seatavailability=Scan.nextDouble();
        String routetype=Scan.next();
        System.out.println("Booking Class: "+bookingclass);
        System.out.println("Days Until Departure: "+daysuntildeparture);
        System.out.println("Seat Availability: "+seatavailability+"%");
        System.out.println("Route Type: "+routetype);
        double baseprice=0;
        if(bookingclass.equalsIgnoreCase("economy")&&routetype.equalsIgnoreCase("domestic")){
            baseprice+=200;
        }
        else if(bookingclass.equalsIgnoreCase("economy")&&routetype.equalsIgnoreCase("international-short")){
            baseprice+=500;
        }
        else if(bookingclass.equalsIgnoreCase("economy")&&routetype.equalsIgnoreCase("international-long")){
            baseprice+=800;
        }
        if(bookingclass.equalsIgnoreCase("business") && routetype.equalsIgnoreCase("domestic")){
            baseprice+=600;
        }
        else if(bookingclass.equalsIgnoreCase("business") && routetype.equalsIgnoreCase("international-short")){
            baseprice+=1500;
        }
        else if(bookingclass.equalsIgnoreCase("business") && routetype.equalsIgnoreCase("international-long")){
            baseprice+=2500;
        }
        if(bookingclass.equalsIgnoreCase("first") && routetype.equalsIgnoreCase("domestic")){
            baseprice+=1000;
        }
        else if(bookingclass.equalsIgnoreCase("first") && routetype.equalsIgnoreCase("international-short")){
            baseprice+=3000;
        }
        else if(bookingclass.equalsIgnoreCase("first") && routetype.equalsIgnoreCase("international-long")){
            baseprice+=5000;
        }
        System.out.println("Base Price: $"+baseprice);
        double demandmultiplier=0;
        if(seatavailability<30 && daysuntildeparture<14){
            demandmultiplier+=1.8;
        }
        else if(seatavailability<50 && daysuntildeparture<30){
            demandmultiplier+=1.5;
        }
        else if(seatavailability<60 || daysuntildeparture>30 && daysuntildeparture<60){
            demandmultiplier+=1.0;
        }
        else if(seatavailability>=60 && daysuntildeparture>60){
            demandmultiplier+=0.8;
        }
        System.out.println("Demand Multiplier: "+demandmultiplier+"X");
        double a=baseprice*demandmultiplier;
        System.out.println("Final Price: $"+a);
        if(seatavailability<30 && daysuntildeparture<14){
            System.out.println("Pricing Category: High Demand");
        }
        else if(seatavailability<50 && daysuntildeparture<30){
            System.out.println("Pricing Category: High Demand");
        }
        else if(seatavailability<60 || daysuntildeparture>30 && daysuntildeparture<60){
            System.out.println("Pricing Category: Moderate");
        }
        else if(seatavailability>=60 && daysuntildeparture>60){
            System.out.println("Pricing Category: Low Demand");
        }



    }
}