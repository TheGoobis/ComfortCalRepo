package application;
//main class for displaying the information only!!

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class weightApp extends Application{
 public static void main(String[] args){
   launch(args);
 }
 //initialize application window
 Stage weightAppScreen;
 Scene WelcomeLogin;
 
 @Override
 public void start(Stage primaryStage) throws Exception{
  WelcomeLayout DropPage=new WelcomeLayout();
 
  weightAppScreen= primaryStage;
  GridPane EnterScene=new GridPane();
  
  primaryStage.setScene(DropPage.WelcomeScreen(WelcomeLogin, EnterScene, weightAppScreen));
  weightAppScreen.setTitle("ComfortCal");
  weightAppScreen.setWidth(350);
  weightAppScreen.setHeight(450);
  weightAppScreen.show();
 }
}