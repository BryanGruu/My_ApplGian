package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class pantalla4 extends AppCompatActivity {
    private Spinner spiner1;
    private EditText etl1, etl2;
    private TextView tvy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        etl1 = (EditText) findViewById(R.id.etr_valor1);
        etl2 = (EditText) findViewById(R.id.etr_valor2);
        tvy = (TextView) findViewById(R.id.tv_resultado3);
        spiner1 = (Spinner) findViewById(R.id.spinner);

        String [] opciones = {"sumar", "restar", "multiplicar", "dividir"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spiner1.setAdapter(adapter);


    }
    //boton
    public void cal (View view) {
        String valor1_string = etl1.getText().toString();
        String valor2_string = etl2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        String seleccion = spiner1.getSelectedItem().toString();
        if(seleccion.equals("sumar")){
            int suma =  valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tvy.setText(resultado);
        }else if(seleccion.equals("restar")){
            int resta =  valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tvy.setText(resultado);
        }else if(seleccion.equals("multiplicar")){
            int mul =  valor1_int * valor2_int;
            String resultado = String.valueOf(mul);
            tvy.setText(resultado);
        }else if(seleccion.equals("dividir")){


            if(valor2_int != 0){
            int div =  valor1_int / valor2_int;
            String resultado = String.valueOf(div);
            tvy.setText(resultado);
        }else {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void atras (View view){
        Intent ri = new Intent(this,MainActivity.class);
        startActivity(ri);
}
}