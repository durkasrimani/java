import java.util.Scanner;
public class opr9{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
            int usernamematch=Scan.nextInt();
            int passwordmatch=Scan.nextInt();
            int accountlocked=Scan.nextInt();
            if(usernamematch==1 && passwordmatch==1 && accountlocked==0){
                System.out.println("Login Success");
            }
            else{
                System.out.println("Login Failed");
            }
        
    }
}