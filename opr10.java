import java.util.Scanner;
public class opr10{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int unitsconsumed=Scan.nextInt();
        int voltagefluctuation=Scan.nextInt();
        if(unitsconsumed>500 || voltagefluctuation==1){
            System.out.println("Alert Triggered");
        }
        else{
            System.out.println("Normal Usage");
        }
    }
}