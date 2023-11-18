import java.util.Scanner;

public class calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double var1,var2;
        int input,option=0;
        do {
            System.out.println("Welcome to Calculator App!");
            System.out.println("Enter 1st number:");
            var1 = sc.nextDouble();
            System.out.println("Enter 2nd number:");
            var2 = sc.nextDouble();
            System.out.println("Enter a choice\n 1:For Addition\n 2:For Subtraction\n 3:For Multiplication\n 4:For Division");
            input = sc.nextInt();
            switch (input) {
                case 1 -> System.out.println("Addition of the two number is " + add(var1, var2));
                case 2 -> System.out.println("Subtraction of the two numbers is " + subtract(var1, var2));
                case 3 -> System.out.println("Multiplication of the two numbers is " + multiply(var1, var2));
                case 4 -> System.out.println("Division of the two numbers is " + divide(var1, var2));
                default -> System.out.println("Invalid Input!");
            }
            System.out.println("To Exit the Program Press 1 or Press any key to continue.");
            option = sc.nextInt();
        }while (option!=1);
    }
}