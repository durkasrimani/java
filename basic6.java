import java.util.Scanner;
public class basic6{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int distance=scan.nextInt();
        int mileage=scan.nextInt();
        int fuelprice=scan.nextInt();
        int tollcharge=scan.nextInt();
        int a=distance/mileage;
        int b=a*fuelprice;
        int c=b+tollcharge;
        System.out.println(c);
    }
}