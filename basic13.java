import java.util.Scanner;
public class basic13{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int yieldperAcre=Scan.nextInt();
        int acres=Scan.nextInt();
        int extraYield=Scan.nextInt();
        int damageCrops=Scan.nextInt();
        int a=yieldperAcre*acres;
        int b=a+extraYield-damageCrops;
        System.out.println("Marketable Yield="+b);
    }
}