import java.util.Scanner;
public class basic7{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int rodsperhour=scan.nextInt();
        int hoursworked=scan.nextInt();
        int overtimerods=scan.nextInt();
        int rejectedrods=scan.nextInt();
        int a=rodsperhour*hoursworked;
        int b=a+overtimerods-rejectedrods;
        System.out.println(b);
    }
}