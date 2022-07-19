package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pantalla3 extends AppCompatActivity {
    private EditText et1, ete2;
    private CheckBox checkq, check2, check3, check4;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        et1 = (EditText) findViewById(R.id.edit_1);
        ete2 = (EditText) findViewById(R.id.edit_2);
        checkq = (CheckBox) findViewById(R.id.check_suma);
        check2 = (CheckBox) findViewById(R.id.check_resta);
        check3 = (CheckBox) findViewById(R.id.check_multiplicacion);
        check4 = (CheckBox) findViewById(R.id.check_division);
        tv2 = (TextView) findViewById(R.id.tv_resultado2);

    }
//boton
public void resoluver (View view) {
    String et1_string = et1.getText().toString();
    String ete2_string = ete2.getText().toString();


    int et1_int = Integer.parseInt(et1_string);
    int ete2_int = Integer.parseInt(ete2_string);

    String reultado = "";
        if (checkq.isChecked() == true){
            int suma = et1_int + ete2_int;
            reultado = "la suma es : " + suma + "/";

        }
    if (check2.isChecked() == true){
        int resta = et1_int - ete2_int;
        reultado = reultado + "La resta es ;" + resta+ " / ";

}
    if (check3.isChecked() == true){
        int mul = et1_int*ete2_int;
        reultado = reultado  + "La multiplicacion es ;" + mul + "/";
}
    if (check4.isChecked()==true) {
        if (ete2_int != 0){
            int dividir = et1_int/ete2_int;
            reultado = reultado+" La division es: "+dividir+" / ";
        }else {
            Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
        }
    }
     tv2.setText(reultado);
}
    public void regresarin (View view){
        Intent siu = new Intent(this,MainActivity.class);
        startActivity(siu);

}
}