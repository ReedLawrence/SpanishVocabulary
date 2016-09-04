package com.reed.spanishvocabulary.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.reed.spanishvocabulary.Model.HangmanGame;
import com.reed.spanishvocabulary.R;

import org.w3c.dom.Text;

public class HangmanActivity extends AppCompatActivity {
    private TextView mQText;
    private TextView mWText;
    private TextView mEText;
    private TextView mRText;
    private TextView mTText;
    private TextView mYText;
    private TextView mUText;
    private TextView mIText;
    private TextView mOText;
    private TextView mPText;
    private TextView mAText;
    private TextView mSText;
    private TextView mDText;
    private TextView mFText;
    private TextView mGText;
    private TextView mHText;
    private TextView mJText;
    private TextView mKText;
    private TextView mLText;
    private TextView mZText;
    private TextView mXText;
    private TextView mCText;
    private TextView mVText;
    private TextView mBText;
    private TextView mNText;
    private TextView mMText;
    private TextView mAAccentText;
    private TextView mEAccentText;
    private TextView mIAccentText;
    private TextView mOAccentText;
    private TextView mUAccentText;
    private TextView mEnieText;
    private HangmanGame mHangmanGame;
    private int mLives = 6;
    private TextView mHangmanTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);

        mQText = (TextView) findViewById(R.id.qText);
        mWText = (TextView) findViewById(R.id.wText);
        mEText = (TextView) findViewById(R.id.eText);
        mRText = (TextView) findViewById(R.id.rText);
        mTText = (TextView) findViewById(R.id.tText);
        mYText = (TextView) findViewById(R.id.yText);
        mUText = (TextView) findViewById(R.id.uText);
        mIText = (TextView) findViewById(R.id.iText);
        mOText = (TextView) findViewById(R.id.oText);
        mPText = (TextView) findViewById(R.id.pText);
        mAText = (TextView) findViewById(R.id.aText);
        mSText = (TextView) findViewById(R.id.sText);
        mDText = (TextView) findViewById(R.id.dText);
        mFText = (TextView) findViewById(R.id.fText);
        mGText = (TextView) findViewById(R.id.gText);
        mHText = (TextView) findViewById(R.id.hText);
        mJText = (TextView) findViewById(R.id.jText);
        mKText = (TextView) findViewById(R.id.kText);
        mLText = (TextView) findViewById(R.id.lText);
        mZText = (TextView) findViewById(R.id.zText);
        mXText = (TextView) findViewById(R.id.xText);
        mCText = (TextView) findViewById(R.id.cText);
        mVText = (TextView) findViewById(R.id.vText);
        mBText = (TextView) findViewById(R.id.bText);
        mNText = (TextView) findViewById(R.id.nText);
        mMText = (TextView) findViewById(R.id.mText);
        mAAccentText = (TextView) findViewById(R.id.aAccentText);
        mEAccentText = (TextView) findViewById(R.id.eAccentText);
        mIAccentText = (TextView) findViewById(R.id.iAccentText);
        mOAccentText = (TextView) findViewById(R.id.oAccentText);
        mUAccentText = (TextView) findViewById(R.id.uAccentText);
        mEnieText = (TextView) findViewById(R.id.nEnieText);
        mHangmanTextView = (TextView) findViewById(R.id.hangmanTextView);

        Button mHome = (Button) findViewById(R.id.homeButton);
        Button mPlayAgain = (Button) findViewById(R.id.playAgainButton);

        Intent intent = getIntent();
        mHangmanGame = new HangmanGame(intent.getIntExtra("chapterNumber", 1));

        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHangmanGame.resetGame();
                mLives = 6;
            }
        });

        //Generate Hangman Text
        mHangmanTextView.setText(mHangmanGame.getHangmanQuestionText());
        //Set listeners
        mQText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(0)) {
                    mHangmanGame.setPlayed(0);
                    String newQuestionText = mHangmanGame.checkForLetter('q');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mWText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(1)) {
                    mHangmanGame.setPlayed(1);
                    String newQuestionText = mHangmanGame.checkForLetter('q');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mEText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(2)) {
                    mHangmanGame.setPlayed(2);
                    String newQuestionText = mHangmanGame.checkForLetter('e');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mRText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(3)) {
                    mHangmanGame.setPlayed(3);
                    String newQuestionText = mHangmanGame.checkForLetter('r');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mTText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(4)) {
                    mHangmanGame.setPlayed(4);
                    String newQuestionText = mHangmanGame.checkForLetter('t');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mYText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(5)) {
                    mHangmanGame.setPlayed(5);
                    String newQuestionText = mHangmanGame.checkForLetter('y');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mUText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(6)) {
                    mHangmanGame.setPlayed(6);
                    String newQuestionText = mHangmanGame.checkForLetter('u');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mIText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(7)) {
                    mHangmanGame.setPlayed(7);
                    String newQuestionText = mHangmanGame.checkForLetter('i');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mOText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(8)) {
                    mHangmanGame.setPlayed(8);
                    String newQuestionText = mHangmanGame.checkForLetter('o');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mPText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(9)) {
                    mHangmanGame.setPlayed(9);
                    String newQuestionText = mHangmanGame.checkForLetter('p');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mAText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(10)) {
                    mHangmanGame.setPlayed(10);
                    String newQuestionText = mHangmanGame.checkForLetter('a');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
        mSText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mHangmanGame.isPLayed(11)) {
                    mHangmanGame.setPlayed(11);
                    String newQuestionText = mHangmanGame.checkForLetter('s');
                    if(newQuestionText.equalsIgnoreCase(mHangmanTextView.toString())){
                        mLives--;
                        if(mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setTextColor(Color.parseColor("#111111"));
                }
            }
        });
    }
    //Game Over
    private void gameOver() {

    }
}
