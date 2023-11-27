package com.example.demo1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceTicketController {
    @FXML
    private Button accountMenuButton;

    @FXML
    private Button addNoteButton;

    @FXML
    private Button assetMenuButton;

    @FXML
    private Button createTicketButton;

    @FXML
    private Button deleteTicketButton;

    @FXML
    private Button editTicketButton;

    @FXML
    private Button ticketMenuButton;

    @FXML
    private Button viewImageButton;

    @FXML
    private Button viewNoteButton;

    @FXML
    void createTicketButtonPressed(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_ticket_window.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Create Maintenance Ticket");
        stage.setScene(new Scene(root1));
        stage.show();



    }



}
