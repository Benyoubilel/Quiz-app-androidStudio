package com.example.myquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView nbrQustionTextView;
    TextView questionTextView;
    Button repA, repB, repC, repD;
    Button suivant;

    int score=0;
    int nbrQustion = QuestionAnswer.question.length;
    int index = 0;
    String choixSelect = "";


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nbrQustionTextView = findViewById(R.id.nbrtotal_question);
        questionTextView = findViewById(R.id.question);
        repA = findViewById(R.id.rep_A);
        repB = findViewById(R.id.rep_B);
        repC = findViewById(R.id.rep_C);
        repD = findViewById(R.id.rep_D);
        suivant = findViewById(R.id.suiv_btn);

        repA.setOnClickListener(this);
        repB.setOnClickListener(this);
        repC.setOnClickListener(this);
        repD.setOnClickListener(this);
        suivant.setOnClickListener(this);

        nbrQustionTextView.setText("Total questions : "+nbrQustion);

        questionSuiv();




    }

    @Override
    public void onClick(View view) {

        repA.setBackgroundColor(Color.WHITE);
        repB.setBackgroundColor(Color.WHITE);
        repC.setBackgroundColor(Color.WHITE);
        repD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.suiv_btn){
            if(choixSelect.equals(QuestionAnswer.reponseCorrect[index])){
                score++;
            }
            index++;
            questionSuiv();


        }else{
            //choices button clicked
            choixSelect  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.BLUE);

        }

    }

    void questionSuiv(){

        if(index == nbrQustion ){
            endQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswer.question[index]);
        repA.setText(QuestionAnswer.choix[index][0]);
        repB.setText(QuestionAnswer.choix[index][1]);
        repC.setText(QuestionAnswer.choix[index][2]);
        repD.setText(QuestionAnswer.choix[index][3]);

    }

    void endQuiz(){


        new AlertDialog.Builder(this)
                .setMessage("Votre score est "+score+"/"+nbrQustion)
                .setPositiveButton("Restart",(dialogInterface, i) -> rechergerQuiz() )
                .setCancelable(false)
                .show();
    }

    void rechergerQuiz(){
        score = 0;
        index =0;
        questionSuiv();
    }
}