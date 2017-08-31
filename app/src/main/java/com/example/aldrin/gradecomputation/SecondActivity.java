package com.example.aldrin.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView raGrade;
    TextView finalGrade;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        raGrade = (TextView) findViewById(R.id.raGrade);
        finalGrade = (TextView) findViewById(R.id.finalGrade);
        btnBack = (Button) findViewById(R.id.btnBack);
        String msg = getIntent().getStringExtra("raw");
        String msg2 = getIntent().getStringExtra("fgres");
        raGrade.setText(msg);
        finalGrade.setText(msg2);
    }

    public void goBacktoMain (View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}
