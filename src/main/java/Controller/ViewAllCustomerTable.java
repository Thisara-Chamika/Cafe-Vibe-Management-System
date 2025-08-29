package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewAllCustomerTable {

    @FXML
    private TableColumn colCustomerAddress;

    @FXML
    private TableColumn colCustomerEmail;

    @FXML
    private TableColumn colCustomerId;

    @FXML
    private TableColumn colCustomerName;

    @FXML
    private TableColumn colCustomerNumber;

    @FXML
    private TableView tblCustomers;

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddCustomer.fxml"))));
        stage.show();
    }

    @FXML
    void btnReloadTableOnAction(ActionEvent event) {

    }

}
