import java.util.Scanner;
public class conditional3{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int age=Scan.nextInt();
        String smokingstatus=Scan.next();
        String preexistingconditions=Scan.next();
        String coveragetier=Scan.next();
        System.out.println("Age: "+age);
        System.out.println("Smoking Status: "+smokingstatus);
        System.out.println("Pre-existing Conditions: "+preexistingconditions);
        System.out.println("Coverage Tier: "+coveragetier);
        double basepremium=0.0;
        if(age>=18 && age<=30 && coveragetier.equalsIgnoreCase("basic")){
            basepremium+=200;
        }
        else if(age>18 && age<=30 && coveragetier.equalsIgnoreCase("standard")){
            basepremium+=300;
        }
        else if(age>18 && age<=30 && coveragetier.equalsIgnoreCase("premium")){
            basepremium+=500;
        }
        if(age>=31 && age<=50 && coveragetier.equalsIgnoreCase("basic")){
            basepremium+=250;
        }
        else if(age>=31 && age<=50 && coveragetier.equalsIgnoreCase("standard")){
            basepremium+=350;
        }
        else if(age>=31 && age<=50 && coveragetier.equalsIgnoreCase("premium")){
            basepremium+=600;
        }
        if(age>=51 && age<=65 && coveragetier.equalsIgnoreCase("basic")){
            basepremium+=350;
        }
        else if(age>=51 && age<=65 && coveragetier.equalsIgnoreCase("standard")){
            basepremium+=450;
        }
        else if(age>=51 && age<=65 && coveragetier.equalsIgnoreCase("premium")){
            basepremium+=700;
        }
        if(age>=66 && coveragetier.equalsIgnoreCase("basic")){
            basepremium+=400;
        }
        else if(age>=66 && coveragetier.equalsIgnoreCase("standard")){
            basepremium+=550;
        }
        else if(age>=66 && coveragetier.equalsIgnoreCase("premium")){
            basepremium+=800;
        }
        System.out.println("Base Premium: $" + basepremium);
        double risksurcharge=0.0;
        if(smokingstatus.equalsIgnoreCase("smoker")){
            risksurcharge=0.4*basepremium;
        }
        else if(smokingstatus.equalsIgnoreCase("pre-existing")){
            risksurcharge=0.3*basepremium;
        }
        else if(smokingstatus.equalsIgnoreCase("smoker") || smokingstatus.equalsIgnoreCase("pre-existing")){
            risksurcharge=0.7*basepremium;
        }
        else{
            risksurcharge=0.0;
        }
        System.out.println("Risk Surcharge: $" +risksurcharge);
        double total=basepremium+risksurcharge;
        System.out.println("Total Premium: $"+total);
    }
}


