import java.util.Scanner;
public class conditional5{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        double gpa=Scan.nextDouble();
        double familyincome=Scan.nextDouble();
        int extracurricularscore=Scan.nextInt();
        String scholarshiptype=Scan.next();
        System.out.println("GPA: "+gpa);
        System.out.println("Family Income: "+familyincome);
        System.out.println("Extracurricular: "+extracurricularscore);
        System.out.println("Scolarship Type: "+scholarshiptype);
        if(gpa>=2.5){
            System.out.println("Eligiblity: Eligible");
        }
        else{
            System.out.println("Eligiblity: Not Eligible");
        }
        if(scholarshiptype.equalsIgnoreCase("merit") && gpa>=3.8 && extracurricularscore>=80){
            System.out.println("Award Amount: $25000.0");
            System.out.println("Award category : Full");
        }
        else if(scholarshiptype.equalsIgnoreCase("merit") && gpa>=3.5 && extracurricularscore>=70){
            System.out.println("Award Amount: $15000.0");
            System.out.println("Award category: partial");
        }
        else if(scholarshiptype.equalsIgnoreCase("merit") && gpa>=3.0 && extracurricularscore>=60){
            System.out.println("Award Amount: $8000.0");
            System.out.println("Award category: Minimal");
        }
        if(scholarshiptype.equalsIgnoreCase("need-based") && familyincome<=30000 && gpa>=3.5){
            System.out.println("Award Amount: $30000.0");
            System.out.println("Award category: Full");
        }
        else if(scholarshiptype.equalsIgnoreCase("need-based") && familyincome<=50000 && gpa>=3.0){
            System.out.println("Award Amount: $18000.0");
            System.out.println("Award category: partial");
        }
        else if(scholarshiptype.equalsIgnoreCase("need-based") && familyincome<=70000 && gpa>=2.8){
            System.out.println("Award Amount: $10000.0");
            System.out.println("Award category: minimal");
        }
        if(scholarshiptype.equalsIgnoreCase("sports") && extracurricularscore>=85 && gpa>=3.0){
            System.out.println("Award Amount: $22000.0");
            System.out.println("Award category: full");
        }
        else if(scholarshiptype.equalsIgnoreCase("sports") && extracurricularscore>=75 && gpa>=2.8){
            System.out.println("Award Amount: $20000.0");
            System.out.println("Award category: partial");
        }
        else if(scholarshiptype.equalsIgnoreCase("sports") && extracurricularscore>=65 && gpa>=2.5){
            System.out.println("Award Amount: $12000.0");
            System.out.println("Award category: minimal");
        }
    }
}