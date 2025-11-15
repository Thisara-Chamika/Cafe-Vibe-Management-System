package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class HomePageFormController {

    public AnchorPane FormViewPane;

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) throws IOException {
        URL resource = this.getClass().getResource("/view/AddCustomer.fxml");
        assert resource != null;

        try {
            Parent load = FXMLLoader.load(resource);
            this.FormViewPane.getChildren().clear();
            this.FormViewPane.getChildren().add(load);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnAddItemsOnAction(ActionEvent event) throws IOException {
        URL resource = this.getClass().getResource("/view/AddItems.fxml");
        assert resource != null;

        try {
            Parent load = FXMLLoader.load(resource);
            this.FormViewPane.getChildren().clear();
            this.FormViewPane.getChildren().add(load);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnViewAllOrdersOnAction(ActionEvent event) throws IOException {
        URL resource = this.getClass().getResource("/view/ViewAllOrders.fxml");
        assert resource != null;

        try {
            Parent load = FXMLLoader.load(resource);
            this.FormViewPane.getChildren().clear();
            this.FormViewPane.getChildren().add(load);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnViewDashBoardOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/DashBoard.fxml");
        assert resource != null;

        try {
            Parent load = FXMLLoader.load(resource);
            this.FormViewPane.getChildren().clear();
            this.FormViewPane.getChildren().add(load);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnViewReportOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/ViewReport.fxml");
        assert resource != null;

        try {
            Parent load = FXMLLoader.load(resource);
            this.FormViewPane.getChildren().clear();
            this.FormViewPane.getChildren().add(load);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
