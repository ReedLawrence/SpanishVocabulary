package com.reed.spanishvocabulary.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    private ImageView mHangmanImage1;
    private ImageView mHangmanImage2;
    private ImageView mHangmanImage3;
    private ImageView mHangmanImage4;
    private ImageView mHangmanImage5;
    private ImageView mHangmanImage6;
    private TextView mCategoryText;

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
        mCategoryText = (TextView) findViewById(R.id.categoryText);
        mGameOverText = (TextView) findViewById(R.id.gameOverText);
        mHangmanImage1 = (ImageView) findViewById(R.id.hangmanImage1);
        mHangmanImage2 = (ImageView) findViewById(R.id.hangmanImage2);
        mHangmanImage3 = (ImageView) findViewById(R.id.hangmanImage3);
        mHangmanImage4 = (ImageView) findViewById(R.id.hangmanImage4);
        mHangmanImage5 = (ImageView) findViewById(R.id.hangmanImage5);
        mHangmanImage6 = (ImageView) findViewById(R.id.hangmanImage6);

        mPlayAgain.setVisibility(View.INVISIBLE);
        mGameOverText.setVisibility(View.INVISIBLE);
        hideHangingImages();

        Intent intent = getIntent();
        mHangmanGame = new HangmanGame(intent.getIntExtra("chapterNumber", 1));
        mCategoryText.setText(intent.getStringExtra("category"));


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
                mHangmanTextView.setText(addSpaces(mHangmanGame.getHangmanQuestionText()));
                showLetterButtons();
                hideHangingImages();
                mGameOverText.setVisibility(View.INVISIBLE);
                mPlayAgain.setVisibility(View.INVISIBLE);
                mLives = 6;
            }
        });


        //Generate Hangman Text
        mHangmanTextView.setText(addSpaces(mHangmanGame.getHangmanQuestionText()));

        //Set listeners
        mQText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String newQuestionText = mHangmanGame.checkForLetter('q');
            if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                gameOverWin();
            } else {
                newQuestionText = addSpaces(newQuestionText);
                if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                    mLives--;
                    revealNextHangingImage();
                    if (mLives <= 0) {
                        gameOverLoss();
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
            String newQuestionText = mHangmanGame.checkForLetter('q');
            if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                gameOverWin();
            } else {
                newQuestionText = addSpaces(newQuestionText);
                if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                    mLives--;
                    revealNextHangingImage();
                    if (mLives <= 0) {
                        gameOverLoss();
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
            String newQuestionText = mHangmanGame.checkForLetter('e');
            if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                gameOverWin();
            } else {
                newQuestionText = addSpaces(newQuestionText);
                if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                    mLives--;
                    revealNextHangingImage();
                    if (mLives <= 0) {
                        gameOverLoss();
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
            String newQuestionText = mHangmanGame.checkForLetter('r');
            if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                gameOverWin();
            } else {
                newQuestionText = addSpaces(newQuestionText);
                if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                    mLives--;
                    revealNextHangingImage();
                    if (mLives <= 0) {
                        gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('t');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('y');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('u');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('i');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('o');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('p');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('a');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('s');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('d');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('f');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('g');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('h');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('j');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('k');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('l');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('z');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('x');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('c');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('v');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('b');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('n');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('m');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('ñ');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('á');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('é');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('í');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('ó');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
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
                String newQuestionText = mHangmanGame.checkForLetter('ú');
                if (newQuestionText.equalsIgnoreCase(mHangmanGame.getHangmanAnswerText())) {
                    gameOverWin();
                } else {
                    newQuestionText = addSpaces(newQuestionText);
                    if (newQuestionText.equalsIgnoreCase(mHangmanTextView.getText().toString())) {
                        mLives--;
                        revealNextHangingImage();
                        if (mLives <= 0) {
                            gameOverLoss();
                        }
                    } else {
                        mHangmanTextView.setText(newQuestionText);
                    }
                    mUAccentText.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void revealNextHangingImage() {
        if(mLives == 5) {
            mHangmanImage6.setVisibility(View.VISIBLE);
        }
        if(mLives == 4) {
            mHangmanImage5.setVisibility(View.VISIBLE);
        }
        if(mLives == 3) {
            mHangmanImage4.setVisibility(View.VISIBLE);
        }
        if(mLives == 2) {
            mHangmanImage3.setVisibility(View.VISIBLE);
        }
        if(mLives == 1) {
            mHangmanImage2.setVisibility(View.VISIBLE);
        }
        if(mLives == 0) {
            mHangmanImage1.setVisibility(View.VISIBLE);
        }
    }

    private void hideHangingImages() {
        mHangmanImage1.setVisibility(View.INVISIBLE);
        mHangmanImage2.setVisibility(View.INVISIBLE);
        mHangmanImage3.setVisibility(View.INVISIBLE);
        mHangmanImage4.setVisibility(View.INVISIBLE);
        mHangmanImage5.setVisibility(View.INVISIBLE);
        mHangmanImage6.setVisibility(View.INVISIBLE);
    }

    private String addSpaces(String question) {
        char[] spacedQuestion = question.toCharArray();
        question = "";
        for (char aSpacedQuestion : spacedQuestion) {
            question = question + aSpacedQuestion + " ";
        }
        return question;
    }

    private void gameOverWin() {
        hideLetterButtons();
        mHangmanTextView.setText(mHangmanGame.getHangmanAnswerText());
        mGameOverText.setText(R.string.you_win);
        mGameOverText.setVisibility(View.VISIBLE);
        mPlayAgain.setVisibility(View.VISIBLE);
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
    private void gameOverLoss() {
        hideLetterButtons();
        mHangmanTextView.setText(mHangmanGame.getHangmanAnswerText());
        mGameOverText.setText(R.string.game_over);
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
