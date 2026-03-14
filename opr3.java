import java.util.Scanner;
public class opr3{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int workinghours=Scan.nextInt();
        int attendancepercentage=Scan.nextInt();
        if(workinghours>40 && attendancepercentage>90){
            System.out.println("Bonus eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}