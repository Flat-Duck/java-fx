package com.example.subjects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SubjectView {
    @FXML
    private TextField sbjCodeTxt;
    public void clrData(ActionEvent actionEvent) {
    }

    public void savSubject(ActionEvent actionEvent) {

        if (sbjCodeTxt.getText() == null || sbjCodeTxt.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("الرجاء تعبة البيانات");
            alert.setHeaderText(null);
            alert.setContentText("الرجاء ملء جميع الحقول ");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("تمت الاضافة بنجاح!");
            alert.setHeaderText(null);
            alert.setContentText("تم حفظ بيانات المادة بنجاح");
            alert.showAndWait();
        }
    }
}
