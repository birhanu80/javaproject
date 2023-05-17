package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	TextField tfuser;
	@FXML
	PasswordField tfpass;
	@FXML
	Button lblerror;
	@FXML
	Button login;
   public void test(ActionEvent e) {
	   if(tfuser.getText().equals("Admin") && tfpass.getText().equals("123")){
			System.out.println("you are logged succssefully");
			}
	   else{
			lblerror.setText("Invalid Username or Password");
			
   }}
	public void up(ActionEvent e) {
		System.out.println("Up");
	}
	public void right(ActionEvent e) {
		System.out.println("Right");
	}
	public void left(ActionEvent e) {
		System.out.println("Left");
	}
	public void down(ActionEvent e) {
		System.out.println("Down");
	}
}
