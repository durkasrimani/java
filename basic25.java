import java.util.Scanner;
public class basic25{
    public static void main(String[]  args){
        Scanner Scan=new Scanner(System.in);
        int residentialusage=Scan.nextInt();
        int residentialrate=Scan.nextInt();
        int commercialusage=Scan.nextInt();
        int commercialrate=Scan.nextInt();
        int connectionfees=Scan.nextInt();
        int penaltycollection=Scan.nextInt();
        int pipelinemaintenance=Scan.nextInt();
        int treatementcost=Scan.nextInt();
        int a=(residentialusage*residentialrate)+(commercialusage*commercialrate)+connectionfees+penaltycollection-pipelinemaintenance-treatementcost;
        System.out.println("Net Water Revenue="+a);
    }
}