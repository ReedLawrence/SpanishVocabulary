package com.reed.spanishvocabulary.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.reed.spanishvocabulary.R;
import com.reed.spanishvocabulary.Model.VocabBook;

import java.util.Random;

public class FlashCardActivity extends AppCompatActivity {

    private VocabBook mVocabBook = new VocabBook();
    private Button mFlashCardButton;
    private Boolean mFlip = false;      //to indicate which translation is displayed
    private Random mRandom = new Random();
    private int mCardNum = 0;
    private int mChapterNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_card);

        Intent intent = getIntent();
        setChapterNum(intent.getIntExtra("chapterNumber", 1));

        //Toast to check chapter number
        //Toast.makeText(this, "Chapter Number: " + mChapterNum, Toast.LENGTH_LONG).show();

        mFlashCardButton = (Button) findViewById(R.id.flashCardButton);
        Button nextButton = (Button) findViewById(R.id.nextButton);
        Button homeButton = (Button) findViewById(R.id.hangmanHomeButton);

        mCardNum = mRandom.nextInt(mVocabBook.getLength(getChapterNum()));
        mFlashCardButton.setText(mVocabBook.getVocabWord(getChapterNum(), mCardNum).getSpanishTranslation());

        homeButton.setOnClickListener(new View.OnClickListener() {
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

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFlashCard();
            }
        });
    }

    private void flipFlashCard(){
        //Displays the English Text if Spanish is currently displayed and vice versa
        if(!mFlip) {
            mFlip = true;
            mFlashCardButton.setText(mVocabBook.getVocabWord(getChapterNum(), mCardNum).getEnglishTranslation());
        }else {
            mFlip = false;
            mFlashCardButton.setText(mVocabBook.getVocabWord(getChapterNum(), mCardNum).getSpanishTranslation());
        }
    }

    private void nextFlashCard() {
        //Moves to the next random flash card
        mCardNum = mRandom.nextInt(mVocabBook.getLength(getChapterNum()));
        mFlip = false;
        mFlashCardButton.setText(mVocabBook.getVocabWord(getChapterNum(), mCardNum).getSpanishTranslation());
    }

    public int getChapterNum() {
        return mChapterNum;
    }

    public void setChapterNum(int chapterNum) {
        mChapterNum = chapterNum;
    }
}
