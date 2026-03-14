import java.util.Scanner;
public class opr8{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int age=Scan.nextInt();
        int idproof=Scan.nextInt();
        if(age>=18 && idproof==1){
            System.out.println("Entry Allowed");
        }
        else{
            System.out.println("Entry Denied");
        }
    }
}