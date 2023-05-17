package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Text tx=new Text("Well come");
			TextField txtField1=new TextField();
			TextField txtField2=new TextField();
			Label text1=new Label("First");
			Label text2=new Label("Second");
			GridPane grid=new GridPane();
			grid.setVgap(2);
			grid.setHgap(100);
			grid.setPadding(new Insets(20));
			grid.addRow(0,tx);
			grid.addRow(1, text1,txtField1);
			grid.addRow(2, text2,txtField2);
			Button btn=new Button("Sign up");
			Text ty=new Text();
			grid.addRow(3,ty,btn);
			//root.setCenter(btn);
			//btn.setPadding(new Insets(30));
			//VBox vbox1=new VBox(text1,text2);
			//VBox vbox2=new VBox(txtField1,txtField2);
			//vbox1.setPadding(new Insets(20));
			//vbox1.setSpacing(47);
			//HBox hbox=new HBox(vbox1,vbox2);
			root.setTop(grid);
			primaryStage.setX(0);
			primaryStage.setY(0);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
			primaryStage.setFullScreen(true);
			Stage stage=new Stage();
			BorderPane root1 = new BorderPane();
			stage.setX(450);
			stage.setY(450);
			stage.setMinHeight(400);
			stage.setMinWidth(600);
			Scene scene1=new Scene(root1);
			stage.setScene(scene1);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
