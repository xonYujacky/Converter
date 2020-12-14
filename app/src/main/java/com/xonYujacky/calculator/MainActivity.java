package com.xonYujacky.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResult;
    //private TextView textCm;
    private EditText edt_tinggi_m;
    private Button button_calculateHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        ButtonHitungTinggi();

    }

    private void findView() {
        textResult = findViewById(R.id.text_view_result);
        //textCm = findViewById(R.id.text_result_cm);
        edt_tinggi_m = findViewById(R.id.edit_text_meter);
        button_calculateHeight = findViewById(R.id.button_convert_cm);

    }

    private void ButtonHitungTinggi() {
        button_calculateHeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rumus();
            }
        });
    }

    private void Rumus() {
        String HeightMeterText = edt_tinggi_m.getText().toString();
        double meter = Integer.parseInt(HeightMeterText);

        double hasil = meter * 100;
        textResult.setText("Tinggi anda adalah : " + hasil);

    }
}

  /*  private void DisplayHasil(int cm){
        String displayTxt;

        textResult = "Tinggi Badan Anda : " + meter;
    }*/

