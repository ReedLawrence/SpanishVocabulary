package com.reed.spanishvocabulary.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.reed.spanishvocabulary.Model.HangmanGame;
import com.reed.spanishvocabulary.R;

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
    private TextView mGameOverText;
    private Button mPlayAgain;

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


        Button mHome = (Button) findViewById(R.id.hangmanHomeButton);

        mPlayAgain = (Button) findViewById(R.id.playAgainButton);
        mGameOverText = (TextView) findViewById(R.id.gameOverText);
        mPlayAgain.setVisibility(View.INVISIBLE);
        mGameOverText.setVisibility(View.INVISIBLE);


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
                mHangmanTextView.setText(mHangmanGame.getHangmanQuestionText());
                showLetterButtons();
                mGameOverText.setVisibility(View.INVISIBLE);
                mPlayAgain.setVisibility(View.INVISIBLE);
                mLives = 6;
            }
        });


        //Generate Hangman Text
        mHangmanTextView.setText(mHangmanGame.getHangmanQuestionText());

        //Set listeners
        mQText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(0)) {
                    mHangmanGame.setPlayed(0);
                    String newQuestionText = mHangmanGame.checkForLetter('q');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mQText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mWText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(1)) {
                    mHangmanGame.setPlayed(1);
                    String newQuestionText = mHangmanGame.checkForLetter('q');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mWText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mEText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(2)) {
                    mHangmanGame.setPlayed(2);
                    String newQuestionText = mHangmanGame.checkForLetter('e');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mEText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mRText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(3)) {
                    mHangmanGame.setPlayed(3);
                    String newQuestionText = mHangmanGame.checkForLetter('r');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mRText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mTText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(4)) {
                    mHangmanGame.setPlayed(4);
                    String newQuestionText = mHangmanGame.checkForLetter('t');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mTText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mYText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(5)) {
                    mHangmanGame.setPlayed(5);
                    String newQuestionText = mHangmanGame.checkForLetter('y');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mYText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mUText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(6)) {
                    mHangmanGame.setPlayed(6);
                    String newQuestionText = mHangmanGame.checkForLetter('u');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mUText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mIText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(7)) {
                    mHangmanGame.setPlayed(7);
                    String newQuestionText = mHangmanGame.checkForLetter('i');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mIText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mOText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(8)) {
                    mHangmanGame.setPlayed(8);
                    String newQuestionText = mHangmanGame.checkForLetter('o');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mOText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mPText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(9)) {
                    mHangmanGame.setPlayed(9);
                    String newQuestionText = mHangmanGame.checkForLetter('p');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mPText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mAText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(10)) {
                    mHangmanGame.setPlayed(10);
                    String newQuestionText = mHangmanGame.checkForLetter('a');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mAText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mSText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(11)) {
                    mHangmanGame.setPlayed(11);
                    String newQuestionText = mHangmanGame.checkForLetter('s');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mSText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mDText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(12)) {
                    mHangmanGame.setPlayed(12);
                    String newQuestionText = mHangmanGame.checkForLetter('d');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mDText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mFText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(13)) {
                    mHangmanGame.setPlayed(13);
                    String newQuestionText = mHangmanGame.checkForLetter('f');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mFText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mGText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(14)) {
                    mHangmanGame.setPlayed(14);
                    String newQuestionText = mHangmanGame.checkForLetter('g');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mGText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mHText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(15)) {
                    mHangmanGame.setPlayed(15);
                    String newQuestionText = mHangmanGame.checkForLetter('h');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mHText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mJText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(16)) {
                    mHangmanGame.setPlayed(16);
                    String newQuestionText = mHangmanGame.checkForLetter('j');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mJText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mKText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(17)) {
                    mHangmanGame.setPlayed(17);
                    String newQuestionText = mHangmanGame.checkForLetter('k');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mKText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mLText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(18)) {
                    mHangmanGame.setPlayed(18);
                    String newQuestionText = mHangmanGame.checkForLetter('l');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mLText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mZText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(19)) {
                    mHangmanGame.setPlayed(19);
                    String newQuestionText = mHangmanGame.checkForLetter('z');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mZText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mXText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(20)) {
                    mHangmanGame.setPlayed(20);
                    String newQuestionText = mHangmanGame.checkForLetter('x');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mXText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mCText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(21)) {
                    mHangmanGame.setPlayed(21);
                    String newQuestionText = mHangmanGame.checkForLetter('c');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mCText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mVText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(22)) {
                    mHangmanGame.setPlayed(22);
                    String newQuestionText = mHangmanGame.checkForLetter('v');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mVText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mBText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(23)) {
                    mHangmanGame.setPlayed(23);
                    String newQuestionText = mHangmanGame.checkForLetter('b');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mBText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mNText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(24)) {
                    mHangmanGame.setPlayed(24);
                    String newQuestionText = mHangmanGame.checkForLetter('n');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mNText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mMText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(25)) {
                    mHangmanGame.setPlayed(25);
                    String newQuestionText = mHangmanGame.checkForLetter('m');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mMText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mEnieText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(26)) {
                    mHangmanGame.setPlayed(26);
                    String newQuestionText = mHangmanGame.checkForLetter('ñ');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mEnieText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mAAccentText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(27)) {
                    mHangmanGame.setPlayed(27);
                    String newQuestionText = mHangmanGame.checkForLetter('á');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mAAccentText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mEAccentText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(28)) {
                    mHangmanGame.setPlayed(28);
                    String newQuestionText = mHangmanGame.checkForLetter('é');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mEAccentText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mIAccentText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(29)) {
                    mHangmanGame.setPlayed(29);
                    String newQuestionText = mHangmanGame.checkForLetter('í');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mIAccentText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mOAccentText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(30)) {
                    mHangmanGame.setPlayed(30);
                    String newQuestionText = mHangmanGame.checkForLetter('ó');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mOAccentText.setVisibility(View.INVISIBLE);
                }
            }
        });
        mUAccentText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mHangmanGame.isPLayed(31)) {
                    mHangmanGame.setPlayed(31);
                    String newQuestionText = mHangmanGame.checkForLetter('ú');
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        if (mLives <= 0) {
                            gameOver();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mUAccentText.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void hideLetterButtons() {
        mQText.setVisibility(View.INVISIBLE);
        mWText.setVisibility(View.INVISIBLE);
        mEText.setVisibility(View.INVISIBLE);
        mRText.setVisibility(View.INVISIBLE);
        mTText.setVisibility(View.INVISIBLE);
        mYText.setVisibility(View.INVISIBLE);
        mUText.setVisibility(View.INVISIBLE);
        mIText.setVisibility(View.INVISIBLE);
        mOText.setVisibility(View.INVISIBLE);
        mPText.setVisibility(View.INVISIBLE);
        mAText.setVisibility(View.INVISIBLE);
        mSText.setVisibility(View.INVISIBLE);
        mDText.setVisibility(View.INVISIBLE);
        mFText.setVisibility(View.INVISIBLE);
        mGText.setVisibility(View.INVISIBLE);
        mHText.setVisibility(View.INVISIBLE);
        mJText.setVisibility(View.INVISIBLE);
        mKText.setVisibility(View.INVISIBLE);
        mLText.setVisibility(View.INVISIBLE);
        mZText.setVisibility(View.INVISIBLE);
        mXText.setVisibility(View.INVISIBLE);
        mCText.setVisibility(View.INVISIBLE);
        mVText.setVisibility(View.INVISIBLE);
        mBText.setVisibility(View.INVISIBLE);
        mNText.setVisibility(View.INVISIBLE);
        mMText.setVisibility(View.INVISIBLE);
        mAAccentText.setVisibility(View.INVISIBLE);
        mEAccentText.setVisibility(View.INVISIBLE);
        mIAccentText.setVisibility(View.INVISIBLE);
        mOAccentText.setVisibility(View.INVISIBLE);
        mUAccentText.setVisibility(View.INVISIBLE);
        mEnieText.setVisibility(View.INVISIBLE);
    }

    //Game Over
    private void gameOver() {
        hideLetterButtons();
        mGameOverText.setVisibility(View.VISIBLE);
        mPlayAgain.setVisibility(View.VISIBLE);
    }

    private void showLetterButtons() {
            mQText.setVisibility(View.VISIBLE);
            mWText.setVisibility(View.VISIBLE);
            mEText.setVisibility(View.VISIBLE);
            mRText.setVisibility(View.VISIBLE);
            mTText.setVisibility(View.VISIBLE);
            mYText.setVisibility(View.VISIBLE);
            mUText.setVisibility(View.VISIBLE);
            mIText.setVisibility(View.VISIBLE);
            mOText.setVisibility(View.VISIBLE);
            mPText.setVisibility(View.VISIBLE);
            mAText.setVisibility(View.VISIBLE);
            mSText.setVisibility(View.VISIBLE);
            mDText.setVisibility(View.VISIBLE);
            mFText.setVisibility(View.VISIBLE);
            mGText.setVisibility(View.VISIBLE);
            mHText.setVisibility(View.VISIBLE);
            mJText.setVisibility(View.VISIBLE);
            mKText.setVisibility(View.VISIBLE);
            mLText.setVisibility(View.VISIBLE);
            mZText.setVisibility(View.VISIBLE);
            mXText.setVisibility(View.VISIBLE);
            mCText.setVisibility(View.VISIBLE);
            mVText.setVisibility(View.VISIBLE);
            mBText.setVisibility(View.VISIBLE);
            mNText.setVisibility(View.VISIBLE);
            mMText.setVisibility(View.VISIBLE);
            mAAccentText.setVisibility(View.VISIBLE);
            mEAccentText.setVisibility(View.VISIBLE);
            mIAccentText.setVisibility(View.VISIBLE);
            mOAccentText.setVisibility(View.VISIBLE);
            mUAccentText.setVisibility(View.VISIBLE);
            mEnieText.setVisibility(View.VISIBLE);
    }
}
