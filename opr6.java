import java.util.Scanner;
public class opr6{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int familyincome=Scan.nextInt();
        int percentage=Scan.nextInt();
        if(familyincome<200000 && percentage>=75){
            System.out.println("Scholarship Granted");
        }
        else{
            System.out.println("Not Granted");
        }
    }
}