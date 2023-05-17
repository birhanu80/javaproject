package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class Dashboard implements Initializable{
	    private final ObservableList<Student> list1 = FXCollections.observableArrayList();
	    ObservableList<Student> x;
	    @FXML
	    Button btnAdd;

	    @FXML
	    Button btnDelete;

	    @FXML
	    Button btnLogout, btnSearch, btnUpdate;

	

	    @FXML
	    Label lblId, lblUser, lblName;

	    @FXML
	    TableView<Student> tblData;

	    @FXML
	    TextField tfId, tfName;

	    @FXML
	    TableColumn<Student, String> colId;

	    @FXML
	    TableColumn<Student, String> colName;
		@FXML public void addStudent(){
			System.out.println("1");
	        //emptyChecker();
	        if(!tfName.getText().equals("") && !tfId.getText().equals("")){
	        	System.out.println("1");
	            Student student = new Student();
	            student.setName(tfName.getText());
	            student.setId(tfId.getText());
	            list1.add(student);
	            //lblSuccess.setText("Successfully Added");
	            tblData.refresh();
	        }
	        
	    }
	    @FXML
	    public void updateStudent(){
	        for(Student s: list1){
	            if(s.getId().equals(tfId.getText())){
	                s.setName(tfName.getText());
	                s.setId(tfId.getText());
	                //lblSuccess.setText("Updated Successfully");
	                tblData.refresh();
	            }
	               
	        }
	    }
	    @FXML
	    public void deleteStudent(){
	        for(Student s: list1){
	            if(s.getId().equals(tfId.getText())){
	                System.out.println("true"+s.getId());
	                list1.remove(s);
	                //lblSuccess.setText("Deleted Successfully");
	                tblData.refresh();
	            }
	        }
	    }
	    
	    @FXML
	    public void searchStudent(){
	        int found = 0;
	        for(Student s: list1){
	            if(s.getId().equals(tfId.getText())){
	                tfName.setText(s.getName());
	                tfId.setText(s.getId());
	                found=1;
	            }
	        }
	        if(found==0){
	                lblId.setText("No student found with ID No - "+tfId.getText());
	            }
	    }
	    @FXML
	    public void logout() throws IOException{
	        //App.sceneFactory("/fxml/login");
	    }
	    
	    private void emptyChecker() {
	       if(tfName.getText().equals(""))
	            lblName.setText("Please enter Full Name");
	        else
	            lblName.setText("");
	        if(tfId.getText().equals(""))
	            lblId.setText("Please enter Full Name");
	        else
	            lblName.setText("");
	    }
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
		   lblUser.setText(SampleController.loggedinUser);
	       colId.setCellValueFactory(new PropertyValueFactory<Student, String>("Id"));
	        colName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
	        
	        //tblData.setItems(list);
	        tblData.setItems(list1);
	        //btnAdd.setOnAction(this);
		}

			
		}
