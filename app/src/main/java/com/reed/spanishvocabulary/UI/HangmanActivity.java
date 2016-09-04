package com.reed.spanishvocabulary.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        Button mHome = (Button) findViewById(R.id.homeButton);
        Button mPlayAgain = (Button) findViewById(R.id.playAgainButton);

        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //resetGame();
            }
        });

        //Generate Hangman Text
        //Set listeners

    }
//Reset Game
}
