package com.example.subjects;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView {
    public void onStButtonClick(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader2 = new FXMLLoader(com.example.subjects.HelloApplication.class.getResource("student-view.fxml"));
        Stage stg = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader2.load(), 640, 380);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stg.setTitle("Hello!");
        stg.setScene(scene);
        stg.show();
    }
}
