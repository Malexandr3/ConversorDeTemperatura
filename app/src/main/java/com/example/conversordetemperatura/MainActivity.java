package com.example.conversordetemperatura;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText temp;
    private RadioButton cParaF, cParaK, fParaC, fParaK, kParaF, kParaC;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp = findViewById(R.id.temp);
        cParaF = findViewById(R.id.cParaF);
        cParaK = findViewById(R.id.cParaK);
        fParaC = findViewById(R.id.fParaC);
        fParaK = findViewById(R.id.fParaK);
        kParaF = findViewById(R.id.kParaF);
        kParaC = findViewById(R.id.kParaC);
        resultado = findViewById(R.id.resultado);

    }
    public void calcularTemp(View v){
        String textoRes = temp.getText().toString();
        double temperatura = Double.parseDouble(textoRes);
        double resultadoTemp;
        String stringRes;

        if (cParaF.isChecked()) {
            resultadoTemp = (temperatura * 9/5) + 32;
            stringRes = resultadoTemp + " ºF";
            resultado.setText(stringRes);
        } else if (cParaK.isChecked()) {
            resultadoTemp = temperatura + 273;
            stringRes = resultadoTemp + " K";
            resultado.setText(stringRes);
        } else if (fParaC.isChecked()) {
            resultadoTemp = (temperatura - 32) * 5/9;
            stringRes = resultadoTemp + " ºC";
            resultado.setText(stringRes);
        } else if (fParaK.isChecked()) {
            resultadoTemp = (temperatura - 32) * 5/9 + 273;
            stringRes = resultadoTemp + " K";
            resultado.setText(stringRes);
        } else if (kParaF.isChecked()) {
            resultadoTemp = (temperatura - 273) * 9/5 + 32;
            stringRes = resultadoTemp + " ºF";
            resultado.setText(stringRes);
        } else if (kParaC.isChecked()) {
            resultadoTemp = temperatura - 273;
            stringRes = resultadoTemp + " ºC";
            resultado.setText(stringRes);
        } else {
            Toast.makeText(MainActivity.this, "Selecione uma opção para poder converter.", Toast.LENGTH_SHORT).show();
        }
    }
}