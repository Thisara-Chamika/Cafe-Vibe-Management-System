package Controller;

import DataBase.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Customer;

import java.io.IOException;

public class AddCustomerFormController {

    @FXML
    private ComboBox txtCategoryCombo;

    @FXML
    private TextField txtCustomerAddress;

    @FXML
    private TextField txtCustomerEmail;

    @FXML
    private TextField txtCustomerId;

    @FXML
    private TextField txtCustomerIdforOrder;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private ComboBox txtItemCombo;

    @FXML
    private TextField txtMobileNumber;

    @FXML
    private TextField txtOrderId;

    @FXML
    private TextField txtQty;

    @FXML
    private TextField txtUnitPrice;

// ------------ Add Customer -----------------
    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {
        Customer customer = new Customer(
                txtCustomerId.getText(),
                txtCustomerName.getText(),
                txtCustomerAddress.getText(),
                txtMobileNumber.getText(),
                txtCustomerEmail.getText()
        );

        DBConnection.customerObservableList.add(customer);
        System.out.println(customer);
        resetTextFields();
    }

    // ------------ View Customers Table -----------------
    @FXML
    void btnViewAllCustomersOnAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewAllCustomersTable.fxml"))));
        stage.show();
    }

    // ------------ Place Order -----------------
    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    // ------------ Back to Home page -----------------
    @FXML
    void btnHomePageOnAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePage.fxml"))));
        stage.show();
    }

    // -------------- View All Orders Table --------------
    public void btnViewAllOedersOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewAllOrders.fxml"))));
        stage.show();
    }

// -------------- reset text fields --------------
    public void resetTextFields(){
                txtCustomerId.setText("");
                txtCustomerName.setText("");
                txtCustomerAddress.setText("");
                txtMobileNumber.setText("");
                txtCustomerEmail.setText("");
    }
}
