package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText edv1, edv2, edresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edv1 = (EditText) findViewById(R.id.editTextValor1);
        edv2 = (EditText) findViewById(R.id.editTextValor2);
        edresult = (EditText) findViewById(R.id.editTextResultado);
    }

    public void calcular(View v){
        Calc soma = new Calc();
        switch(v.getId())
        {
            case R.id.buttonSoma:
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.somar()));
                break;
            case R.id.buttonSubtracao:
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.subtrair()));
                break;
            case R.id.buttonDivisão:
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.dividir()));
                break;
            case R.id.buttonMultiplicacao:
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.multiplicar()));
                break;
        }

    }
}