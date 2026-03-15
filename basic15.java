import java.util.Scanner;
public class basic15{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int roomsBooked=Scan.nextInt();
        int priceperroom=Scan.nextInt();
        int servicecharges=Scan.nextInt();
        int commission=Scan.nextInt();
        int a=roomsBooked*priceperroom;
        int b=a+servicecharges-commission;
        System.out.println("Total Revenue="+b);
        
    }
}