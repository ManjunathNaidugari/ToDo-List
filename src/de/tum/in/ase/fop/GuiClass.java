package de.tum.in.ase.fop;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GuiClass extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TableView<String> tableView = new TableView<>();

        TableColumn<String, Boolean> columnTasks = new TableColumn("Tasks");
        columnTasks.setCellValueFactory(new PropertyValueFactory<>("content"));

        TableColumn<String, Boolean> columnResolved = new TableColumn("Resolved");
        columnResolved.setCellValueFactory(new PropertyValueFactory<>("resolved"));

        VBox vBox1 = new VBox(); // Create new vertical box.
        vBox1.setSpacing(7); // Spacing for box.
        Scene scene1 = new Scene(vBox1); // Create scene1.
        scene1.setFill(Color.BLACK);
        HBox hbox1 = new HBox();
        hbox1.setSpacing(8);
        hbox1.setPadding(new Insets(10, 10, 10, 10));

        TextField textField = new TextField();
        textField.setPromptText("Enter task");

        Button add = new Button("Add Event");
        add.setOnAction(x -> {
//            tableView.getColumns().add(textField.getText());
        });

        hbox1.getChildren().addAll(textField, add);
        vBox1.getChildren().addAll(hbox1, tableView);

        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("To Do List"); // Names the window.
        primaryStage.setScene(scene1); // Sets the scene to the stage.
        primaryStage.show(); // Shows the stage.




    }
}
