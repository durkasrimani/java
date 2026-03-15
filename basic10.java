import java.util.Scanner;
public class basic10{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int deliveries=scan.nextInt();
        int payout=scan.nextInt();
        int incentive=scan.nextInt();
        int fuelcost=scan.nextInt();
        int a=deliveries*payout;
        int b=a+incentive-fuelcost;
        System.out.println("Driver Earnings ="+b);
    }
}