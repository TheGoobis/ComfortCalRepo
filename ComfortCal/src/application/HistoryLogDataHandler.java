package application;
/*this class helps keep track of the history so it can move through each scene the
history is meant to be displayed in*/

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
import javafx.scene.control.TextField; //can not use \n or \r
import javafx.scene.control.TextArea; //able to use \n and \r
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.StringTokenizer;
import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Cursor;
import java.util.concurrent.TimeUnit;//time between sending messages

public class HistoryLogDataHandler extends WeightAppAddPage{
   public TextArea HistoryLog(GridPane Scene4Gridpane,TextField LogDisplayFood, TextField LogDisplayCal, 
                              TextField LogDisplayTime,TextField LogDisplayDate,ComboBox<String> MTypeChoice,
                              ComboBox<String> TimeChoice, TextArea FoodHistoryDisplay,TextField GoalCaloryCounter, TextField CurrentCalCounter, TextField RemainingCalCounter) {
                              
      
      System.out.println("History log data handler in use");
      
      
      FoodHistoryDisplay.setText(FoodHistoryDisplay.getText()+"\n "+LogDisplayFood.getText()+"       "
      		+ ""+MTypeChoice.getValue()+"        "+LogDisplayCal.getText()+ "       "+LogDisplayDate.getText()+"     " +LogDisplayTime.getText()+" "+TimeChoice.getValue());
      
      //turn into integers
      
      Integer.valueOf(GoalCaloryCounter.getText()); //the set calorie in-take goal
      Integer.valueOf(CurrentCalCounter.getText()); //how many the user current has consumed
      Integer.valueOf(RemainingCalCounter.getText()); //remaining calories
      
      calorieCalculators CCalculator = new calorieCalculators(0, 0, 0, "");
      
      
      CCalculator.updateCalories(Integer.valueOf(CurrentCalCounter.getText()));
      
      return  FoodHistoryDisplay;
    }
}