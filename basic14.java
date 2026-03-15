import java.util.Scanner;
public class basic14{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int basesalary=Scan.nextInt();
        int sessions=Scan.nextInt();
        int  paypersession=Scan.nextInt();
        int bonus=Scan.nextInt();
        int maintanencefee=Scan.nextInt();
        int a=sessions*paypersession;
        int b=basesalary+a+bonus-maintanencefee;
        System.out.println("Final Salary:" +b); 
    }
}