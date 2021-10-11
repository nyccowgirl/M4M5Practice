package com.example.m4m5practice;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class QuoteApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new FlowPane();
        Text quote = new Text("The soul takes flight to a world that is invisible, and there arriving, she is sure of bliss.");
        quote.setFont(Font.font("Copperplate Gothic Light", 16));
        quote.setFill(Color.TEAL);
        pane.getChildren().add(quote);

        Scene scene = new Scene(pane, 300, 300, Color.HOTPINK);
        stage.setTitle("BLISS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}