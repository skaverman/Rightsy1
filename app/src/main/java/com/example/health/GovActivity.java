package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GovActivity extends AppCompatActivity {
   private Button btn1;

    private Button btn2;
    private EditText btn3;
 int ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gov);

        btn1=findViewById(R.id.govLogin1);
        btn2=findViewById(R.id.govLogin2);
        btn3=findViewById(R.id.govLogin3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(GovActivity.this,WebGovActivity.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String btn32 = btn3.getText().toString();
                String pino="12345";
                if (btn32.compareTo(pino) != 0){
                      ab=1;
                }
                if (btn3.length() == 0 || ab!=1)  {
                    Toast.makeText(getApplicationContext(), "Please fill the field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(GovActivity.this, LoginActivity.class);
                    startActivity(i);
                }
            }
        });











    }
}