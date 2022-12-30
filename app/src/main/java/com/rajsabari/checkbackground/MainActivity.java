package com.rajsabari.checkbackground;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup=findViewById(R.id.grp);
        RadioButton red=findViewById(R.id.red);
        RadioButton blue=findViewById(R.id.blue);
        RadioButton white=findViewById(R.id.green);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.red:
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                        Toast.makeText(MainActivity.this, "The color is RED", Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.blue:
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        Toast.makeText(MainActivity.this, "The color is BLUE", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.green:
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        Toast.makeText(MainActivity.this, "The color is GREEN", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });



    }
}