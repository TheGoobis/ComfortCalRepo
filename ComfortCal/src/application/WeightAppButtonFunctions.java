package application;
//this class holds Button functions for the whole program

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
	private static TextArea TextPlaceHolder = new TextArea();
    public static void WelcomeLayoutBtnCntrl(Button ExitButton, Button NewUserCreatorButton, Button LoginButton,GridPane Scene1Gridpane, Scene Scene2,Scene Scene3,Stage weightAppScreen){
      
        WeightAppDashboard DashBoardScene = new WeightAppDashboard();
        //exits appication
        ExitButton.setOnAction(event->{
           System.out.println("User ended Service");   
           weightAppScreen.close();
        });
        
        //takes you to scene 2
        NewUserCreatorButton.setOnAction(event->{
           
        });
        
        //takes you to scene 3
        LoginButton.setOnAction(event->{
           Scene1Gridpane.getChildren().removeAll();
           
           GridPane DashPane = new GridPane();
           
           WeightAppDashboard DashDrop=new WeightAppDashboard();
           weightAppScreen.setScene(DashDrop.DashBoard(Scene3,DashPane,weightAppScreen, TextPlaceHolder));
        });            
    }  
    
    public static void DashboardLayoutBtnCntrl(Button AddButton, Button LogoutButton,VBox HistoryLog,GridPane Scene2Gridpane,GridPane Scene4Pane,
            Scene Scene1,Scene Scene4,Stage weightAppScreen,TextArea DashBoardHistory){
    		AddButton.setOnAction(event->{
    			Scene2Gridpane.getChildren().removeAll();

    			//GridPane AddFoodPane = new GridPane();
    			Scene4Pane.add(HistoryLog,0,0);

    			WeightAppAddPage AddDrop=new WeightAppAddPage();
    			weightAppScreen.setScene(AddDrop.AddToHistory(Scene4,Scene4Pane,DashBoardHistory,weightAppScreen));
    		}); 
    		
    	    LogoutButton.setOnAction(event->{
    	        Scene2Gridpane.getChildren().removeAll();
    	          
    	        GridPane DashPane = new GridPane();
    	          
    	        WeightAppDashboard DashDrop=new WeightAppDashboard();
    	        WelcomeLayout WelcomeAppScreen= new WelcomeLayout();
    	          
    	        weightAppScreen.setScene(WelcomeAppScreen.WelcomeScreen(Scene1,DashPane,weightAppScreen));
    	    }); 		
    }
    
    public static void AddLayoutBtnCntrl(ComboBox<String> MTypeChoice,ComboBox<String> TimeChoice,TextField LogDisplayFood,
            TextField LogDisplayCal,TextField LogDisplayTime, TextField LogDisplayDate,
            TextArea FoodHistoryDisplay,Button AddButton, Button returnButton,VBox HistoryLog,
            GridPane Scene4Gridpane,Scene Scene1,Scene Scene3,Stage weightAppScreen){
    	
    	HistoryLogDataHandler History=new HistoryLogDataHandler();

    	AddButton.setOnMouseClicked(MouseEvent->{
    		History.HistoryLog(Scene4Gridpane,LogDisplayFood,LogDisplayCal,LogDisplayTime,
    						LogDisplayDate,MTypeChoice,TimeChoice, FoodHistoryDisplay);

    	});  

    	returnButton.setOnAction(event->{
    		Scene4Gridpane.getChildren().removeAll();  

    		WeightAppDashboard DashDrop=new WeightAppDashboard();
    		WelcomeLayout WelcomeAppScreen= new WelcomeLayout();
    		GridPane DashPane = new GridPane();
                       
    		weightAppScreen.setScene(DashDrop.DashBoard(Scene3,DashPane,weightAppScreen,FoodHistoryDisplay)); 
    	});   
    } 
}