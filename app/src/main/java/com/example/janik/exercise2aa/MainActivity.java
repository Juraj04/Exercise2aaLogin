package com.example.janik.exercise2aa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.editTextLogin);
        ArrayAdapter<String> aa =
                new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,new String[]
                                {"Pasi","Juraj","George","Domino","Milos","Peter"});
        actv.setAdapter(aa);
    }

    public void onClickLoginBtn(View view) {
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.editTextLogin);
        String name = actv.getText().toString();
        String pass = ((EditText)findViewById(R.id.editTextPass)).getText().toString();

        Toast.makeText(this,name + " " + pass, Toast.LENGTH_SHORT).show();
    }
}
