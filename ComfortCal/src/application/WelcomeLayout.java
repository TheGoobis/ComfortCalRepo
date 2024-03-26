package application;
// class for the welcome layout
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontWeight;
//import javafx.scene.control.Label;
//import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
//import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.event.EventHandler;

import javafx.scene.text.Font;

import javafx.event.ActionEvent;

//Scene 1:  Welcome layout
public class WelcomeLayout{
  class Handler implements eHandler{
    
     @Override
      public boolean EventHandler(){
      return false;
     }
   }
   
    interface eHandler{
    abstract boolean EventHandler();

   }  
   //Initializing the variables for each section of the welcome page
   private static TextArea TextPlaceHolder = new TextArea();
   private Button ExitButton = new Button();
   private Button LoginButton = new Button();
   
   private VBox WelcomeScreenInfo = new VBox();
   private VBox inputUserInfo = new VBox();

   private HBox exitLoginButtons = new HBox();
   
   Scene AppDisplay;
   Scene Scene2;
   Scene Scene3;
   
   WeightAppStyleSheet StyleSheet=new WeightAppStyleSheet();
   WeightAppButtonFunctions Buttonfunctions = new WeightAppButtonFunctions();
      
   //what user sees when they initially open the app
   public Scene WelcomeScreen(GridPane WelcomePane,Stage weightAppScreen){
      Image BannerLogo = new Image("file:src/ComfortCalLogo.png", 180, 180, false, false);
      ImageView ComfortCalLogo=new ImageView(BannerLogo);
      
      //TextPlaceHolder.setAlignment(Pos.BASELINE_CENTER);
      
      // (Banner/logo, greeting, etc.)
      Text BannerPlaceHolder = new Text("ComfortCal");
      BannerPlaceHolder.setFont(Font.font("Magneto", FontWeight.BOLD, 30));
      Text WelcomeMessage = new Text("Hi, Welcome!");
      WelcomeMessage.setFont(Font.font("Magneto", FontWeight.BOLD, 30));
      WelcomeMessage.setStroke(Color.BLACK);
      WelcomeMessage.setFill(Color.BLACK);
      
      
      // "Exit" is a button that closes the GUI completely.
      ExitButton = new Button("Exit");
      ExitButton.setFont(Font.font("Magneto", FontWeight.BOLD, 25));
      ExitButton.setStyle("-fx-background-color: #CB6FAC; ");

      
      // "Login" is a button that takes you to the user input scene.
      LoginButton = new Button("Enter");
      LoginButton.setFont(Font.font("Magneto", FontWeight.BOLD, 25));
      LoginButton.setStyle("-fx-background-color: #CB6FAC; ");

      
      exitLoginButtons = new HBox(ExitButton,LoginButton);
      
      //add all sections to VBox
      WelcomeScreenInfo = new VBox(ComfortCalLogo,WelcomeMessage,exitLoginButtons);
      WelcomePane.add(WelcomeScreenInfo,0,0); //add VBox to gridpane
      
      //call stylesheet class
      WeightAppStyleSheet.WelcomeLayoutColor(WelcomePane,WelcomeScreenInfo, exitLoginButtons,
                  exitLoginButtons,ExitButton,LoginButton); 
      
      ExitButton.setOnAction(event->{
    	  System.out.println("User ended Service");   
          weightAppScreen.close();
      });
      LoginButton.setOnAction(event->{
    	  WelcomePane.getChildren().remove(WelcomeScreenInfo);
    	  WeightAppButtonFunctions.WelcomeLayoutBtnCntrl(userInputScene(AppDisplay, WelcomePane,weightAppScreen),ExitButton,LoginButton,WelcomePane, weightAppScreen);     
      });  
             
      //add to scene
      AppDisplay = new Scene(WelcomePane);
      return AppDisplay;
   } 
   
   //scene after login button is pressed
   public Scene userInputScene(Scene getUserInput, GridPane userPane,Stage weightAppScreen){
	      //white shape to put behind the text for clarity
	   	  StackPane root = new StackPane();
		  Rectangle r = new Rectangle(20, 20, 100, 200);
		  r.setFill(Color.WHITE);
		  root.getChildren().addAll(r);

	   	  //setting up stuff to get inputs from user
	      Text askUser = new Text("In order to better understand\nyour caloric needs, we need to\n" +
	      				"get some information.\n\nPlease enter your height and weight.");
	      askUser.setTextOrigin(VPos.CENTER);
	      askUser.setFont(Font.font("Ariel", FontWeight.SEMI_BOLD, 20));
	      
	      //appearance for the height input
	      Label userHeight = new Label("Height:");
	      Label heightMeas = new Label("in meters");
	      userHeight.setFont(Font.font("Arial", FontWeight.BOLD, 15));
	      heightMeas.setFont(Font.font("Arial", FontWeight.BOLD, 15));
	      TextField heightField = new TextField ();
	      HBox heightBox = new HBox();
	      heightBox.getChildren().addAll(userHeight, heightField, heightMeas);
	      heightBox.setSpacing(10); 
	      
	      //appearance for the weight input
	      Label userWeight = new Label("Weight:");
	      Label weightMeas = new Label("in kilograms");
	      userWeight.setFont(Font.font("Arial", FontWeight.BOLD, 15));
	      weightMeas.setFont(Font.font("Arial", FontWeight.BOLD, 15));
	      TextField weightField = new TextField ();
	      HBox weightBox = new HBox();
	      weightBox.getChildren().addAll(userWeight, weightField, weightMeas);
	      weightBox.setSpacing(10);
	      
	      //appearance for the bmi calculations
	      Text BMIValue = new Text(); //displays BMI
	      Text BMIDisplay = new Text("Calculated BMI: ");
	      BMIValue.setFont(Font.font("Arial", FontWeight.BOLD, 15));
	      BMIDisplay.setFont(Font.font("Arial", FontWeight.BOLD, 15));
	      HBox BMIBox = new HBox();
	      BMIBox.getChildren().addAll(BMIDisplay, BMIValue);
	      BMIBox.setSpacing(10);
	      
	      //add all of the hboxes to the vbox
	      inputUserInfo = new VBox(askUser,heightBox, weightBox, BMIBox);
	      inputUserInfo.setSpacing(20);
	      userPane.add(inputUserInfo,0,0); //add VBox to gridpane
	      
	      //this button should be connected to the program that calculates the bmi
	      Button Calculate = new Button("Calculate");
	      Calculate.setOnAction(event->{
		     double height = Double.parseDouble(heightField.getText());
		     double weight = Double.parseDouble(weightField.getText());	  
		     
		     //called brooke's method
		     calorieCalculators CCalculator = new calorieCalculators(0, 0, height, weight);
		     BMIValue.setText(String.valueOf(CCalculator.calculateBMI(height, weight)));
		     System.out.println("calculating bmi...\n" +CCalculator.calculateBMI(height, weight)); //testing (works)
		     
	      });
	      
	      BMIValue.setTextOrigin(VPos.CENTER);
	      
	      Button Scene3 = new Button("Next");
	      
	      VBox Buttons= new VBox(Calculate,Scene3);
	      userPane.add(Buttons, 0, 1);
	      
	      Scene3.setOnAction(event->{
	        userPane.getChildren().removeAll();
	        //double.parseDouble(heightField.getText());

	        
	        
         	GridPane DashPane = new GridPane();
         
         	WeightAppDashboard DashDrop=new WeightAppDashboard();
         	weightAppScreen.setScene(DashDrop.DashBoard(getUserInput,DashPane,weightAppScreen, TextPlaceHolder));
         	
         	
	        });

	      
	      return getUserInput;
	   }
}