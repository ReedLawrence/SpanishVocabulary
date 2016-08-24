package com.reed.spanishvocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class FlashCardActivity extends AppCompatActivity {

    private Chapter1Vocab mChapter1Vocab = new Chapter1Vocab();
    private Button mFlashCardButton;
    private Button mNextButton;
    private Button mHomeButton;
    private Boolean mFlip = false;      //to indicate which translation is displayed
    private Random mRandom = new Random();
    private int mCardNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_card);

        mFlashCardButton = (Button) findViewById(R.id.flashCardButton);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mHomeButton = (Button) findViewById(R.id.homeButton);

        mCardNum = mRandom.nextInt(mChapter1Vocab.getLength());
        mFlashCardButton.setText(mChapter1Vocab.getVocabWord(mCardNum).getSpanishTranslation());

        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mFlashCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipFlashCard();
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFlashCard();
            }
        });
    }

    private void flipFlashCard(){
        //Displays the English Text if Spanish is currently displayed and vice versa
        if(mFlip == false) {
            mFlip = true;
            mFlashCardButton.setText(mChapter1Vocab.getVocabWord(mCardNum).getEnglishTranslation());
        }else {
            mFlip = false;
            mFlashCardButton.setText(mChapter1Vocab.getVocabWord(mCardNum).getSpanishTranslation());
        }
    }

    private void nextFlashCard() {
        //Moves to the next random flash card
        mCardNum = mRandom.nextInt(mChapter1Vocab.getLength());
        mFlip = false;
        mFlashCardButton.setText(mChapter1Vocab.getVocabWord(mCardNum).getSpanishTranslation());
    }
}
