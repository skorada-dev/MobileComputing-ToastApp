package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();
    }

    private void init() {

        Intent intent = getIntent();
        TextView textView = findViewById(R.id.show_count);
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(message);
       
    }
    public void closeActivity (View view) {

        finish();
    }
}


