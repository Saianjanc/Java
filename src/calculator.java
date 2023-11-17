import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double var1,var2,var3;
        int input;
        System.out.println("Welcome to Calculator App!");
        System.out.println("Enter 1st number:");
        var1=sc.nextDouble();
        System.out.println("Enter 2nd number:");
        var2=sc.nextDouble();
        System.out.println("Enter a choice\n 1:For Addition\n 2:For Subtraction");
        input=sc.nextInt();
        switch (input){
            case 1:
                var3=var1+var2;
                System.out.println("Addition of the two number is "+var3);
                break;
            case 2:
                var3=var1-var2;
                System.out.println("Subtraction of the two numbers is "+var3);
                break;
            default:
                System.out.println("Invalid Input!");
            }
    }
}
