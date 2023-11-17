import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double var1,var2,var3;
        System.out.println("Welcome to Calculator App!");
        System.out.println("Enter 1st number:");
        var1=sc.nextDouble();
        System.out.println("Enter 2nd number:");
        var2=sc.nextDouble();
        var3=var1+var2;
        System.out.println("Addition of the tow number is "+var3);
    }
}
