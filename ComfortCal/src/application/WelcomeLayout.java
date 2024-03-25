package application;
// class for the welcome layout
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontWeight;
//import javafx.scene.control.Label;
//import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
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
   private Button ExitButton = new Button();
   private Button LoginButton = new Button();
   
   private VBox WelcomeScreenInfo = new VBox();

   private HBox exitLoginButtons = new HBox();
   
   Scene Scene2;
   Scene Scene3;
   
   //what user sees when they initially open the app
   public Scene WelcomeScreen(Scene WelcomeLog, GridPane WelcomePane,Stage weightAppScreen){
      //call StyleSheet class
      WeightAppStyleSheet StyleSheet=new WeightAppStyleSheet();
      WeightAppButtonFunctions Buttonfunctions = new WeightAppButtonFunctions();
      

      
      Image BannerLogo = new Image("file:src/ComfortCalLogo.png", 180, 180, false, false);
      ImageView ComfortCalLogo=new ImageView(BannerLogo);

      
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

      
      // "Login" is a button that takes you to scene 2.
      LoginButton = new Button("Login");
      LoginButton.setFont(Font.font("Magneto", FontWeight.BOLD, 25));
      LoginButton.setStyle("-fx-background-color: #CB6FAC; ");

      
      exitLoginButtons = new HBox(ExitButton,LoginButton);
      
      //add all sections to VBox
      WelcomeScreenInfo = new VBox(ComfortCalLogo,WelcomeMessage,exitLoginButtons);
      WelcomePane.add(WelcomeScreenInfo,0,0); //add VBox to gridpane
      
      //call stylesheet class
      StyleSheet.WelcomeLayoutColor(WelcomePane,WelcomeScreenInfo, exitLoginButtons,
                  exitLoginButtons,ExitButton,LoginButton);
      Buttonfunctions.WelcomeLayoutBtnCntrl(ExitButton,LoginButton,Scene2, weightAppScreen);                 
      //add to scene
      WelcomeLog = new Scene(WelcomePane);
      return WelcomeLog;
   } 
}