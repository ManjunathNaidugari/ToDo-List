package de.tum.in.ase.fop;

//import javafx.geometry.Insets;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class GClass {
    private CheckBox resolve = new CheckBox();
    private Label event;
    private Button delete;


    public CheckBox getResolve() {
        return resolve;
    }

//    public void setResolve(CheckBox resolve) {
//        this.resolve = resolve;
//    }
//
//
//    public Label getEvent() {
//        return event;
//    }
//
//    public void setEvent(Label event) {
//        this.event = event;
//    }

    public Button getDelete() {
        return delete;
    }

//    public void setDelete(Button delete) {
//        this.delete = delete;
//    }

    public GClass(String s) {
        this.event = new EditableLabel(s);
        delete = new Button("Delete");
        delete.setPrefWidth(60);
        delete.setPrefHeight(25);
        event.setFont(Font.font(15));
//        event.setPrefWidth(20);

//        delete.setTextFill(Color.RED);
//       delete.setStyle("-fx-background-color: #FF0000");

    }

    public HBox getElement() {

        HBox hBox = new HBox(resolve, event, delete);
        hBox.setSpacing(16);
//        hBox.setStyle(  "-fx-border-style: solid inside;"
//                + "-fx-border-width: 2;" + "-fx-border-insets: 3;"
//                + "-fx-border-radius: 3;" + "-fx-border-color: white;");


        return hBox;
    }

    static class EditableLabel extends Label {
       private TextField tf = new TextField();

//       private String backup = "";

//        public EditableLabel() {
//            this("");
//        }

         EditableLabel(String str) {
            super(str);
            this.setOnMouseClicked(e -> {
                if (e.getClickCount() == 1) {
//                    tf.setText(backup = this.getText());
                    this.setGraphic(tf);
                    this.setText("");
                    tf.requestFocus();
                }
            });
            tf.focusedProperty().addListener((prop, o, n) -> {
                if (!n) {
                    toLabel();
                }
            });
            tf.setOnKeyReleased(e -> {
                if (e.getCode().equals(KeyCode.ENTER)) {
                    toLabel();
                } else if (e.getCode().equals(KeyCode.ESCAPE)) {
//                    tf.setText(backup);
                    toLabel();
                }
            });
        }

        void toLabel() {
            this.setGraphic(null);
            this.setText(tf.getText());
        }

    }
}
