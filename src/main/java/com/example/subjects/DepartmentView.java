package com.example.subjects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class DepartmentView {
@FXML
private TextField depNameTxt;
    public void clrData(ActionEvent actionEvent) {
    }

    public void savDepartment(ActionEvent actionEvent) {
        if (depNameTxt.getText() == null || depNameTxt.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("الرجاء تعبة البيانات");
            alert.setHeaderText(null);
            alert.setContentText("الرجاء ملء جميع الحقول ");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("تمت الاضافة بنجاح!");
            alert.setHeaderText(null);
            alert.setContentText("تم حفظ بيانات القسم بنجاح");
            alert.showAndWait();
        }
    }
}
