package com.example.euroconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    EuroConverter euroConverter = new EuroConverter();
    @FXML
    private Button UsBtn;
    @FXML
    private Text amountTxt;
    @FXML
    private Label currnrcyLbl;
    @FXML
    private Button gbdBtn;
    @FXML
    private Text txt1;
    @FXML
    private Button yenBtn;

    @FXML
    void Convert(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }


    @FXML
    void GbcConvert(ActionEvent event) {
        double amt =euroConverter.getGBP();
        amountTxt.setText(String.valueOf(amt));

        currnrcyLbl.setText("£");
    }

    @FXML
    void usConvert(ActionEvent event) {
        double amt =euroConverter.getUSD();
        amountTxt.setText(String.valueOf(amt));
        currnrcyLbl.setText("$");

    }

    @FXML
    void yenConvert(ActionEvent event) {
        double amt =euroConverter.getYen();
        amountTxt.setText(String.valueOf(amt));
        currnrcyLbl.setText("¥");

    }
}
