package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KalkulatorController {

    @FXML
    private TextField poleA;
    @FXML
    private TextField poleB;
    @FXML
    private TextField poleC;
    @FXML
    private Label labelWynik;

    @FXML
    public void oblicz() {
        try {
            double a = Double.parseDouble(poleA.getText());
            double b = Double.parseDouble(poleB.getText());
            double c = Double.parseDouble(poleC.getText());

            WielomianKwadratowy wielomian = new WielomianKwadratowy(a, b, c);
            Wynik wynik = wielomian.obliczMiejscaZerowe();

            String tekstWyniku = "Delta = " + wynik.getDelta() + "\n" + wynik.getKomunikat();
            if (wynik.getX1() != null) tekstWyniku += "\nx1 = " + wynik.getX1();
            if (wynik.getX2() != null) tekstWyniku += "\nx2 = " + wynik.getX2();

            labelWynik.setText(tekstWyniku);

        } catch (NumberFormatException e) {
            labelWynik.setText("Błąd: Wprowadź poprawne liczby we wszystkich polach!");
        }
    }
}
