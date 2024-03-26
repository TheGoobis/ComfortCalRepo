package application;
// style sheet for the whole program
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Cursor;
import java.util.concurrent.TimeUnit;

public class WeightAppStyleSheet{
   public static void WelcomeLayoutColor(GridPane WelcomePane, VBox WelcomeScreenInfo, HBox exitloginButtons, HBox exitLoginButtons, Button ExitButton, Button LoginButton){
                  
      WelcomePane.setAlignment(Pos.TOP_CENTER);
      WelcomePane.setPadding(new Insets(10,10,0,10)); 
      WelcomePane.setStyle("-fx-background-image: url('file:src/compWizards.png');"+ "-fx-background-repeat: stretch;" +
    	        "-fx-background-size: 1000 700;" +
    	        "-fx-background-position: center center;");
      
      WelcomeScreenInfo.setAlignment(Pos. CENTER);
      WelcomeScreenInfo.setSpacing(30);
      
      exitloginButtons.setSpacing(150);
      exitloginButtons.setAlignment(Pos.CENTER);
           
      
     System.out.println("buttons for welcome layout has been implemented");
   }
   
   /* old code, no longer implementing accounts
		   public static void CreateAccountColor(){
     System.out.println("buttons for create account has been implemented");
   }*/
   
   
   public void AddFoodItemColor(GridPane AddPane){
     System.out.println("buttons for add food has been implemented");
     
     AddPane.setAlignment(Pos.TOP_CENTER);
     AddPane.setPadding(new Insets(10,10,0,10)); 
     AddPane.setStyle("-fx-background-image: url('file:src/compWizards.png');"+ "-fx-background-repeat: stretch;" +
 	        "-fx-background-size: 1000 700;" +
 	        "-fx-background-position: center center;");   
   }	
   
   public static void DashboardColor(GridPane DashPane,TextArea DashBoardHistory, HBox Titles,VBox DashboardVB,
		   								TextField DailyIntakeVal, TextField CurrentConVal,TextField Remainder,VBox DisplayVBoxOne){
	      DailyIntakeVal.setEditable(false);;
	      DailyIntakeVal.setText(DailyIntakeVal.getText());
	      CurrentConVal.setEditable(false);;
	      CurrentConVal.setText(CurrentConVal.getText());
	      Remainder.setEditable(false);;
	      Remainder.setText(Remainder.getText());
	   
	      DashPane.setAlignment(Pos.TOP_CENTER);
	      DashPane.setPadding(new Insets(10,10,0,10)); 
	      DashPane.setStyle("-fx-background-image: url('file:src/compWizards.png');"+ "-fx-background-repeat: stretch;" +
	    	        "-fx-background-size: 1000 700;" +
	    	        "-fx-background-position: center center;");

	      Titles.setSpacing(21);
	      Titles.setAlignment(Pos. CENTER);     
	       
	      DashboardVB.setAlignment(Pos. CENTER);
	      DashboardVB.setSpacing(15);
	      
	      DashBoardHistory.setPrefWidth(320);
	      DashBoardHistory.setPrefHeight(150);
	      DashBoardHistory.setStyle("-fx-verticle-align: top");
	      //DashBoardHistory.setResizable(null);
	      
	       
	      DashBoardHistory.setEditable(false);
	      DashBoardHistory.setBackground(null);      
	      DashBoardHistory.setText(DashBoardHistory.getText());
	   System.out.println("color dashboard has been implemented");
   }
   
   public static void UserLayoutColor(GridPane userPane, VBox inputInfo){
       
	   userPane.setAlignment(Pos.TOP_CENTER);
	   userPane.setPadding(new Insets(10,10,0,10)); 
	   userPane.setStyle("-fx-background-image: url('file:src/compWizards.png');"+ "-fx-background-repeat: stretch;" +
	    	        "-fx-background-size: 1000 700;" +
	    	        "-fx-background-position: center center;");
	   inputInfo.setAlignment(Pos. CENTER);
	   inputInfo.setSpacing(30);
	      
   }
}