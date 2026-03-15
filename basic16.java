import java.util.Scanner;
public class basic16{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int generalpassenger=Scan.nextInt();
        int generalFare=Scan.nextInt();
        int acpassenger=Scan.nextInt();
        int acFare=Scan.nextInt();
        int platformcollection=Scan.nextInt();
        int maintenancecost=Scan.nextInt();
        int fuelcost=Scan.nextInt();
        int a=generalpassenger*generalFare;
        int b=acpassenger*acFare;
        int c=a+b+platformcollection-maintenancecost-fuelcost;
        System.out.println("Net Railway Revenue="+c);
    }
}