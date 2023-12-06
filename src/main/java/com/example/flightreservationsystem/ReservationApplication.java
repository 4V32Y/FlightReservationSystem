package com.example.flightreservationsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.css.CssParser;

import java.io.IOException;

public class ReservationApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ReservationApplication.class.getResource("system-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 680);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
//
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setHgap(10);
//        root.setVgap(10);
//
//        Label label = new Label("FLIGHT RESERVATION SYSTEM");
//        label.setTextFill(Color.YELLOWGREEN);
//        label.setFont(Font.font("courier new", FontWeight.BOLD,30));
//
//        root.getChildren().add(label);
//        Scene scene = new Scene(root, 800,780);
//        stage.setTitle("welcome");
//        stage.setScene(scene);
//        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}