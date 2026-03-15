import java.util.Scanner;
public class opr13{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int connectionvalue=Scan.nextInt();
        int appliancemask=Scan.nextInt();
        int a=connectionvalue&appliancemask;
        if(a!=0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
    }
}