package com.kawal.autocompletetv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String addresses[]={"Ludhiana", "Jalandhar","Ludhiana2", "Hoshiarpur","Ludhiana1", "Moga","Ludhiana3", "Lucknow","Hussainpur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView address = (AutoCompleteTextView)findViewById(R.id.auto);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,addresses);
        address.setThreshold(2);
        address.setAdapter(arrayAdapter);
    }
}
