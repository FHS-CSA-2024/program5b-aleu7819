import java.util.Scanner;



class CarTester {
     
    
     public static Car addCar(){
        //user input to set up new car + returns car obj
        Scanner numScanner = new Scanner (System.in);
        
        System.out.print("enter car name: ");
        String carName = numScanner.nextLine();
        
        System.out.print("enter miles driven: ");
        double milesDriven = numScanner.nextDouble();
        
        System.out.print("enter gallons used: ");
        double gallonsUsed = numScanner.nextDouble();
        
        return new Car(carName, milesDriven, gallonsUsed); 
    }
    
    public static void main(String[] args) {
        //call add car at least twice and print car
        Car car1 = addCar();
        Car car2 = addCar();
        
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        
    }
    
    
    
    
}
