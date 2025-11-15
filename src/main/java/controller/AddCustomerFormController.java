package controller;

import dataBase.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Customer;

import java.sql.SQLException;

public class AddCustomerFormController {

    public TableView tblCustomerTable;
    public TableColumn colCustomerId;
    public TableColumn colCustomerName;
    public TableColumn colCustomerAddress;
    public TableColumn colCustomerEmail;
    @FXML
    private TextField txtCustomerAddress;

    @FXML
    private TextField txtCustomerEmail;

    @FXML
    private TextField txtCustomerId;

    @FXML
    private TextField txtCustomerName;


    @FXML
    private TextField txtMobileNumber;

// ------------ Add Customer -----------------
    @FXML
    void btnAddCustomerOnAction(ActionEvent event) throws SQLException {
        Customer customer = new Customer(
                txtCustomerId.getText(),
                txtCustomerName.getText(),
                txtCustomerAddress.getText(),
                txtMobileNumber.getText(),
                txtCustomerEmail.getText()
        );

        DBConnection.getInstance().getConnection();
        resetTextFields();
    }

// -------------- reset text fields --------------
    public void resetTextFields(){
                txtCustomerId.setText("");
                txtCustomerName.setText("");
                txtCustomerAddress.setText("");
                txtMobileNumber.setText("");
                txtCustomerEmail.setText("");
    }

    public void btnUpdateCustomerOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteCustomerOnAction(ActionEvent actionEvent) {

    }

    public void btnSearchCustomerOnAction(ActionEvent actionEvent) {
        
    }
}
