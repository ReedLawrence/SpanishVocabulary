package com.reed.spanishvocabulary.UI;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.reed.spanishvocabulary.Model.MultipleChoiceQuestion;
import com.reed.spanishvocabulary.R;

import java.util.Random;

public class MultipleChoiceActivity extends AppCompatActivity {

    //View Variables
    private TextView mQuestionTextView;
    private Button mChoice1Button;
    private Button mChoice2Button;
    private Button mChoice3Button;
    private Button mChoice4Button;
    private Button mNextQuestionButton;

    //Other Variables
    //private VocabBook mVocabBook = new VocabBook();
    private int mNumQuestions = 10;
    private int mNumCorrectAns = 0;
    private boolean mAnswerFlag = false;
    private MultipleChoiceQuestion mQuestion = new MultipleChoiceQuestion(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        //Set Chapter number from User Selection on Previous Activity
        Intent intent = getIntent();
        mQuestion.setChapterNum(intent.getIntExtra("chapterNumber", 1));

        //Initialize View Variables
        mQuestionTextView = (TextView) findViewById(R.id.questionTextView);
        mChoice1Button = (Button) findViewById(R.id.choice1Button);
        mChoice2Button = (Button) findViewById(R.id.choice2Button);
        mChoice3Button = (Button) findViewById(R.id.choice3Button);
        mChoice4Button = (Button) findViewById(R.id.choice4Button);
        mNextQuestionButton = (Button) findViewById(R.id.nextQuestionButton);
        mNextQuestionButton.setVisibility(View.INVISIBLE);

        //Set Chapter and Generate First Question
        //mQuestion.setChapterNum(1);
        generateQuestion();

        mChoice1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mChoice1Button.getText() == mQuestion.getCorrectAnswer()) {
                    mNextQuestionButton.setText(R.string.correctAnswer);
                    mNumCorrectAns++;
                    mAnswerFlag = true;
                } else {
                    mNextQuestionButton.setText(R.string.incorrectAnswer);
                    mChoice1Button.setBackgroundResource(R.drawable.bg_choice_button_red);
                    mAnswerFlag = false;
                }
                displayNextQuestionButton();
            }
        });
        mChoice2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChoice2Button.getText() == mQuestion.getCorrectAnswer()) {
                    mNextQuestionButton.setText(R.string.correctAnswer);
                    mNumCorrectAns++;
                    mAnswerFlag = true;
                } else {
                    mNextQuestionButton.setText(R.string.incorrectAnswer);
                    mChoice2Button.setBackgroundResource(R.drawable.bg_choice_button_red);
                    mAnswerFlag = false;
                }
                displayNextQuestionButton();
            }
        });
        mChoice3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChoice3Button.getText() == mQuestion.getCorrectAnswer()) {
                    mNextQuestionButton.setText(R.string.correctAnswer);
                    mNumCorrectAns++;
                    mAnswerFlag = true;
                } else {
                    mNextQuestionButton.setText(R.string.incorrectAnswer);
                    mChoice3Button.setBackgroundResource(R.drawable.bg_choice_button_red);
                    mAnswerFlag = false;
                }
                displayNextQuestionButton();
            }
        });
        mChoice4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mNumQuestions <= 1) {
                    finish();
                }
                if(mChoice4Button.getText() == mQuestion.getCorrectAnswer()) {
                    mNextQuestionButton.setText(R.string.correctAnswer);
                    mNumCorrectAns++;
                    mAnswerFlag = true;
                } else {
                    mNextQuestionButton.setText(R.string.incorrectAnswer);
                    mChoice4Button.setBackgroundResource(R.drawable.bg_choice_button_red);
                    mAnswerFlag = false;
                }
                displayNextQuestionButton();
            }
        });
        mNextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mNumQuestions<=1) {
                    mNextQuestionButton.setVisibility(View.INVISIBLE);
                    mChoice1Button.setVisibility(View.INVISIBLE);
                    mChoice2Button.setVisibility(View.INVISIBLE);
                    mChoice3Button.setVisibility(View.INVISIBLE);
                    mChoice4Button.setVisibility(View.VISIBLE);
                    mChoice4Button.setText(R.string.home);
                    Resources res = getResources();
                    mQuestionTextView.setText(String.format(res.getString(R.string.quizEnding), mNumCorrectAns));
                } else {
                    if (mAnswerFlag) {
                        displayChoiceButtons();
                        generateQuestion();
                        mNumQuestions--;
                    } else {
                        displayChoiceButtons();
                        mNumQuestions--;
                    }
                }
            }
        });
    }

    private void displayNextQuestionButton() {
        mNextQuestionButton.setVisibility(View.VISIBLE);
        mChoice1Button.setVisibility(View.INVISIBLE);
        mChoice2Button.setVisibility(View.INVISIBLE);
        mChoice3Button.setVisibility(View.INVISIBLE);
        mChoice4Button.setVisibility(View.INVISIBLE);
    }

    private void displayChoiceButtons() {
        mChoice1Button.setVisibility(View.VISIBLE);
        mChoice2Button.setVisibility(View.VISIBLE);
        mChoice3Button.setVisibility(View.VISIBLE);
        mChoice4Button.setVisibility(View.VISIBLE);
        mNextQuestionButton.setVisibility(View.INVISIBLE);
    }

    private void generateQuestion() {
        //mQuestion = new MultipleChoiceQuestion(mVocabBook);
        mQuestion.generateNewQuestion();
        mQuestionTextView.setText(mQuestion.getQuestionText());
        mChoice1Button.setBackgroundResource(R.drawable.bg_choice_button_blue);
        mChoice2Button.setBackgroundResource(R.drawable.bg_choice_button_blue);
        mChoice3Button.setBackgroundResource(R.drawable.bg_choice_button_blue);
        mChoice4Button.setBackgroundResource(R.drawable.bg_choice_button_blue);
        Random randomGenerator = new Random();
        int correctAns = randomGenerator.nextInt(4);
        int incorrectIndex = 0;
        if(correctAns == 0) {
            //Set Correct Answer to Button 1
            mChoice1Button.setText(mQuestion.getCorrectAnswer());
        } else {
            //Set first Incorrect answer in array index to button 1
            mChoice1Button.setText(mQuestion.getIncorrectAnswer(incorrectIndex));
            incorrectIndex++;
        }
        if(correctAns == 1) {
            //Set Correct Answer to Button 2
            mChoice2Button.setText(mQuestion.getCorrectAnswer());
        } else {
            //Set first Incorrect answer in array index to button 2
            mChoice2Button.setText(mQuestion.getIncorrectAnswer(incorrectIndex));
            incorrectIndex++;
        }
        if(correctAns == 2) {
            //Set Correct Answer to Button 3
            mChoice3Button.setText(mQuestion.getCorrectAnswer());
        } else {
            //Set first Incorrect answer in array index to button 3
            mChoice3Button.setText(mQuestion.getIncorrectAnswer(incorrectIndex));
            incorrectIndex++;
        }
        if(correctAns == 3) {
            //Set Correct Answer to Button 4
            mChoice4Button.setText(mQuestion.getCorrectAnswer());
        } else {
            //Set first Incorrect answer in array index to button 4
            mChoice4Button.setText(mQuestion.getIncorrectAnswer(incorrectIndex));
        }
    }
}
