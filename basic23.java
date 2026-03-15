import java.util.Scanner;
public class basic23{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int weight=Scan.nextInt();
        int rateperkg=Scan.nextInt();
        int prioritycharges=Scan.nextInt();
        int insurancefees=Scan.nextInt();
        int handlingcharges=Scan.nextInt();
        int fuelsurcharge=Scan.nextInt();
        int a=(rateperkg*weight)+prioritycharges+insurancefees-handlingcharges-fuelsurcharge;
        System.out.println("Cargo Revenue="+a);
    }
}