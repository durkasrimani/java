import java.util.Scanner;
public class opr4{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int creditlimit=Scan.nextInt();
        int purchaseamount=Scan.nextInt();
        int cardblocked=Scan.nextInt();
        if(purchaseamount<=creditlimit && cardblocked==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }

    }
}