package application;

public class calorieCalculators {
	//Variables for account
    private static double maxCal = 0;
    private static double CURRENT_CALORIES = 0;
    private static double HEIGHT = 0;
    private static double WEIGHT = 0;
    private static double age = 0;
    private static String  sex = "";
    
    //Regular account constructor
    public calorieCalculators(double currentHeight, double currentWeight, double currentAge, String currentSex) {   	
        setHEIGHT(currentHeight);
        setWEIGHT(currentWeight);
        setAge(currentAge);
        setSex(currentSex);
    }
    //Height in meters and weight in kilometers
    public double calculateBMI(double height, double weight) {

        double BMI = ((weight)/(height*height));
        return BMI;
    }
    
    public double calcMaxCal(double height, double weight, double age, String sex) {
    	maxCal = 0.0;
    	
    	//BMR is your basal metabolic rate
    	//used to calculate how many calories you need to eat per day
    	if(sex.equals("F")) {
    		double BMRVal = 447.593 + (9.247 * weight) + (3.098 * (height*100)) - (5.677 * age);
    		maxCal = BMRVal * 1.55;
    	}else { //sex is male, only other choice, so no need for else if
    		double BMRVal = 88.362  + (13.397 * weight) + (4.799 * (height*100)) - (4.330 * age);
    		maxCal = BMRVal * 1.55;
    	}
    	
    	/*usually you multiply your BMR by different values based on how active you are,
    		but due to time constraints, we will simply take the average of those values and
    		use that instead*/
    	
    	//testing calculations
    	System.out.println("Max calories per day: " + maxCal);
    	//return max calories you can eat per day
    	return maxCal;
    }

    //Updating Calories Each Meal
    public double updateCalories(double consumedCalories) {
        CURRENT_CALORIES += consumedCalories;
        if (CURRENT_CALORIES < maxCal) {
            System.out.println("You have " + (maxCal-CURRENT_CALORIES) +  " calories remaining for the day.");
            return CURRENT_CALORIES;
        }
        else if (CURRENT_CALORIES == maxCal) {
            System.out.println("Ok, you've reached your max calories for the day. No more.");
            return CURRENT_CALORIES;
        }
        else {
            System.out.println("You've surpassed your daily calorie limit by " + (CURRENT_CALORIES-maxCal) + ". Stop.");
            return -1;
        }
    }
    
    //getters and setters
	public static double getWEIGHT() {
		return WEIGHT;
	}
	public static void setWEIGHT(double wEIGHT) {
		WEIGHT = wEIGHT;
	}
	public static double getHEIGHT() {
		return HEIGHT;
	}
	public static void setHEIGHT(double hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public static double getAge() {
		return age;
	}
	public static void setAge(double userAge) {
		age = userAge;
	}
	public static String getSex() {
		return sex;
	}
	public static void setSex(String userSex) {
		sex = userSex;
	}
    
    //Testing
/*   public static void main(String[] args) {
    	calorieCalculators Brooke = new calorieCalculators(500, 0, 1.52, 60.0);
        updateCalories(100);
        updateCalories(200);
        updateCalories(200);
        updateCalories(500);
        System.out.println(calculateBMI(Brooke.HEIGHT, Brooke.WEIGHT));
        
    } */
    
}

