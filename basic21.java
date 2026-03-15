import java.util.Scanner;
public class basic21{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
            int maintenancecollection=Scan.nextInt();
            int parkingfees=Scan.nextInt();
            int hallbooking=Scan.nextInt();
            int securitysalary=Scan.nextInt();
            int electricityBill=Scan.nextInt();
            int cleaningcost=Scan.nextInt();
            int a=maintenancecollection+parkingfees+hallbooking-securitysalary-electricityBill-cleaningcost;
            System.out.println("Remaining Balance="+a);
        }
    }
