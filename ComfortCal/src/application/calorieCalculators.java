package application;

public class calorieCalculators {
	//Variables for account
    private static int MAX_CALORIES_FOR_THE_DAY = 1500;
    private static int CURRENT_CALORIES = 0;
    private static double HEIGHT = 0;
    private static double WEIGHT = 0;
    
    //Regular account
    public calorieCalculators(int maxCal, int currentCal, double currentHeight, double currentWeight) {
        MAX_CALORIES_FOR_THE_DAY = maxCal;
        CURRENT_CALORIES = currentCal;
        HEIGHT = currentHeight;
        WEIGHT = currentWeight;
    }
    //Height in meters and weight in kilometers
    public static double calculateBMI(double height, double weight) {

        double BMI = ((weight)/(height*height));
        return BMI;
    }

    //Updating Calories Each Meal
    public static void updateCalories(int consumedCalories) {
        CURRENT_CALORIES += consumedCalories;
        if (CURRENT_CALORIES < MAX_CALORIES_FOR_THE_DAY) {
            System.out.println("You have " + (MAX_CALORIES_FOR_THE_DAY-CURRENT_CALORIES) +  " calories remaining for the day.");
            //return CURRENT_CALORIES
        }
        else if (CURRENT_CALORIES == MAX_CALORIES_FOR_THE_DAY) {
            System.out.println("Ok, you've reached your max calories for the day. No more.");
            //return CURRENT_CALORIES
        }
        else {
            System.out.println("You've surpassed your daily calorie limit by " + (CURRENT_CALORIES-MAX_CALORIES_FOR_THE_DAY) + ". Stop.");
            //return -1
        }
    }
    
    //Testing
    public static void main(String[] args) {
    	calorieCalculators Brooke = new calorieCalculators(500, 0, 1.52, 60.0);
        updateCalories(100);
        updateCalories(200);
        updateCalories(200);
        updateCalories(500);
        System.out.println(calculateBMI(Brooke.HEIGHT, Brooke.WEIGHT));
        
    }
    
}

