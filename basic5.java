import java.util.Scanner;
public class basic5{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        float total=scan.nextFloat();
        float service=scan.nextFloat();
        float gst=scan.nextFloat();
        float people=scan.nextFloat();
        float a=total*service/100;
        float result=total+a;
        float b=result*gst/100;
        float c=result+b;
        float d=c/people;
        System.out.println((float)d);
    }
}