package com.vibhu.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText RupeeField = (EditText) findViewById(R.id.RupeeField);

        Double dollar = Double.parseDouble(RupeeField.getText().toString());

        Double rupees = dollar * 65.30;

        Toast.makeText(getApplicationContext(),"Rupees "+rupees.toString(),Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
