
import java.util.Scanner;

class Car { 

       private String carName; 
       private double milesDriven;
       private double gallonsUsed;
    
       public Car() {
           carName = "";
           milesDriven = 0;
           gallonsUsed =0;
           // construct with no param
       }
       
       public Car (String newName, double newMiles, double newGallons){
           
           carName = newName;
           milesDriven = newMiles;
           gallonsUsed = newGallons;
           // construct with param
           
       }
       //getters and setters for all param
       
        public String getName(){
            return carName;
        }
        public void setName(String newName) {
            carName = newName;
        }
        
        public double getMiles(){
            return milesDriven;
        }
        public void setMiles(double newMiles) {
            milesDriven = newMiles;
        }
        
        public double getGallons(){
            return gallonsUsed;
        }
        public void setGallons(double newGallons) {
            gallonsUsed = newGallons;
        }
        
        
        public double calculateAverage() {
            return Math.round((double)milesDriven / gallonsUsed * 10) / 10.0;
       }

        
        public String toString(){
             return carName + " averaged " + calculateAverage() + " m/g ";
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

