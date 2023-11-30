package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PlaceOrderFormController {


    private AnchorPane pane;
    private Label lblTotal;
    private JFXComboBox cmbId;
    @FXML
    private JFXComboBox<?> cmbID;

    @FXML
    private JFXComboBox<?> cmbCode;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtDesc;

    @FXML
    private JFXTextField txtUnitPrice;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXButton btnAddToCart;

    @FXML
    private TreeTableColumn<?, ?> tblOrder;

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/DashboardForm.fxml")))));
            stage.show();
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
