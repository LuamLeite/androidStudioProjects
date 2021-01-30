package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edv1, edv2, edresult;
    RadioButton radioSomar, radioSubtrair, radioMultiplicar, radioDividir;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edv1 = (EditText) findViewById(R.id.editTextValor1);
        edv2 = (EditText) findViewById(R.id.editTextValor2);
        edresult = (EditText) findViewById(R.id.editTextResultado);
        radioSomar = (RadioButton) findViewById(R.id.radioSomar);
        radioSubtrair = (RadioButton) findViewById(R.id.radioSubtrair);
        radioMultiplicar = (RadioButton) findViewById(R.id.radioMultiplicar);
        radioDividir = (RadioButton) findViewById(R.id.radioDividir);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void calcular(View v){
        Calc soma = new Calc();
        if(radioGroup.getCheckedRadioButtonId() != -1) {
            if (radioSomar.isChecked()) {
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.somar()));
            } else if (radioSubtrair.isChecked()) {
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.subtrair()));
            } else if (radioDividir.isChecked()) {
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.dividir()));
            } else if (radioMultiplicar.isChecked()) {
                soma.setValor1(Double.parseDouble(edv1.getText().toString()));
                soma.setValor2(Double.parseDouble(edv2.getText().toString()));
                edresult.setText(String.format("%.3f", soma.multiplicar()));
            }
        }
    }
}