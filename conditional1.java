import java.util.Scanner;
public class conditional1{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int performancerating=Scan.nextInt();
        int yearsofservice=Scan.nextInt();
        String departmenttype=Scan.next();
        double salary=Scan.nextDouble();
        System.out.println("Performance Rating: "+performancerating);
        System.out.println("Years of Service: "+yearsofservice);
        System.out.println("Department: "+departmenttype);
            switch(performancerating){
            case 5:
                if(departmenttype.equals("critical")){
                    System.out.println("Bonus percentage:25%");
                    double a=((salary*25)/100.0);
                    System.out.println("Bonus amount:$"+a);
                    System.out.println("Status:Eligible");
                    break;
                }
                else if(departmenttype.equals("non-critical")){
                System.out.println("Bonus percentage:18%");
                double e=((salary*18)/100.0);
                System.out.println("Bonus amount:$"+e);
                System.out.println("Status:Eligible");
                break;
            }
            case 4:
                if(departmenttype.equals("critical")){
                if(yearsofservice>=10){
                System.out.println("Bonus Percentage:22%");
                double b=((salary*22)/100.0);
                System.out.println("Bonus amount:$"+b);
                System.out.println("Status:Eligible");
                break;
                }
                }
                else{
                    System.out.println("Bonus percentage:15%");
                    double c=((salary*15)/100.0);
                    System.out.println("Bonus amount:$"+c);
                    System.out.println("Status:Eligible");
                    break;
                }
                if(departmenttype.equals("non-critical")){
                System.out.println("Bonus percentage:12%");
                double f=((salary*12)/100.0);
                System.out.println("Bonus amount:$"+f);
                System.out.println("Status:Eligible");
                break;
                }
            case 3:
                if(departmenttype.equals("critical")){
                System.out.println("Bonus percentage:10%");
                double d=((salary*10)/100.0);
                System.out.println("Bonus amount:$"+d);
                System.out.println("Status:Eligible");
                break;
                }
                else if(departmenttype.equals("non-critical")){
                System.out.println("Bonus percentage:8%");
                double g=((salary*8)/100.0);
                System.out.println("Bonus amount:$"+g);
                System.out.println("Status:Eligible");
                break;
                }
            case 2:
                if(departmenttype.equals("critical")||departmenttype.equals("non-critical")){
                System.out.println("Bonus percentage:0%");
                System.out.println("Bonus amount:$0.0");
                System.out.println("Status:Not Eligible");
                break;
                }
            case 1:
                if(departmenttype.equals("critical")||departmenttype.equals("non-critical")){
                System.out.println("Bonus percentage:0%");
                System.out.println("Bonus amount:$0.0");
                System.out.println("Status:Not Eligible");
                break;
                }
            default:
                System.out.println("Bonus percentage:0%");
                System.out.println("Bonus amount:$0.0");
                System.out.println("Status:Not Eligible");
            
        }
        }
        }


        