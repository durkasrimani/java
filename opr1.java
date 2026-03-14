import java.util.Scanner;
public class opr1{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int theorymarks=Scan.nextInt();
        int practicalmarks=Scan.nextInt();
        if(theorymarks>50 && practicalmarks>50){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}