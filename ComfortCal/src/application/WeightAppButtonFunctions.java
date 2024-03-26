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
    public static void WelcomeLayoutBtnCntrl(Scene Scene2,Button ExitButton, Button LoginButton, GridPane SceneGridPane1,Stage weightAppScreen){
      //SceneGridPane1.getChildren().removeAll();
      //exits application
      ExitButton.setOnAction(event->{
         System.out.println("User ended Service");   
         weightAppScreen.close();
      });
      
      //takes you to scene
      LoginButton.setOnAction(event->{
    	 System.out.println("here");
    	 WelcomeLayout Scene1 = new WelcomeLayout();
    	 
    	 Scene1.userInputScene(Scene2, SceneGridPane1 ,weightAppScreen);
         weightAppScreen.setScene(Scene2); 
         
      });
      
    }
    
    
 /*   public static void DashboardLayoutBtnCntrl(Button AddButton, Button LogoutButton,VBox HistoryLog,GridPane Scene2Gridpane,GridPane Scene4Pane,
    		  				Scene Scene1,Scene Scene4,Stage weightAppScreen,TextArea DashBoardHistory){
    	 TextField Placeholder1 = new TextField();
    	 TextField Placeholder2 = new TextField();
    	 TextField Placeholder3 = new TextField();
    	
    	 System.out.println("happens here");
    	 
    	 AddButton.setOnAction(event->{
    		Scene2Gridpane.getChildren().removeAll();

    		//GridPane AddFoodPane = new GridPane();
    		Scene4Pane.add(HistoryLog,0,1);

    		WeightAppAddPage AddDrop=new WeightAppAddPage();
    		weightAppScreen.setScene(AddDrop.AddToHistory(Scene4,Scene4Pane,DashBoardHistory,weightAppScreen, HistoryLog, Placeholder1,Placeholder2,Placeholder3));
    	    }); 

    	 LogoutButton.setOnAction(event->{
    		 Scene2Gridpane.getChildren().removeAll();

    		 GridPane DashPane = new GridPane();

    		 WeightAppDashboard DashDrop=new WeightAppDashboard();
    		 WelcomeLayout WelcomeAppScreen= new WelcomeLayout();

    		 weightAppScreen.setScene(WelcomeAppScreen.WelcomeScreen(DashPane,weightAppScreen)); 
    	 }); 
      } 
    
 */   
    
    public static void DashboardLayoutBtnCntrl(Button AddButton, Button LogoutButton,VBox HistoryLog,GridPane Scene2Gridpane,GridPane Scene4Pane,
            Scene Scene1,Scene Scene4,Stage weightAppScreen,TextArea DashBoardHistory, TextField DailyIntakeVal, TextField CurrentConVal,TextField remainder){
    	 //TextField Placeholder1 = new TextField();
    	 //TextField Placeholder2 = new TextField();
    	 //TextField Placeholder3 = new TextField();
    	
    		AddButton.setOnAction(event->{
    			Scene2Gridpane.getChildren().removeAll();
    				
    			
    			
    			//Scene4Pane.add(HistoryLog,0,0);

    			WeightAppAddPage AddDrop=new WeightAppAddPage();
    			weightAppScreen.setScene(AddDrop.AddToHistory(Scene4,Scene4Pane,DashBoardHistory,weightAppScreen, HistoryLog,DailyIntakeVal, CurrentConVal,remainder));
    		}); 
    		
    	    LogoutButton.setOnAction(event->{
    	        Scene2Gridpane.getChildren().removeAll();
    	          
    	        GridPane DashPane = new GridPane();
    	          
    	        WeightAppDashboard DashDrop=new WeightAppDashboard();
    	        WelcomeLayout WelcomeAppScreen= new WelcomeLayout();
    	          
    	        weightAppScreen.setScene(WelcomeAppScreen.WelcomeScreen(DashPane,weightAppScreen));
    	    }); 		
    }
    
    public static void AddLayoutBtnCntrl(ComboBox<String> MTypeChoice,ComboBox<String> TimeChoice,TextField LogDisplayFood,
            TextField LogDisplayCal,TextField LogDisplayTime, TextField LogDisplayDate,
            TextArea FoodHistoryDisplay,Button AddButton, Button returnButton,VBox HistoryLog,
            GridPane Scene4Gridpane,Scene Scene1,Scene Scene3,Stage weightAppScreen,TextField GoalCaloryCounter, TextField CurrentCalCounter, TextField RemainingCalCounter){
    	
    	HistoryLogDataHandler History=new HistoryLogDataHandler();

    	AddButton.setOnMouseClicked(MouseEvent->{
    		History.HistoryLog(Scene4Gridpane,LogDisplayFood,LogDisplayCal,LogDisplayTime,
    						LogDisplayDate,MTypeChoice,TimeChoice, FoodHistoryDisplay,GoalCaloryCounter,CurrentCalCounter,RemainingCalCounter);
    	
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