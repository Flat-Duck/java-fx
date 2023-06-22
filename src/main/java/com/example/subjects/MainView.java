package com.example.subjects;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView {
    private FXMLLoader fxmlLoader;


    public void openSubjectsView(ActionEvent actionEvent) {
        fxmlLoader = new FXMLLoader(com.example.subjects.HelloApplication.class.getResource("subject-view.fxml"));
        Stage stg = new Stage();
        Scene scene = null;

        try {
            scene = new Scene(fxmlLoader.load(), 640, 380);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stg.setTitle("شاشة المواد");
        stg.setScene(scene);
        stg.show();
    }

    public void openDepartmentsView(ActionEvent actionEvent) {
        fxmlLoader = new FXMLLoader(com.example.subjects.HelloApplication.class.getResource("department-view.fxml"));
        Stage stg = new Stage();
        Scene scene = null;

        try {
            scene = new Scene(fxmlLoader.load(), 640, 380);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stg.setTitle("شاشة الاقسام");
        stg.setScene(scene);
        stg.show();
    }

    public void openAddSubjectsView(ActionEvent actionEvent) {
        fxmlLoader = new FXMLLoader(com.example.subjects.HelloApplication.class.getResource("add-subjects-view.fxml"));
        Stage stg = new Stage();
        Scene scene = null;

        try {
            scene = new Scene(fxmlLoader.load(), 640, 380);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stg.setTitle("شاشة تنزيل المواد");
        stg.setScene(scene);
        stg.show();
    }

    public void openStudentView(ActionEvent actionEvent) {
        fxmlLoader = new FXMLLoader(com.example.subjects.HelloApplication.class.getResource("student-view.fxml"));
        Stage stg = new Stage();
        Scene scene = null;

        try {
            scene = new Scene(fxmlLoader.load(), 720, 460);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stg.setTitle("شاشة الطلاب");
        stg.setScene(scene);
        stg.show();
    }

    public void closeApp(ActionEvent actionEvent) {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
