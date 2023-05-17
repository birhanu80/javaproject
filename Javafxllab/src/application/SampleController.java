package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController implements Initializable,EventHandler<ActionEvent>{
	static String loggedinUser;
	@FXML
	TextField tfUser;
	@FXML
	PasswordField pfPass;
	@FXML
	Label lblError;
	@FXML
	Button mycancel;
	@FXML
	Button Mylogin;
	@FXML
	Button logOut;
   private Stage stage;
   private Scene scene;
  // private Parent root;
	@Override
	public void handle(ActionEvent event) {
		 if(event.getSource().equals(Mylogin)){
	            try {
	                if(tfUser.getText().equals("Admin") && pfPass.getText().equals("123")){
	                
	                    loggedinUser = tfUser.getText();
	                   // App.sceneFactory("/fxml/dashboard");
	                	//lblError.setText("logged in successfully");
	                 Parent root=FXMLLoader.load(getClass().getResource("sce2.fxml"));
	                 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	                 scene=new Scene(root);
	                 stage.setScene(scene);
	                 stage.show();
	                }else{
	                    lblError.setText("Invalid Username or Password");
	                }
	                   
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	        if(event.getSource().equals(mycancel)){
//	           Optionally we can close a program usingthe following code 
//	            Node source = (Node)event.getSource();
//	            Stage stage = (Stage)source.getScene().getWindow();
//	            stage.close();
	            System.exit(0);
	        }
	       /*if(event.getSource().equals(logOut)) {
	        	try {
	        		 AnchorPane root=FXMLLoader.load(getClass().getResource("sample.fxml"));
	                 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	                 scene=new Scene(root);
	                 stage.setScene(scene);
	                 stage.show();
	        	
	        }
	        	catch(Exception e) {
	        		  e.printStackTrace();
	        	}}*/
	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Mylogin.setOnAction(this);
		mycancel.setOnAction(this);
		//logOut.setOnAction(this);
	}
	}