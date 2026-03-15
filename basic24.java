import java.util.Scanner;
public class basic24{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int teamregistration=Scan.nextInt();
        int broadcastingrights=Scan.nextInt();
        int sponsorship=Scan.nextInt();
        int prizemoney=Scan.nextInt();
        int stadiumrent=Scan.nextInt();
        int advertisingcost=Scan.nextInt();
        int a=teamregistration+broadcastingrights+sponsorship-prizemoney-stadiumrent-advertisingcost;;
        System.out.println("Remaining Tournament Fund="+a);
    }
}