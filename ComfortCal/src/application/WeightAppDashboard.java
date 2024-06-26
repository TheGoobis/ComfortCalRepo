package application;
//this class is for the dashboard screen scene3
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
//import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
//import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeightAppDashboard{
   //initializing the textfields that display each section of a meal
      

   private HBox LogDisplayTitlesHBox = new HBox();
   private VBox LogDisplayVBox = new VBox();
   private HBox LargerDisplayHBox = new HBox();
   private WelcomeLayout WelcomeScene1=new WelcomeLayout();
   private TextField UserInput = new TextField();
   //private DashBoard DashScene3=new DashBoard();
   
   Scene Scene3;
   Scene Scene4;
   public Scene DashBoard(Scene Scene1, GridPane DashPane, Stage WeightAppScreen, TextArea DashBoardHistory, Text BMIValue,Double maxCal){
      WeightAppStyleSheet StyleSheet=new WeightAppStyleSheet();
      WeightAppButtonFunctions Buttonfunctions = new WeightAppButtonFunctions();
      
      //dashboard title
      Text DashboardName = new Text("welcome to your Dashboard");
      DashboardName.setFont(Font.font(25));
      
      //DashPane.setGridLinesVisible(true);
      
      //text area 3 of them
      TextField DailyIntakeVal = new TextField();
      DailyIntakeVal.setPrefWidth(50);
      DailyIntakeVal.setPrefHeight(10);
      DailyIntakeVal.setEditable(false);
      DailyIntakeVal.setBackground(null);
      DailyIntakeVal.setFont(Font.font(15));
      
      //set as user input value from previous scene
      DailyIntakeVal.setText(maxCal.toString());
      DailyIntakeVal.setAlignment(Pos.CENTER); 
      
      TextField CurrentConVal = new TextField();
      CurrentConVal.setPrefWidth(50);
      CurrentConVal.setPrefHeight(10);
      CurrentConVal.setEditable(false);
      CurrentConVal.setBackground(null);
      CurrentConVal.setFont(Font.font(15));
      
      //set as user input value from previous scene
      
 
      
      TextField Remainder = new TextField();
      Remainder.setPrefWidth(50);
      Remainder.setPrefHeight(10);
      Remainder.setEditable(false);
      Remainder.setBackground(null);
      Remainder.setFont(Font.font(15));
      
      int UserInput = 0;
      //Double CurrentNumbers = maxCal-UserInput; //here
      
      //Double RemainderVal = maxCal-CurrentNumbers;
      CurrentConVal.setText(String.valueOf(UserInput));
      CurrentConVal.setAlignment(Pos.CENTER); 
      
      //set as user input value from previous scene
      Remainder.setText(maxCal.toString());
      Remainder.setAlignment(Pos.CENTER);     
      
      Text intakeGoal = new Text("Set Goal" ); 
      Text currentCon = new Text("current");
      Text RemainderCount = new Text("Remaining");
      
      Text HistoryLogName = new Text("History log");
      
      Text LogDisplayFoodName = new Text("Food name");
      Text LogDisplayMTypeName = new Text("Meal Type");
      Text LogDisplayCalName = new Text("Calories");
      Text LogDisplayTimeName = new Text("Time");
      Text LogDisplayDateName = new Text("Date");
      
      
      
      LogDisplayTitlesHBox = new HBox(LogDisplayFoodName,LogDisplayMTypeName,LogDisplayCalName,LogDisplayDateName,LogDisplayTimeName); 
      LargerDisplayHBox = new HBox(DailyIntakeVal,CurrentConVal,Remainder);
      LargerDisplayHBox.setSpacing(30);
      LargerDisplayHBox.setAlignment(Pos.CENTER);
      
      HBox LargerDisplayHBoxNames = new HBox(intakeGoal,currentCon,RemainderCount);
      LargerDisplayHBoxNames.setAlignment(Pos.CENTER);
      LargerDisplayHBoxNames.setSpacing(40);
      
  
  
      Button AddToLogB = new Button("Add");
      Button LogoutB = new Button("Exit Dashboard");
      
      //DashBoardHistory = new TextArea();    
      VBox DisplayVBoxOne = new VBox(DashboardName,LargerDisplayHBoxNames, LargerDisplayHBox);
      DisplayVBoxOne.setBackground(new Background(new BackgroundFill
    		  (Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
      DisplayVBoxOne.setSpacing(15);
      
      LogDisplayVBox = new VBox(DashBoardHistory);
      LogDisplayVBox.setAlignment(Pos.BASELINE_CENTER);
      DisplayVBoxOne.setAlignment(Pos.BASELINE_CENTER);
      
      
      VBox AddVB = new VBox(AddToLogB,LogoutB);
      AddVB.setSpacing(15);
      
      GridPane HistoryLogAdd = new GridPane();
      //HistoryLogAdd.setAlignment(Pos. CENTER);
      
      HistoryLogAdd.add(LogDisplayVBox,0,0);
      
      DashPane.add(DisplayVBoxOne, 0, 0);
      DashPane.add(LogDisplayTitlesHBox,0,1);                 
      DashPane.add(LogDisplayVBox,0,2);
      DashPane.add(AddVB,0,3);
      
      WeightAppStyleSheet.DashboardColor(DashPane,DashBoardHistory,LogDisplayTitlesHBox,LogDisplayVBox,DailyIntakeVal,CurrentConVal,Remainder,DisplayVBoxOne );
      WeightAppButtonFunctions.DashboardLayoutBtnCntrl(AddToLogB,LogoutB,LogDisplayVBox,DashPane,HistoryLogAdd,Scene1,Scene4,WeightAppScreen,DashBoardHistory,DailyIntakeVal,CurrentConVal,Remainder);
      
      WeightAppAddPage weightAppAddPage = new WeightAppAddPage();
	  
      
      
      Scene3 = new Scene(DashPane);
      return Scene3;
   }
}