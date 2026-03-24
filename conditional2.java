import java.util.Scanner;
public class conditional2{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int creditscore=Scan.nextInt();
        double annualincome=Scan.nextDouble();
        double debtToIncomeRatio=Scan.nextDouble();
        String loantype=Scan.next();
        System.out.println("Credit Score: "+creditscore);
        System.out.println("Annual Income: $"+annualincome);
        System.out.println("Debt-to-Income Ratio: "+debtToIncomeRatio+"%");
        System.out.println("Loan Type: "+loantype);
        if(creditscore<600 || debtToIncomeRatio>50){
                System.out.println("Decision: Rejected");
                System.out.println("Maximum Loan Amount: $0.0");
            }

        else if(loantype.equals("Home")&&creditscore>=750 && debtToIncomeRatio<=30){
            System.out.println("Decision: Approved");
            System.out.println("Maximum Loan Amount: $"+(4*annualincome));
            }
        else if(loantype.equals("Home")&& creditscore>=650 && creditscore<=699 && debtToIncomeRatio>=31 &&debtToIncomeRatio<=40){
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+(3*annualincome));
            }
        else if(loantype.equals("Personal") && creditscore>=750 && debtToIncomeRatio<=30){
                System.out.println("Decision: Approved");
                System.out.println("Maximum Loan Amount: $"+(1*annualincome));
            }
        else if(loantype.equals("Personal")&&creditscore>=650&&creditscore<=699 && debtToIncomeRatio>=31 && debtToIncomeRatio<=40){
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+(0.5*annualincome));
            }
        else if(loantype.equals("Business")&&creditscore>=700&& debtToIncomeRatio<=40){
                System.out.println("Decision: Approved");
                System.out.println("Maximum Loan Amount: $"+(3*annualincome));
            }
            
    }
}