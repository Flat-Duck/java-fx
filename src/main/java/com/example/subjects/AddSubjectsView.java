package com.example.subjects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class AddSubjectsView {
    @FXML
    private TextField stdNumberTxt;
    public void clrData(ActionEvent actionEvent) {
    }

    public void savSubject(ActionEvent actionEvent) {
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
}
