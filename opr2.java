import java.util.Scanner;
public class opr2{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int accountbalance=Scan.nextInt();
        int withdrawlamount=Scan.nextInt();
        int dailylimit=Scan.nextInt();
        if(withdrawlamount<=accountbalance && withdrawlamount<=dailylimit){
            System.out.println("Transaction Approved");
        }
        else{
            System.out.println("Transaction Declined");
        }
    }
}