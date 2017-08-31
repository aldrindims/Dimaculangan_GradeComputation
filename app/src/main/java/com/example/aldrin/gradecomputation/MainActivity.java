package com.example.aldrin.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText quiz1;
    EditText quiz2;
    EditText seatwork;
    EditText labExer;
    EditText majExam;
    Button compute;
    double quiz1result, quiz2result, seatworkresult, labexerresult, majexamresult, results, raw;
    String fgresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz1 = (EditText) findViewById(R.id.quiz1);
        quiz2 = (EditText) findViewById(R.id.quiz2);
        seatwork = (EditText) findViewById(R.id.stwrk);
        labExer = (EditText) findViewById(R.id.labExer);
        majExam = (EditText) findViewById(R.id.majExam);
        compute = (Button) findViewById(R.id.compute);
    }

    public void callSecondActivity (View view) {

        Intent intent = new Intent(this,SecondActivity.class);

        quiz1result = Double.parseDouble(quiz1.getText().toString());
        quiz2result = Integer.parseInt(quiz2.getText().toString());
        seatworkresult = Integer.parseInt(seatwork.getText().toString());
        labexerresult = Integer.parseInt(labExer.getText().toString());
        majexamresult = Integer.parseInt(majExam.getText().toString());

        results = (quiz1result * .1) +(quiz2result * .1) +(seatworkresult * .1) + (labexerresult * .4) + (majexamresult * .3);
        String rawresult = toString().valueOf(results);
        intent.putExtra("raw", rawresult);

        if (results < 60) {
            fgresult = "Failed";
        } else if (results <= 65 && results >= 60) {
            fgresult = "3.0";
        } else if (results <= 70 && results >= 65) {
            fgresult = "2.75";
        } else if (results <= 75 && results >= 70) {
            fgresult = "2.50";
        } else if (results <= 80 && results >= 75) {
            fgresult = "2.25";
        } else if (results <= 85 && results >= 80) {
            fgresult = "2.0";
        } else if (results <= 90 && results >= 85) {
            fgresult = "1.75";
        } else if (results <= 92 && results >= 90) {
            fgresult = "1.50";
        } else if (results <= 94 && results >= 92) {
            fgresult = "1.25";
        } else if (results <= 100 && results >= 94) {
            fgresult = "1.0";
        }

        intent.putExtra("fgres", fgresult);
        startActivity(intent);

    }
}
