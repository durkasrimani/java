import java.util.Scanner;
public class opr11{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int baseboxes=Scan.nextInt();
        int levels=Scan.nextInt();
        int capacity=baseboxes<<levels;
        System.out.println("Total capaacity="+capacity);

    }
}