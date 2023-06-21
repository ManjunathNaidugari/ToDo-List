package de.tum.in.ase.fop;

import javafx.application.Application;
//import javafx.beans.binding.Bindings;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.geometry.Insets;
//import javafx.scene.Node;
import javafx.scene.Scene;
//import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.control.*;

//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//import static javafx.scene.control.Alert.AlertType.ERROR;

public class MainClass extends Application {
    //
//    private ListView<String> listView = new ListView<>();
//    private ListView<CheckBox> checkBoxListView = new ListView<>();
//    private ListView<Button> deleteListView = new ListView<>();
//    private ListView<String> tempListView = new ListView<>();
//    private ListView<HBox> classListView = new ListView<>();
//    private Class aClass;
//
//    private ObservableList<ToDoItem> list = FXCollections.observableArrayList();
//    private ToDoList toDoList = new ToDoList();
    private int count = 0;
//    private int resCount = 0;


    @Override
    public void start(Stage primaryStage) {
        VBox vBox1 = new VBox(); // Create new vertical box.
        Scene scene1 = new Scene(vBox1); // Create scene1.
        scene1.setFill(Color.BLACK);
        vBox1.setSpacing(7); // Spacing for box.
//        vBox1.setStyle("-fx-background-color: #000000");

        Label resolved = new Label("Resolved: ");
        Label unresolved = new Label("To Do: ");
        HBox hbox1 = new HBox();
        hbox1.setSpacing(8);
        hbox1.setPadding(new Insets(10, 10, 10, 10));
//        HBox hBox = new HBox();
//        HBox hBox2 = new HBox();
//        hBox.setSpacing(8);
//        hBox.setPadding(new Insets(10, 10, 20, 10));

        TextField textField = new TextField();
        textField.setPromptText("Enter task");


//        Button delete = new Button("Delete");
//        delete.setOnAction(x -> {
//            listView.getItems().remove(listView.getSelectionModel());
//            listView.getItems().forEach(System.out::println);
//        });
        VBox vBox = new VBox();
        VBox vBox2 = new VBox();
        HBox hBox = new HBox();
//        ToggleButton toggle = new ToggleButton("Toggle color");
//        vBox.backgroundProperty().bind(Bindings.when(toggle.selectedProperty())
//                .then(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)))
//                .otherwise(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY))));

        Button add = new Button("Add Event");
        add.setOnAction(x -> {
            GClass obj = new GClass(textField.getText());
            count = count + 1;
            System.out.println(count);
//            System.out.println(obj.getElement().getScaleX());
//            if (count % 2 ==0) {
//                hBox.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, CornerRadii.EMPTY, Insets.EMPTY)));
////                hBox.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
//            } else {
            hBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
//                vBox2.setBackground(new Background(new BackgroundFill(Color.WHEAT, CornerRadii.EMPTY, Insets.EMPTY)));
//            }


//            classListView.getItems().forEach(System.out::println);
            vBox.getChildren().add(obj.getElement());
//            classListView.getItems().add(obj.getElement());
//            System.out.println(classListView.getItems().get(0).getBackground());
//            System.out.println(classListView.getItems().get(0).getStyle());

            obj.getDelete().setOnAction(d -> {
                vBox.getChildren().remove(obj.getElement());
//                classListView.getItems().remove(obj.getElement());
                count = count - 1;
            });

//            obj.getDelete().setPrefWidth(18);
            obj.getDelete().setPrefHeight(8);
            obj.getDelete().setTextFill(Color.RED);

            obj.getResolve().setOnAction(r -> {
                vBox2.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, CornerRadii.EMPTY, Insets.EMPTY)));
                vBox.getChildren().remove(obj.getElement());
                vBox2.getChildren().add(obj.getElement());
                if (!obj.getResolve().isSelected()) {
                    vBox2.getChildren().remove(obj.getElement());
                    vBox.getChildren().add(obj.getElement());
                }
                count = count - 1;
            });
            textField.clear();

        });

//        add.setOnAction(x -> {
//
//            ToDoItem item = new ToDoItem(textField.getText());
//
//
//
//            Button delete1 = new Button("Delete");
//            delete1.setId(item.getContent());
//            count = count + 1;
//            resCount = resCount + 1;
//            delete1.setPrefHeight(5);
//            delete1.setOnAction(e -> {
//                for (int i = 0; i < count; i++) {
//                    if (delete1.getId().equals(listView.getItems().get(i))) {
//                        listView.getItems().remove(i);
//                        checkBoxListView.getItems().remove(i);
//                        deleteListView.getItems().remove(i);
//                        count = count - 1;
//                    }
//                }
//            });
//
//            CheckBox resolve1 = new CheckBox("Completed");
//            resolve1.setSelected(true);
//            CheckBox resolve = new CheckBox("Completed");
//            resolve.setId(item.getContent());
//            resolve.setOnAction(r -> {
//
//                int j = 0;
//
//
//                for (int i = 0; i < count; i++) {
//                    if (resolve.getId().equals(listView.getItems().get(i))) {
//                        tempListView.getItems().add(listView.getItems().get(i));
//                        listView.getItems().remove(i);
//                        checkBoxListView.getItems().remove(i);
//                        deleteListView.getItems().remove(i);
//
//                        listView.getItems().add(tempListView.getItems().get(j++));
//                        checkBoxListView.getItems().add(resolve);
//                        resolve.setSelected(true);
//                        deleteListView.getItems().add(delete1);
//                        break;
//                    }
//                }
//
////                listView.getItems().remove((int) resolve.getScaleX()-1);
////                checkBoxListView.getItems().remove((int)resolve.getScaleX()-1);
////                deleteListView.getItems().remove((int)resolve.getScaleX()-1);
//
//            });
//
//
//            hBox.setSpacing(10);
//            hBox.setPadding(new Insets(10, 10, 20, 10));
//
////            list.add(item);
////            listView.setItems(list);
////            for (int i = 1; i < count; i++) {
////                System.out.println(textField.getText());
////                System.err.println(listView.getItems().get(i));
////                if (listView.getItems().get(i).equals(item.getContent())) {
////                    Alert alert = new Alert(ERROR);
////                    alert.setTitle("Error");
////                    alert.setHeaderText(null);
////                    alert.setContentText("The Event is already exist in the list");
////                    alert.initOwner(vBox1.getScene().getWindow());
////                    alert.show();
////                    count =
////                }
////            }
//
//            listView.getItems().add(item.getContent());
//            checkBoxListView.getItems().add(resolve);
//            deleteListView.getItems().add(delete1);
//            listView.setEditable(true);
//            listView.setCellFactory(TextFieldListCell.forListView());
//            textField.clear();
//
//
//
//
//        });
//
////        hBox2.getChildren().addAll(tempListView,checkBoxListView,deleteListView);
//        hBox.getChildren().addAll(listView,checkBoxListView,deleteListView);
//       hBox.getChildren().addAll(classListView);
//        vBox.setSpacing(15);
        hbox1.getChildren().addAll(textField, add);
        hBox.getChildren().addAll(unresolved, vBox, resolved, vBox2);
        hBox.setSpacing(70);
        vBox1.getChildren().addAll(hbox1, hBox);
        vBox1.setPrefWidth(500);

        primaryStage.setWidth(750);
        primaryStage.setHeight(500);
        primaryStage.setTitle("To Do List"); // Names the window.
        primaryStage.setScene(scene1); // Sets the scene to the stage.
        primaryStage.show(); // Shows the stage.

    }
}
