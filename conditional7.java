import java.util.Scanner;
public class conditional7{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int heartrate=Scan.nextInt();
        String bloodpressure=Scan.next();
        double temperature=Scan.nextDouble();
        String symptomseverity=Scan.next();
        String[] a=bloodpressure.split("/");
        int systolic=Integer.parseInt(a[0]);
        int diastolic=Integer.parseInt(a[1]);
        System.out.println("Heart Rate: "+heartrate+"bpm");
        System.out.println("Blood Pressure: "+bloodpressure);
        System.out.println("Temperature: "+temperature+"F");
        System.out.println("Symptom Severity: "+symptomseverity);
        String priority="";
        String action="";
        if(symptomseverity.equalsIgnoreCase("life-threatening") && heartrate<50 || heartrate>130 || systolic>180 || systolic<90 || temperature>103 || temperature<96){
            priority="critical";
        }
        else if(symptomseverity.equalsIgnoreCase("severe") && heartrate>50 && heartrate<60 || heartrate>110 && heartrate<130 ||systolic>160 && systolic<180 || systolic>90 && systolic<100 ||  temperature>101 && temperature<103 || temperature>96 && temperature<97){
            priority="urgent";
        }
        else if(symptomseverity.equalsIgnoreCase("moderate")){
            priority="standard";
        }
        else {
            priority="non-urgent";
        }
        System.out.println("Triage Priority: "+priority);
        if(priority.equalsIgnoreCase("critical")){
            System.out.println("Estimated Wait Time: 0 minutes");
        }
        else if(priority.equalsIgnoreCase("urgent")){
            System.out.println("Estimated Wait Time: 20 minutes");
        }
        else if(priority.equalsIgnoreCase("standard")){
            System.out.println("Estimated Wait Time: 45 minutes");
        }
        else if(priority.equalsIgnoreCase("non-urgent")){
            System.out.println("Estimated Wait Time: 90 minutes");
        }
        if(priority.equalsIgnoreCase("critical") ){
            action="Immediate Emergency Care";
        }
        else if(priority.equalsIgnoreCase("standard")){
            action="Standard Examination";
        }
        else if(priority.equalsIgnoreCase("urgent")){
            action="Priority Medical Attention";
        }
        else if(priority.equalsIgnoreCase("non-urgent")){
            action="Routine Check-up";
        }
        System.out.println("Recommended Action: " +action);

            }
}