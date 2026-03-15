import java.util.Scanner;
public class basic11{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int distance=Scan.nextInt();
        int rateperkm=Scan.nextInt();
        int maintenance=Scan.nextInt();
        int driverAllowance=Scan.nextInt();
        int subsidy=Scan.nextInt();
        int a=distance*rateperkm;
        int b=a+maintenance+driverAllowance-subsidy;
        System.out.println("Total Transport Fee=" +b);
    }
}