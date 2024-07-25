package com.example.glang;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {
    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB,ansC,ansD;
    Button submit_btn;
    Button back;

    int score=0;
    int totalQuestion = QuestionAnswer2.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);
        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submit_btn = findViewById(R.id.submit_btn);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this, MainActivity8.class);
                startActivity(intent);
                finish();
            }
        });

        ansA.setOnClickListener(this::onClick);
        ansB.setOnClickListener(this::onClick);
        ansC.setOnClickListener(this::onClick);
        ansD.setOnClickListener(this::onClick);
        submit_btn.setOnClickListener(this::onClick);
        ansA.setOnClickListener(this::onClick);


        totalQuestionsTextView.setText("Total questions: " + totalQuestion);

        loadNewQuestion();


    }


    public void onClick(View view) {
        ansA.setBackgroundColor(Color.BLACK);
        ansB.setBackgroundColor(Color.BLACK);
        ansC.setBackgroundColor(Color.BLACK);
        ansD.setBackgroundColor(Color.BLACK);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==(R.id.submit_btn)){
            if (selectedAnswer.equals(QuestionAnswer2.correctAnswers[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();
        }else {
            //choices button clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }

    }

    void loadNewQuestion(){
        if(currentQuestionIndex == totalQuestion){
            finishQuiz();
            return;
        }
        questionTextView.setText(QuestionAnswer2.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswer2.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer2.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer2.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer2.choices[currentQuestionIndex][3]);
    }

    void finishQuiz() {
        String passStatus = "";
        if (score > totalQuestion*0.60) {
            passStatus = "Sheesh! Ang galing";
        } else {
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score: " +  score +  " out of "  + totalQuestion)
                .setPositiveButton("Try again, bestie",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();

    }
    void restartQuiz(){
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
}
