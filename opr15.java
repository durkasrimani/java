import java.util.Scanner;
public class opr15{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int signalvalue=Scan.nextInt();
        int togglemask=Scan.nextInt();
        int a=signalvalue^togglemask;
        System.out.println("Toggled Signal="+a);
    }
}