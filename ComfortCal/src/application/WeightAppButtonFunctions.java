package application;
//Button functions
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

public class WeightAppButtonFunctions{
    public static void WelcomeLayoutBtnCntrl(Button ExitButton, Button LoginButton, Scene Scene2,Stage weightAppScreen){
      
      //exits application
      ExitButton.setOnAction(event->{
         System.out.println("User ended Service");   
         weightAppScreen.close();
      });
      
      //takes you to scene 2
      LoginButton.setOnAction(event->{
         weightAppScreen.setScene(Scene2);
         
      });            
    }  
      
}