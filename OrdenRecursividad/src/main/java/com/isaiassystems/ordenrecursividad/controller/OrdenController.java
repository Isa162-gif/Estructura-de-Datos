package com.isaiassystems.ordenrecursividad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OrdenController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Button btnVerificar;

    @FXML
    private Label lblResultado;

    // When the button is clicked
    @FXML
    protected void verificarOrden() {
        try {
            int num = Integer.parseInt(txtNumero.getText());
            String resultado = "";

            if (ordenado_cre(num))
                resultado += "✅ Está ordenado de forma creciente\n";
            else
                resultado += "❌ NO está ordenado de forma creciente\n";

            if (ordenado_decre(num))
                resultado += "✅ Está ordenado de forma decreciente";
            else
                resultado += "❌ NO está ordenado de forma decreciente";

            lblResultado.setText(resultado);

        } catch (NumberFormatException e) {
            lblResultado.setText("Por favor ingresa un número válido.");
        }
    }

    // Recursive method: calculates base^exp
    private int poten(int base, int exp) {
        if (exp == 0) return 1;
        else return base * poten(base, exp - 1);
    }

    // Recursive method: counts digits of a number
    private int digitos(int num) {
        if (num == 0) return 0;
        return 1 + digitos(num / 10);
    }

    // Checks if number is increasing
    private boolean ordenado_cre(int num) {
        if (num < 10) return true;
        int num_izq = num / poten(10, digitos(num) - 1);
        num = num - num_izq * poten(10, digitos(num) - 1);
        int num_der = num / poten(10, digitos(num) - 1);

        if (num_izq <= num_der) return ordenado_cre(num);
        else return false;
    }

    // Checks if number is decreasing
    private boolean ordenado_decre(int num) {
        if (num < 10) return true;
        int num_izq = num / poten(10, digitos(num) - 1);
        num = num - num_izq * poten(10, digitos(num) - 1);
        int num_der = num / poten(10, digitos(num) - 1);

        if (num_izq >= num_der) return ordenado_decre(num);
        else return false;
    }
}