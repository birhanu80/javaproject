package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//try {
		  Font font=new Font("Arial",20);
		  Label lb1FirstNo=new Label("First Number");
		  Label lb1SecondNo=new Label("Second Number");
		  Label lb1Result=new Label("Result");
		  TextField text1=new TextField();
		  TextField text2=new TextField();
		  TextField text3=new TextField();
		  Button btnAdd=new Button("Add");
		  Button btnClear=new Button("Clear");
		  GridPane grid=new GridPane();
		  Text text=new Text("Simple Calculator");
		  text.setFont(font);
		  grid.addRow(0,text);
		  grid.addRow(1, lb1FirstNo,text1);
		  grid.addRow(2, lb1SecondNo,text2);
		  grid.addRow(3,lb1Result,text3);
		   grid.addRow(4,btnAdd,btnClear);
		    grid.setPadding(new Insets(40));
		    grid.setHgap(10);
		    grid.setVgap(10);
		    grid.setStyle("-fx-background-color:lightblue");
		    btnAdd.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
				    if (text1.getText() != "" && text1.getText() != "") {
			            int x = Integer.parseInt(text1.getText());
			            int y = Integer.parseInt(text2.getText());
			            int result = x + y;
			            text3.setText(Integer.toString(result));
				}}
			});
 
		   btnClear.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				//text1.clear();
				text1.setText("");
				text2.clear();
				text3.clear();
			}
			   
		});
		    Text txt=new Text("Enter Text");    
		    TextField txt1=new TextField("enter as you want");
		    Button btnPrint=new Button("print");
		    VBox vbox=new VBox(txt,txt1,btnPrint);
		    txt.setFont(font);
		    vbox.setPadding(new Insets(20));
		    vbox.setSpacing(20);
		    Text tx=new Text("Color");
		    tx.setFont(font);
		    RadioButton rb1 = new RadioButton("Red");
		    RadioButton rb2 = new RadioButton("Black");
		    RadioButton rb3 = new RadioButton("Green");
		    Text txi=new Text();
		    Button btnSub=new Button("sub");
		    GridPane grid1=new GridPane();
		    grid1.setPadding(new Insets(40));
		    grid1.addRow(0, txi);
		    grid1.addRow(1, btnSub);
		    btnSub.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int m=Integer.parseInt(text1.getText());
					int n=Integer.parseInt(text2.getText());
					int result1=m-n;
					 text3.setText(Integer.toString(result1));
					
				}
				
			});
		    btnPrint.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					String printed=txt1.getText();
					txi.setText(printed);
					
				}
			});
		    ToggleGroup toggle=new ToggleGroup();
		    rb1.setToggleGroup(toggle);
		    rb2.setToggleGroup(toggle);
		    rb3.setToggleGroup(toggle);
		    VBox vbox1=new VBox(tx,rb1,rb2,rb3);
		    vbox1.setPadding(new Insets(20));
		    vbox1.setSpacing(25);
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,800,600);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			HBox hbox=new HBox(grid,vbox,vbox1);
			root.setTop(hbox);
			root.setCenter(grid1);
			//root.getChildren().add(text)
			primaryStage.setTitle("hell world");
			primaryStage.setScene(scene);
			primaryStage.show();
		 //catch(Exception e) {
			//e.printStackTrace();
		//}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
