package application;
//this class is for the dashboard screen scene3
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
   private WelcomeLayout WelcomeScene1=new WelcomeLayout();
   //private DashBoard DashScene3=new DashBoard();
   
   Scene Scene3;
   Scene Scene4;
   public Scene DashBoard(Scene Scene1, GridPane DashPane, Stage WeightAppScreen, TextArea DashBoardHistory){
      WeightAppStyleSheet StyleSheet=new WeightAppStyleSheet();
      WeightAppButtonFunctions Buttonfunctions = new WeightAppButtonFunctions();
      
      Text HistoryLogName = new Text("History log");
      
      Text LogDisplayFoodName = new Text("Food name");
      Text LogDisplayMTypeName = new Text("Meal Type");
      Text LogDisplayCalName = new Text("Calories");
      Text LogDisplayTimeName = new Text("Time");
      Text LogDisplayDateName = new Text("Date");
      
      LogDisplayTitlesHBox = new HBox(LogDisplayFoodName,LogDisplayMTypeName,LogDisplayCalName,LogDisplayTimeName,LogDisplayDateName);
      
     
      Button AddToLogB = new Button("Add");
      Button LogoutB = new Button("logout");
      
      //DashBoardHistory = new TextArea();    
      LogDisplayVBox = new VBox(LogDisplayTitlesHBox,DashBoardHistory);
      VBox AddVB = new VBox(AddToLogB,LogoutB);
      GridPane HistoryLogAdd = new GridPane();
      
      HistoryLogAdd.add(LogDisplayVBox,0,0);
      
      DashPane.add(LogDisplayVBox,0,0);
      DashPane.add(AddVB,0,1);
      
      StyleSheet.DashboardColor(DashPane,DashBoardHistory,LogDisplayTitlesHBox,LogDisplayVBox);
      Buttonfunctions.DashboardLayoutBtnCntrl(AddToLogB,LogoutB,LogDisplayVBox,DashPane,HistoryLogAdd,Scene1,Scene4,WeightAppScreen,DashBoardHistory);
   
      Scene3 = new Scene(DashPane);
      return Scene3;
   }
}