import java.util.Scanner;
public class opr5{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int salary=Scan.nextInt();
        int creditscore=Scan.nextInt();
        if(salary>25000 && creditscore>700){
            System.out.println("Loan Approved");
        }
        else{
            System.out.println("Loan Rejected");
        }
    }
}