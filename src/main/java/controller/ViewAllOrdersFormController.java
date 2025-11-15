package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewAllOrdersFormController {

    @FXML
    private TableColumn colCategoryName;

    @FXML
    private TableColumn colCustomerId;

    @FXML
    private TableColumn colItems;

    @FXML
    private TableColumn colOrderId;

    @FXML
    private TableColumn colQuantity;

    @FXML
    private TableColumn colTotalPrice;

    @FXML
    private TableView tblViewAllOrdersTable;

    @FXML
    void btnHomePageOnAction(ActionEvent event) {

    }

    @FXML
    void btnReloadTableOnAction(ActionEvent event) {

    }

}
