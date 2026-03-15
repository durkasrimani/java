import java.util.Scanner;
public class opr12{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int filesize=Scan.nextInt();
        int compressioncycles=Scan.nextInt();
        int size=filesize>>compressioncycles;
        System.out.println("Compressed Size="+size);
    }
}