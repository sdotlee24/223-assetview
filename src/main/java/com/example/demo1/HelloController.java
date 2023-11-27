package com.example.demo1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class HelloController {



    @FXML
    private TextField textArea;

    @FXML
    public void initialize() {

    }
    @FXML
    private VBox screen;

    private List<HBox> popup= new ArrayList<>();

    private void deleteAsset(int i) {
        //delete button from database
        //if successful
        screen.getChildren().remove(popup.get(i));
    }

    private void updateAsset(int i) {
        //update asset
        //if succesful
        screen.getChildren().remove(popup.get(i));
    }

    private void createPreConfiguredPane() {
        // Create or load your pre-configured Pane
        // For example, create a Pane with labels
        HBox newBox = new HBox();
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        label1.setText("this is label1");
        label2.setText("this is label 2");
        TextField field1 = new TextField();
        Button delete = new Button();
        Button update = new Button();
        int index = popup.size();
        delete.setOnAction(e -> deleteAsset(index));
        update.setOnAction(e -> updateAsset(index));

        popup.add(newBox);
        // Add labels and other nodes to the Pane as needed
        newBox.getChildren().addAll(label1, label2, field1, delete, update);

    }
    @FXML
    protected void onTextButtonClick() {
        String content = textArea.getText();
        textArea.clear();

        Label one = new Label("HELOOOOOOOOOOOOOO");
        one.setText("IIIIIIIIIIIIIIIII");

        createPreConfiguredPane();
        System.out.println("this works");
        if (!popup.isEmpty()) {
            screen.getChildren().add(popup.getLast());
        }
    }


}