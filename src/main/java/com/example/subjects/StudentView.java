package com.example.subjects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentView {

    @FXML
    private TextField stdNumberTxt;

    @FXML
    public void getStudent(ActionEvent actionEvent) {
        if (stdNumberTxt.getText() == null || stdNumberTxt.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("الرجاء كتابة الرقم");
            alert.setHeaderText(null);
            alert.setContentText("الرجاء اضافة رقم في حقل البحث!!");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("غير موجود");
            alert.setHeaderText(null);
            alert.setContentText("هذا الطالب غير موجود");
            alert.showAndWait();
        }
    }

    public void savStudent(ActionEvent actionEvent) {
        if (stdNumberTxt.getText() == null || stdNumberTxt.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("الرجاء تعبة البيانات");
            alert.setHeaderText(null);
            alert.setContentText("الرجاء ملء جميع الحقول ");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("تمت الاضافة بنجاح!");
            alert.setHeaderText(null);
            alert.setContentText("تم حفظ بيانات الطالب بنجاح");
            alert.showAndWait();
        }
    }

    public void delStudent(ActionEvent actionEvent) {
        if (stdNumberTxt.getText() == null || stdNumberTxt.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("الرجاء اختيار الطالب");
            alert.setHeaderText(null);
            alert.setContentText("الرجاء اختيار طالب حتى يتم حذفه");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("تم الحذف بنجاح!");
            alert.setHeaderText(null);
            alert.setContentText("تم حذف بيانات الطالب بنجاح");
            alert.showAndWait();
        }
    }

    public void closeApp(ActionEvent actionEvent) {
        final Node source = (Node) actionEvent.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    public void clrData(ActionEvent actionEvent) {
    }
}
