import java.util.Scanner;

class Car{
    String licence,color,brand;
    Car(String s1,String s2,String s3){
        this.licence = s1;
        this.color = s2;
        this.brand = s3;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licence='" + licence + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
public class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option,count=9;
        String plateno,ncolor,nbrand;
        Car[] cars = new Car[20];
        Car c1 = new Car("Ka051002","Black","Maruti Suzuki");
        Car c2 = new Car("Ka023034","Blue","Hyundai");
        Car c3 = new Car("Ka054223","Black","Ford");
        Car c4 = new Car("Ka025561","Mate Black","Tesla");
        Car c5 = new Car("Ka054456","Gery","Honda");
        Car c6 = new Car("Ka050098","Red","Tata");
        Car c7 = new Car("Ka051113","Mate Blue","Kia");
        Car c8 = new Car("Ka012002","Mate Red","Audi");
        Car c9 = new Car("Ka02777","Black","Skoda");
        Car c10 = new Car("Ka014885","White","Jeep");
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;
        cars[4] = c5;
        cars[5] = c6;
        cars[6] = c7;
        cars[7] = c8;
        cars[8] = c9;
        cars[9] = c10;
        do{
            System.out.println("Please Select an Option:\n 1:Add a new car.\n 2:Display the list of cars.\n 3:Find a car by Licence Plate.\n 4:To Exit!");
            option = sc.nextInt();
            switch (option){
                case 1:
                        System.out.println("Enter the Licence Plate Number:");
                        plateno = sc.next();
                        System.out.println("Enter the Car Color:");
                        ncolor = sc.next();
                        System.out.println("Enter the Car Brand:");
                        nbrand = sc.next();
                        count++;
                        cars[count] = new Car(plateno,ncolor,nbrand);
                        break;
                case 2:
                        for (int i=0;i<count;i++){
                            System.out.println(cars[i]);
                        }
                        break;
                case 3:
                        System.out.println("Enter Licence Plate Number to find the car:");
                        plateno = sc.next();
                        for (int i=0;i<count;i++){
                            if (cars[i].licence.equals(plateno)) {
                                    System.out.println(cars[i]);
                                    break;
                                }
                            }
                        System.out.println("Not Found!");
                        break;
                case 4:
                        System.out.println("Bye!!");
                        break;
                default:
                        System.out.println("Invalid Input Please Enter Correct Input!");
                        break;
            }
        }while (option!=4);
    }
}
