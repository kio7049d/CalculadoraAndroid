package com.example.NOMBRE_DE_TU_PROYECTO; // <<<<<<<<<<<<<CAMBIAR NOMBRE POR EL NOMBRE DE TU ARCHIVO/PROYECTO

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3;
    private Button buttonSum;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        buttonSum = findViewById(R.id.buttonSum);
        resultTextView = findViewById(R.id.resultTextView);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(editText1.getText().toString());
                int value2 = Integer.parseInt(editText2.getText().toString());
                int value3 = Integer.parseInt(editText3.getText().toString());

                int sum = value1 + value2 + value3;

                resultTextView.setText("El resultado es: " + sum);
            }
        });
    }
}
