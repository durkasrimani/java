import java.util.Scanner;
public class basic20{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int adrevenue=Scan.nextInt();
        int sponsorshipamount=Scan.nextInt();
        int affiliateincome=Scan.nextInt();
        int tax=Scan.nextInt();
        int productioncost=Scan.nextInt();
        int a=adrevenue+sponsorshipamount+affiliateincome-tax-productioncost;
        System.out.println("Final youtube Income="+a);
    }
}