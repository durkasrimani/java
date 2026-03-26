import java.util.Scanner;
public class conditional4{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int additionaldiscount=0;
        String loyaltytier=Scan.next();
        double cartvalue=Scan.nextDouble();
        String productcategory=Scan.next();
        String membershipstatus=Scan.next();
        System.out.println("Loyalty: "+loyaltytier);
        System.out.println("Cart value: $"+cartvalue);
        System.out.println("Product Category: "+productcategory);
        System.out.println("Membership: "+membershipstatus);
        int basediscount=0;
    if(loyaltytier.equalsIgnoreCase("bronze")){
        basediscount+=5;
    }
    else if(loyaltytier.equalsIgnoreCase("silver")){
        basediscount+=8;
    }
    else if(loyaltytier.equalsIgnoreCase("gold")){
        basediscount+=12;
    }
    else if(loyaltytier.equalsIgnoreCase("platinum")){
        basediscount+=15;
    }
    int addditionaldiscount=0;
    if(cartvalue>=500 && cartvalue<=999){
        additionaldiscount+=3;
    }
    else if(cartvalue>=1000 && cartvalue<=1999){
        additionaldiscount+=5;
    }
    else if(cartvalue>=2000){
        additionaldiscount+=7;
    }
    if(productcategory.equalsIgnoreCase("electronics")&&membershipstatus.equalsIgnoreCase("prime")){
        additionaldiscount+=5;
    }
    else if(productcategory.equalsIgnoreCase("fashion")){
        additionaldiscount+=3;
    }
    else if(productcategory.equalsIgnoreCase("books")&&membershipstatus.equalsIgnoreCase("prime")){
        additionaldiscount+=5;
    }
    else if(productcategory.equalsIgnoreCase("groceries") && cartvalue>300){
        additionaldiscount+=2;
    }
    System.out.println("Base Discount:"+basediscount+"%");
    System.out.println("Additional discount:"+additionaldiscount+"%");
    int f=basediscount+additionaldiscount;
    System.out.println("Total discount: "+f+"%");
    double g=cartvalue*((1-(f/100.0)));
    System.out.println("Final Price: $"+g);
    double h=cartvalue-g;
    System.out.println("Savings : $"+h);

}
}