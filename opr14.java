import java.util.Scanner;
public class opr14{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int permissionA=Scan.nextInt();
        int permissionB=Scan.nextInt();
        int a=permissionA | permissionB;
        System.out.println("Merged permission code="+a);
    }
}