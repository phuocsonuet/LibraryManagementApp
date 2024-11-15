package org.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    private static Stage currentStage;

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;

    @Override
    public void start(Stage stage) throws IOException {
        currentStage = stage;
        navigateToScene("hello-view.fxml");
        stage.show();
    }

    public static void setScene(Parent root) {
        currentStage.setScene(new Scene(root, WIDTH, HEIGHT));
    }

    public static void navigateToScene(String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxmlFile));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        currentStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}