package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText edv1, edv2, edresult;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edv1 = (EditText) findViewById(R.id.editTextValor1);
        edv2 = (EditText) findViewById(R.id.editTextValor2);
        edresult = (EditText) findViewById(R.id.editTextResultado);
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    public void calcular(View v){
        Calc soma = new Calc();
        int opcao;
        if(spinner.getSelectedItem().toString().equals("Somar")){
            soma.setValor1(Double.parseDouble(edv1.getText().toString()));
            soma.setValor2(Double.parseDouble(edv2.getText().toString()));
            edresult.setText(String.format("%.3f", soma.somar()));
        }
        else if (spinner.getSelectedItem().toString().equals("Subtrair")){
            soma.setValor1(Double.parseDouble(edv1.getText().toString()));
            soma.setValor2(Double.parseDouble(edv2.getText().toString()));
            edresult.setText(String.format("%.3f", soma.subtrair()));
        }
        else if (spinner.getSelectedItem().toString().equals("Multiplicar")){
            soma.setValor1(Double.parseDouble(edv1.getText().toString()));
            soma.setValor2(Double.parseDouble(edv2.getText().toString()));
            edresult.setText(String.format("%.3f", soma.multiplicar()));
        }
        else if (spinner.getSelectedItem().toString().equals("Dividir")){
            soma.setValor1(Double.parseDouble(edv1.getText().toString()));
            soma.setValor2(Double.parseDouble(edv2.getText().toString()));
            edresult.setText(String.format("%.3f", soma.dividir()));
        }
    }
}