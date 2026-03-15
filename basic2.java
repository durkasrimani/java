import java.util.Scanner;
public class basic2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        float basecost=scan.nextFloat();
        float extraGB=scan.nextFloat();
        float rateperGB=scan.nextFloat();
        float tax=scan.nextFloat();
        float a=extraGB*rateperGB;
        float b=basecost+a;
        float c=b*tax/100;
        System.out.println(c+b);
    }
}