package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LabTestDetailActivity extends AppCompatActivity {

    TextView tvPackageName,tvTotalCost;
    EditText edDetails;
    Button btnAddToCart,btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test_detail);

       // tvPackageName = findViewById(R.id.textViewLDPackageName);
       // tvTotalCost = findViewById(R.id.textViewLBCostTotal);
      //  edDetails = findViewById(R.id.editTextLDMultiLine);

        btnBack = findViewById(R.id.buttonLDBack);
        btnAddToCart = findViewById(R.id.buttonLDAddToCart);

        edDetails.setKeyListener(null);

        Intent intent = getIntent();
        tvPackageName.setText(intent.getStringExtra("text1"));
        edDetails.setText(intent.getStringExtra("text2"));
        tvTotalCost.setText("Total Cost : "+intent.getStringExtra("text3")+ "/-");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestDetailActivity.this,LabTextBookActivity.class));
            }
        });
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                String username = sharedPreferences.getString("username","").toString();
                String product = tvPackageName.getText().toString();

                float price = Float.parseFloat(intent.getStringExtra("text3").toString());

                Database db = new Database(getApplicationContext(),"heathcare",null,1);

                if(db.checkCart(username,product)==1){
                    Toast.makeText(getApplicationContext(), "Product Already added", Toast.LENGTH_SHORT).show();
                }else{
                    db.addCart(username,product,price,"lab");
                    Toast.makeText(getApplicationContext(), "Record Inserted to cart", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LabTestDetailActivity.this,LabTextBookActivity.class));
                }
            }
        });
    }
}