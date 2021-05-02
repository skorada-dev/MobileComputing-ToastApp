package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.toast.extra.MESSAGE";
    private Intent intent;
    private int mCount = 0;
    private TextView mShowCount;
    private Button btnToast, btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

        init();
    }

    public void init() {
        mCount = 0;
        mShowCount = findViewById(R.id.show_count);
        btnToast = findViewById(R.id.button_toast);
        btnCount = findViewById(R.id.button_count);

        btnToast.setText("Say Hello");

        intent = new Intent(this, SecondActivity.class);
    }

    public void showToast(View view) {

        Log.d(LOG_TAG, "Button clicked!");
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, SecondActivity.class);
        String message = Integer.toString(mCount);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
}


