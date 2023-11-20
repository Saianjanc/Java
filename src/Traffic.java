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
        Car[] cars = new Car[10];
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
        for (int i=0;i< cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
