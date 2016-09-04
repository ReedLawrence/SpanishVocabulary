package com.reed.spanishvocabulary.Model;

/**
 * Created by reed_ on 9/4/2016.
 */
public class HangmanGame {

    private String mHangmanText;
    private VocabBook mVocabBook;
    private Boolean[] mPlayed;

    HangmanGame() {

    }

    public String getHangmanText() {
        return mHangmanText;
    }

    public void setHangmanText(String hangmanText) {
        mHangmanText = hangmanText;
    }

    public void setPlayed(int index) {

    }
}
