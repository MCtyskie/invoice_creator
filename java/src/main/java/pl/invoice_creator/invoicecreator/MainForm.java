package pl.invoice_creator.invoicecreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForm {

    @FXML
    private Button newInvoiceButton;
    @FXML
    private Button historyButton;
    @FXML
    private Button licenseButton;

    @FXML
    void newInvoiceButtonOnClick(ActionEvent event) throws IOException {
       // System.out.println("xd");
        Stage currentStage = (Stage) newInvoiceButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("new-invoice.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Nowa faktura");
        stage.setScene(new Scene(root1));
        stage.setResizable(false);
        stage.show();
        currentStage.close();
    }

    @FXML
    void historyButtonOnClick(ActionEvent event) {

    }

    @FXML
    void licenseButtonOnClick(ActionEvent event) {
        //todo- license and contact information
    }

}
