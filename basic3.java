import java.util.Scanner;
public class basic3{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        float sales=scan.nextFloat();
        float discount=scan.nextFloat();
        float gst=scan.nextFloat();
        float a=sales*discount/100;
        float b=sales-a;
        float c=b*gst/100;
        System.out.println(b+c);
    }
}