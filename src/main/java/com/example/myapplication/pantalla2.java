package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class pantalla2 extends AppCompatActivity {
    private EditText et_valor1, et_valor2;
            private RadioButton rb_suma, rb_resta, rb_mul, rb_div;
            private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        et_valor1 = (EditText) findViewById(R.id.txt_valor1);
        et_valor2 = (EditText) findViewById(R.id.txt_valor2);
        rb_suma = (RadioButton) findViewById(R.id.rb_suma);
        rb_resta = (RadioButton) findViewById(R.id.rb_resta);
        rb_mul = (RadioButton) findViewById(R.id.rb_producto);
        rb_div = (RadioButton) findViewById(R.id.rb_division);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
    }
    //boton
    public void resolver (View view) {
     String valor1_string = et_valor1.getText().toString();
     String valor2_string = et_valor2.getText().toString();

     int valor1_int = Integer.parseInt(valor1_string);
     int valor2_int = Integer.parseInt(valor2_string);

     if(rb_suma.isChecked() == true) {
         int suma = valor1_int + valor2_int;
         String resultado = String.valueOf(suma);
         tv_resultado.setText(resultado);
     } else if (rb_resta.isChecked() == true) {
      int resta = valor1_int - valor2_int;
      String resultado = String.valueOf(resta);
      tv_resultado.setText(resultado);
     } else if (rb_mul.isChecked() == true){
         int multiplicacion = valor1_int * valor2_int;
         String resultado = String.valueOf(multiplicacion);
         tv_resultado.setText (resultado);
     } else if (rb_div.isChecked() == true){

         if (valor2_int != 0 ) {
             int division = valor1_int / valor2_int;
             String resultado = String.valueOf(division);
             tv_resultado.setText(resultado);
         } else {
             Toast.makeText(this, "El seguando valor debe ser cero", Toast.LENGTH_LONG).show();


         }


     }

    }

    public void regresar (View view){
        Intent fiu = new Intent(this,MainActivity.class);
        startActivity(fiu);

    }
}