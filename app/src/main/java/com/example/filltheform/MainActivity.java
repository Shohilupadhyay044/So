package com.example.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    EditText mtOrg;
    EditText mtCust;
    EditText mtMob;
    EditText mtEmail;
    EditText mtAddress;
    EditText mtManu;
    EditText mtTax;
    EditText mtComp;

    ImageButton btnTick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtOrg = findViewById(R.id.etorganname);
        mtCust = findViewById(R.id.etcustomer);
        mtMob = findViewById(R.id.etmobile);
        mtAddress = findViewById(R.id.etaddress);
        mtEmail = findViewById(R.id.etemail);
        mtManu = findViewById(R.id.etManu);
        mtTax = findViewById(R.id.ettaxid);
        mtComp = findViewById(R.id.etcompany);
        btnTick = findViewById(R.id.btn);

        btnTick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                if(isCredentialValid()) {

                    intent.putExtra("org", mtOrg.getText().toString());
                    intent.putExtra("Customer", mtCust.getText().toString());
                    intent.putExtra("Mobile", mtMob.getText().toString());
                    intent.putExtra("Address", mtAddress.getText().toString());
                    intent.putExtra("Email", mtEmail.getText().toString());
                    intent.putExtra("Manufacture", mtManu.getText().toString());
                    intent.putExtra("TaxId", mtTax.getText().toString());
                    intent.putExtra("CompanyId", mtComp.getText().toString());

                    startActivity(intent);
                }
            }
        });
    }

    private boolean isCredentialValid() {

        boolean isDataValid = true;

        if (mtOrg.getText().toString().isEmpty()) {
            mtOrg.setError("Text is empty");
            isDataValid = false;
        }

        if (mtOrg.getText().toString().isEmpty()) {
            mtOrg.setError("Text is empty");
            isDataValid = false;
        }
        if (mtCust.getText().toString().isEmpty()) {
            mtCust.setError("Text is empty");
            isDataValid = false;
        }

        if (mtMob.getText().toString().isEmpty()) {
            mtOrg.setError("Text is empty");
            isDataValid = false;
        }
        if (mtAddress.getText().toString().isEmpty()) {
            mtOrg.setError("Text is empty");
            isDataValid = false;
        }
        if (mtEmail.getText().toString().isEmpty()) {
            mtOrg.setError("text is empty");
            isDataValid = false;
        }
        if (mtManu.getText().toString().isEmpty()) {
            mtOrg.setError("text is empty");
            isDataValid = false;
        }

        if (mtTax.getText().toString().isEmpty()) {
            mtOrg.setError("text is empty");
            isDataValid = false;
        }
        if (mtComp.getText().toString().isEmpty()) {
            mtOrg.setError("text is empty");
            isDataValid = false;
        }
        return isDataValid;
    }
}