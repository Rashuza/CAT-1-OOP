
package CAT1;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.ComboBox;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;

import javafx.scene.control.DatePicker;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent; 

//import java.io.FileInputStream;


public class CAT1 extends Application{
	
	public static void main(String[]args){
		launch(args);
	}
	

        @Override
	public void start(Stage stage) throws Exception{
		
		
              
                 
                //ImageView imageView = new ImageView (image);
		//step 7: Set up size for the pane
                //Group root =new Group (imageView);
		// step 1: create label Name
		Text text1 = new Text ("Names:");
		
		// step 2: create label Rgistered
		Text text2 = new Text ("Date of Birth:");
                
                
                Text text3 = new Text ("Email Address:");
                Text text4 = new Text ("Home Address:");
                Text text5 = new Text ("Phone Number:");
                Text text6 = new Text ("Expected Salary:");
                Text text7 = new Text ("Referee's Names:");
		Text text8 = new Text ("Referee's Email Address:");
                Text text9 = new Text ("Career Profession:");
                Text text10 = new Text ("Academic Level:");
		//step 3: create Text Field for name
		TextField textField1 = new TextField();
               
		TextField textField3 = new TextField();
                TextField textField4 = new TextField();
                TextField textField5 = new TextField();
                TextField textField6 = new TextField();
                TextField textField7 = new TextField();
                TextField textField8 = new TextField();
		//step 4: create combo Box for Registered
		//ComboBox comboBox = new ComboBox(); //ComboBox comboBox = new ComboBox();
		 
                //FileInputStream input = new  FileInputStream("ibm.jpg");
                //Image image = new Image(input);
                //ImageView imageView = new ImageView(image);
               // Label label =new Label ("My Label",imageView);
                
                DatePicker datePicker = new DatePicker();
                 
                 HBox hbox = new HBox(datePicker);
                 
                 Button button1 = new Button ("Save");
                 Button button2 = new Button ("Complete The registration");
                 
                
                 
                 ComboBox combobox1 = new ComboBox ();
                 combobox1.getItems().addAll (
                         "Electrical Engineer",
                         "Doctor",
                         "Editor",
                         "Lecturer",
                         "Sofware Developper",
                         "Lawyer",
                         "Flight Attendant"
                 );
                 
                 ComboBox combobox2 =new ComboBox ();
                 combobox2.getItems().addAll (
                         "High School Diploma",
                         "College Diploma",
                         "Bachelor's Degree",
                         "Masters",
                         "PhD"
                 );
                 
	
           
                EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) { 
             
            System.out.println("Congratulations Upon your Job Application Registration"); 
            button2.setStyle("-fx-background-color: Blue; -fx-font-size:13pt;");
         } 
      };  
                
                //Registering the event filter 
                button2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler); 
	        GridPane gridPane = new GridPane();
                //Image image = new Image ("ibm.jpg");
		//gridPane.getChildren().add(new ImageView(image));
             
                
		gridPane.setMinSize(450, 600);
		
		//step 8: Set padding
		gridPane.setPadding(new Insets(50, 50, 50, 50));
		
		// step 9: Set the vertical and horinzotal gaps between the columns
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		
                
		// step 10: Set the Grid Alignment
                
                
		gridPane.setAlignment(Pos.CENTER);
		
               
                
		//step 11: Arrange all the nodes in the grid
		gridPane.add(text1, 0, 0);
		gridPane.add(textField1, 1, 0);
		//gridPane.add(button1, 1, 1);
		
		gridPane.add(text2, 0, 1);
              
		gridPane.add(datePicker, 1, 1);
		
		gridPane.add(text3, 0, 3);
                
                
                gridPane.add(textField3,1, 3);
		
                gridPane.add(text4,0,4);
                gridPane.add(textField4,1,4);
                
                gridPane.add(text5,0,5);
                gridPane.add(textField5,1,5);
                
                gridPane.add(text6,0,8);
                gridPane.add(textField6,1,8);
                
                gridPane.add(text7,0,10);
                gridPane.add(textField7,1,10);
                
                gridPane.add(text8,0,11);
                gridPane.add(textField8,1,11);
                
                gridPane.add(button1, 1, 9);
                
                gridPane.add(text9,0,6);
                gridPane.add(combobox1,1,6);
                
                gridPane.add(text10,0,7);
                gridPane.add(combobox2,1,7);
                
                gridPane.add(button2,1,12);
                
		//step 12: Style nodes be creative and more Styles
		button1.setStyle("-fx-background-color: cornflowerblue; -fx-text-fill: white; -fx-font-size:13pt;");
                button2.setStyle("-fx-background-color: cornflowerblue; -fx-text-fill: white; -fx-font-size:13pt;");
		//button2.setStyle("-fx-background-color: limegreen; -fx-text-fill: white; -fx-font-size:13pt;");
		
		text1.setStyle("-fx-font: normal bold 20px 'serif' ");
		text2.setStyle("-fx-font: normal bold 20px 'serif' ");
		text3.setStyle("-fx-font: normal bold 20px 'serif' ");
		text4.setStyle("-fx-font: normal bold 20px 'serif' ");
                text5.setStyle("-fx-font: normal bold 20px 'serif' ");
                text6.setStyle("-fx-font: normal bold 20px 'serif' ");
                text7.setStyle("-fx-font: normal bold 20px 'serif' ");
                text8.setStyle("-fx-font: normal bold 20px 'serif' ");
                text9.setStyle("-fx-font: normal bold 20px 'serif' ");
                text10.setStyle("-fx-font: normal bold 20px 'serif' ");
                
		gridPane.setStyle("-fx-background-color: darkslategrey");
               
                //imageView.setX(50);
                //imageView.setY(25);
                
                //imageView.setFitHeight(455);
                //imageView.setFitWidth(500);
                
                //imageView.setPreserveRatio(true);
                
		//gridPane.setStyle("-fx-background-color: blue");
                  
		Scene scene = new Scene(gridPane);
		
                Scene sene = new Scene(hbox, 200, 100);
                
                Scene sen = new Scene (new Group (),450,250);
                
                Scene sn = new Scene (new Group (),450,250);
                
               // Scene sin = new Scene (label ,200,100);
                
                //Scene sin =new Scene(root, 600,500);
                //scene.setFill(Color.YELLOW);  
		//Setting title to the Stage
		stage.setTitle("Jobseeker Application");
		
		//Adding scene to the stage
                //stage.setScene(sin);
                stage.setScene(sn);
                stage.setScene(sen);
                stage.setScene(sene);
		stage.setScene(scene);
               
		
		//Dispalying the contents of the stage
		stage.show();
        }
}