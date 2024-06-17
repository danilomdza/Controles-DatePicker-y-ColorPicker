// Mendoza Danilo

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ControlApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();

        Label selectionLabel = new Label();
        Label selectionLabel2 = new Label();
        Rectangle colorRect = new Rectangle(80, 20);

        Button confirmButton = new Button("Confirmar");

        confirmButton.setOnAction(e -> {
            String selectedDate = datePicker.getValue().toString();

            Color selectedColor = colorPicker.getValue();

            selectionLabel.setText("Fecha seleccionada: " + selectedDate);
            selectionLabel2.setText("Color seleccionado: ");

            colorRect.setFill(selectedColor);
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);

        HBox dateBox = new HBox(10, dateLabel, datePicker);
        dateBox.setAlignment(Pos.CENTER);

        HBox colorBox = new HBox(10, colorLabel, colorPicker);
        colorBox.setAlignment(Pos.CENTER);

        HBox buttonBox = new HBox(confirmButton);
        buttonBox.setAlignment(Pos.CENTER);

        HBox selectionBox = new HBox(10, selectionLabel, selectionLabel2, colorRect);
        selectionBox.setAlignment(Pos.CENTER);

        root.getChildren().addAll(dateBox, colorBox, buttonBox, selectionBox);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Controles");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
