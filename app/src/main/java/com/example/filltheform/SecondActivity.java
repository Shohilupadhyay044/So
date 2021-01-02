package com.example.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText stOrg;
    EditText stCust;
    EditText stMob;
    EditText stEmail;
    EditText stAddress;
    EditText stManu;
    EditText stTax;
    EditText stComp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        stOrg = findViewById(R.id.org);
        stCust = findViewById(R.id.customer);
        stMob = findViewById(R.id.Mobile);
        stAddress = findViewById(R.id.address);
        stEmail = findViewById(R.id.email);
        stManu = findViewById(R.id.Manufacture);
        stTax = findViewById(R.id.Tax);
        stComp = findViewById(R.id.company);

        getDataFromIntent();
    }

    private void getDataFromIntent() {

        if (getIntent() != null && getIntent().getExtras() != null) {
            String data = getIntent().getStringExtra("org");
            stOrg.setText(data);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            String data1 = getIntent().getStringExtra("Customer");
            stCust.setText(data1);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            String data2 = getIntent().getStringExtra("Mobile");
            stMob.setText(data2);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            String data3 = getIntent().getStringExtra("Address");
            stAddress.setText(data3);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            String data4 = getIntent().getStringExtra("Email");
            stEmail.setText(data4);
        }

        if (getIntent() != null && getIntent().getExtras() != null) {
            String data5 = getIntent().getStringExtra("Manufacture");
            stManu.setText(data5);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            String data6 = getIntent().getStringExtra("TaxId");
            stTax.setText(data6);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            String data7 = getIntent().getStringExtra("CompanyId");
            stComp.setText(data7);
        }
    }
}

