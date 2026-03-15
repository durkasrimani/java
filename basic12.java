import java.util.Scanner;
public class basic12{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
            int ticketRevenue=Scan.nextInt();
            int snackRevenue=Scan.nextInt();
            int maintenanceCost=Scan.nextInt();
            int electricityBill=Scan.nextInt();
            int b=ticketRevenue+snackRevenue-maintenanceCost-electricityBill;
            System.out.println("Net Profit = "+b);
        }
        }
