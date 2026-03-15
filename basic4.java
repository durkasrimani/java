import java.util.Scanner;
public class basic4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int tutionfee=scan.nextInt();
        int scholarship=scan.nextInt();
        int examfee=scan.nextInt();
        int libraryfee=scan.nextInt();
        int a=tutionfee*scholarship/100;
        int b=tutionfee-a;
        System.out.println(b+examfee+libraryfee);
    }
}