import java.util.Scanner;
public class basic8{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int roomchargeperday=scan.nextInt();
        int days=scan.nextInt();
        int medicinecost=scan.nextInt();
        int labfees=scan.nextInt();
        int insurance=scan.nextInt();
        int a=roomchargeperday*days;
        int b=a+medicinecost+labfees-insurance;
        System.out.println("Payable Amount="+b);
    }
}