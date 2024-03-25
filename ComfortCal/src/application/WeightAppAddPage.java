package application;
//this class is to add to the history log scene4
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

public class WeightAppAddPage{
    public ComboBox<String> MTypeChoice = new ComboBox<>();
    public ComboBox<String> TimeChoice = new ComboBox<>();//am or pm
    public TextField LogDisplayFood= new TextField();
    public TextField LogDisplayCal= new TextField();
    public TextField LogDisplayTime= new TextField();
    public TextField LogDisplayDate= new TextField();
    private HBox DataRowOne = new HBox();  
    private HBox DataRowTwo = new HBox(); 
    
    Scene Scene1;
    Scene Scene3;
    public Scene AddToHistory(Scene Scene4, GridPane AddPane, TextArea FoodHistoryDisplay,Stage WeightAppScreen){
      WeightAppStyleSheet StyleSheet = new WeightAppStyleSheet();
      WeightAppButtonFunctions Buttonfunctions = new WeightAppButtonFunctions();
      
      MTypeChoice.getItems().addAll("Breakfast","Lunch","Dinner","Snack");       
      TimeChoice.getItems().addAll("A.M.","P.M");
      
      Text AddText = new Text("Add your food item information here");
      Text FoodName = new Text("Food Name:");
      Text calName = new Text("calories:");
      Text MtypeName = new Text("Meal Type:");
      Text TimeName = new Text("Time:");
      Text dateName = new Text("date:");
      
      Button AddToLogB = new Button("Add to log");
      Button ReturnToDashB = new Button("return to dashboard");
      
      HBox FoodNameHB = new HBox(FoodName,LogDisplayFood, calName,LogDisplayCal);
      HBox MtypeNameHB = new HBox(MtypeName,MTypeChoice);
      HBox TimeValHB = new HBox(TimeName,LogDisplayTime);
      HBox dateValHB = new HBox(dateName,LogDisplayDate);
      
      DataRowOne = new HBox(FoodNameHB,MtypeNameHB);
      DataRowTwo = new HBox(TimeValHB,dateValHB);
      
      VBox DataBox = new VBox(DataRowOne,DataRowTwo);
      
        
      AddPane.add(DataBox,0,2);
      AddPane.add(AddToLogB,0,3);
      AddPane.add(ReturnToDashB,0,4);
      
      //StyleSheet.AddFoodItemColor(AddPane);
      //Buttonfunctions.AddLayoutBtnCntrl(MTypeChoice, TimeChoice,LogDisplayFood,LogDisplayCal, LogDisplayTime,
                                       //LogDisplayDate,FoodHistoryDisplay,AddToLogB,ReturnToDashB,DataBox,
                                       //AddPane,Scene1,Scene3,WeightAppScreen);
     
      Scene4 = new Scene(AddPane);
      return Scene4;
    }
}