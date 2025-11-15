package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.ResourceBundle;

public class HomePageFormController implements Initializable {

    public AnchorPane FormViewPane;
    public Label lblDate;
    public Label lblTime;
    public Label lblFormsName;

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) throws IOException {
        lblFormsName.setText("Customer Form");
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
        lblFormsName.setText("Menu Items");
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
        lblFormsName.setText("Orders Form");
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
        lblFormsName.setText("DashBoard");
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
        lblFormsName.setText("Reports");
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

    private void loadDateAndTime(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        lblDate.setText(simpleDateFormat.format(date));

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, e->{
                    LocalTime now = LocalTime.now();
                    lblTime.setText(now.getHour()+":"+now.getMinute()+":"+now.getSecond());
                }),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {loadDateAndTime();}
}
