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
   public static void WelcomeLayoutColor(GridPane WelcomePane, VBox WelcomeScreenInfo, HBox UserNameHb, HBox PasswordHb,HBox exitloginButtons,TextField UserNameBox,
                                 TextField PasswordBox, HBox exitLoginButtons,Button ExitButton, Button NewUserCreatorButton, Button LoginButton){
                  
      WelcomePane.setAlignment(Pos.TOP_CENTER);
      WelcomePane.setPadding(new Insets(10,10,0,10)); 
      WelcomePane.setStyle("-fx-background-color: #FFA07A");
      
      WelcomeScreenInfo.setAlignment(Pos. CENTER);
      WelcomeScreenInfo.setSpacing(15);
      
      UserNameHb.setSpacing(50);
      PasswordHb.setSpacing(50);
      
      exitloginButtons.setSpacing(200);
      exitloginButtons.setAlignment(Pos.CENTER);
           
      //username field sizing
      UserNameBox.setPrefWidth(250);
      UserNameBox.setPrefHeight(30);
      
      //password field sizing
      PasswordBox.setPrefWidth(250);
      PasswordBox.setPrefHeight(30);
      
     System.out.println("buttons for welcome layout has been implemented");
   }
   
   public static void CreateAccountColor(){
     System.out.println("create your acocunt color has been implemented");
   }
   
   public static void DashboardColor(GridPane DashPane,TextArea DashBoardHistory, HBox Titles,VBox DashboardVB){

	      DashPane.setAlignment(Pos.TOP_CENTER);
	      DashPane.setPadding(new Insets(10,10,0,10)); 
	      DashPane.setStyle("-fx-background-color: #FFA07A");

	      Titles.setSpacing(21);
	      Titles.setAlignment(Pos. CENTER);     
	       
	      DashboardVB.setAlignment(Pos. CENTER);
	      DashboardVB.setSpacing(15);
	      
	      DashBoardHistory.setPrefWidth(355);
	      DashBoardHistory.setPrefHeight(150);
	      DashBoardHistory.setStyle("-fx-verticle-align: top");
	      //DashBoardHistory.setResizable(null);
	      
	       
	      DashBoardHistory.setEditable(false);
	      DashBoardHistory.setBackground(null);      
	      DashBoardHistory.setText(DashBoardHistory.getText());
	   System.out.println("color dashboard has been implemented");
   }
   
   public static void AddFoodItemColor(GridPane AddPane){
	   AddPane.setAlignment(Pos.TOP_CENTER);
	   AddPane.setPadding(new Insets(10,10,0,10)); 
	   AddPane.setStyle("-fx-background-color: #FFA07A"); 
     System.out.println("style for add has been implemented");
   }
}