import java.util.Scanner;
public class basic17{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int developerhours=Scan.nextInt();
        int hourlyrate=Scan.nextInt();
        int designcost=Scan.nextInt();
        int testingcost=Scan.nextInt();
        int advancepaid=Scan.nextInt();
        int a=(developerhours*hourlyrate)+designcost+testingcost-advancepaid;
        System.out.println("Project Cost="+a);
    }
}