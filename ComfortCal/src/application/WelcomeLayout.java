package application;
// this class is for the welcome layout scene1

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
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
   //initilizing the variables for each section of the welcome page
   private Button ExitButton = new Button();
   private Button NewUserCreatorButton = new Button();
   private Button LoginButton = new Button();
   
   private VBox WelcomeScreenInfo = new VBox();
   private HBox UserNameHb = new HBox();
   private HBox PasswordHb = new HBox();
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
      Text WelcomeMessage = new Text("Hi, Welcome!");
      
      // Asks user to enter their Username* and password into their respective text boxes.
      Text UserNameText = new Text("Username:");
      Text PasswordText = new Text("Password:");

      TextField TypeUserName = new TextField();
      TextField TypePassword = new TextField();    
      
      // "Exit" is a button that closes the GUI completely.
      ExitButton = new Button("Exit");
      
      // "New user?" is a button that takes you to scene 2.
      NewUserCreatorButton = new Button("New User?");
      
      // "Login" is a button that takes you to scene 3.
      LoginButton = new Button("Login");
      
      //Combine info for VBox in Hbox
      UserNameHb = new HBox(UserNameText,TypeUserName);
      PasswordHb = new HBox(PasswordText,TypePassword);
      exitLoginButtons = new HBox(ExitButton,LoginButton);
      
      //add all sections to VBox
      WelcomeScreenInfo = new VBox(ComfortCalLogo,WelcomeMessage,UserNameHb,PasswordHb,NewUserCreatorButton,exitLoginButtons);
      WelcomePane.add(WelcomeScreenInfo,0,0); //add VBox to gridpane
      
      //call stylesheet class
      StyleSheet.WelcomeLayoutColor(WelcomePane,WelcomeScreenInfo,UserNameHb,PasswordHb,exitLoginButtons,TypeUserName,TypePassword,
                  exitLoginButtons,ExitButton,NewUserCreatorButton,LoginButton);
      Buttonfunctions.WelcomeLayoutBtnCntrl(ExitButton,NewUserCreatorButton,LoginButton,WelcomePane,Scene2,Scene3,weightAppScreen);                 
      //add to scene
      WelcomeLog = new Scene(WelcomePane);
      return WelcomeLog;
   } 
}