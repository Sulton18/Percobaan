package com.example.modul1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button klik;
    TextView muncul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        klik = findViewById(R.id.button);
        muncul = findViewById(R.id.textView);

        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muncul.setText("nama : ");
            }
        });

    }
}
