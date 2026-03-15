import java.util.Scanner;
public class basic19{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
            int rentaldays=Scan.nextInt();
            int rentperday=Scan.nextInt();
            int latecharges=Scan.nextInt();
            int fuelcost=Scan.nextInt();
            int maintenance=Scan.nextInt();
            int a=(rentaldays*rentperday)+latecharges-fuelcost-maintenance;
            System.out.println("Net Profit = "+a);
        }
    }
