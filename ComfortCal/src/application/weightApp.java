package application;
//main class for displaying the information only!!
//Cierrah Washington
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
 //Scene WelcomeLogin;
 
 @Override
 public void start(Stage primaryStage) throws Exception{
	 WelcomeLayout DropPage=new WelcomeLayout();
 
	 weightAppScreen= primaryStage;
	 GridPane EnterScene=new GridPane();
  
	primaryStage.setScene(DropPage.WelcomeScreen(EnterScene, weightAppScreen));
  	weightAppScreen.setTitle("ComfortCal");
  	weightAppScreen.setWidth(450);
  	weightAppScreen.setHeight(500);
  	weightAppScreen.show();
 }

}