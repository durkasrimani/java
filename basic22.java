import java.util.Scanner;
public class basic22{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int copies=Scan.nextInt();
        int costpercopy=Scan.nextInt();
        int editingcharge=Scan.nextInt();
        int designcharge=Scan.nextInt();
        int distributorcommission=Scan.nextInt();
        int marketingexpense=Scan.nextInt();
        int a=(copies*costpercopy)+editingcharge+designcharge-distributorcommission-marketingexpense;
        System.out.println("Publishing Profit="+a);
    }
}