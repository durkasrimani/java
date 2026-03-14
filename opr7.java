import java.util.Scanner;
public class opr7{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int cartvalue=Scan.nextInt();
        int premiummember=Scan.nextInt();
        if(cartvalue>999||premiummember==1){
            System.out.println("Free Shipping");
        }
        else{
            System.out.println("Shipping charges applied");
        }
    }
}