package com.reed.spanishvocabulary.Model;

/**
 * Created by Reed Lawrence on 9/4/2016.
 * Class provides uses the VocabBook class to generate questions and answers and
 * checks user answers against stored answers
 */
public class HangmanGame {

    private String mHangmanAnswerText;
    private String mHangmanQuestionText;
    private VocabBook mVocabBook;
    private int mChapter;

    public HangmanGame(int chapter) {
        mChapter = chapter;
        mVocabBook = new VocabBook();
        generateHangmanAnswerText(chapter);
        generateHangmanQuestionText();
    }

    private void generateHangmanQuestionText() {
        char[] questionText = mHangmanAnswerText.toCharArray();
        for(int i = 0; i<questionText.length; i++) {
            questionText[i] = replaceLetterWithBlank(questionText[i]);
        }
        mHangmanQuestionText = new String(questionText);
    }

    private char replaceLetterWithBlank(char c) {
        if(c == 'a' || c == 'A' || c == 'b' || c == 'B' || c == 'c' || c == 'C' ||
                c == 'd' || c == 'D' || c == 'e' || c == 'E' || c == 'f' || c == 'F' ||
                c == 'g' || c == 'G' || c == 'h' || c == 'H' || c == 'i' || c == 'I' ||
                c == 'j' || c == 'J' || c == 'k' || c == 'K' || c == 'l' || c == 'L' ||
                c == 'm' || c == 'M' || c == 'n' || c == 'N' || c == 'o' || c == 'O' ||
                c == 'p' || c == 'P' || c == 'q' || c == 'Q' || c == 'r' || c == 'R' ||
                c == 's' || c == 'S' || c == 't' || c == 'T' || c == 'u' || c == 'U' ||
                c == 'v' || c == 'V' || c == 'w' || c == 'W' || c == 'x' || c == 'X' ||
                c == 'y' || c == 'Y' || c == 'z' || c == 'Z' || c == 'á' || c == 'Á' ||
                c == 'é' || c == 'É' || c == 'í' || c == 'Í' || c == 'ó' || c == 'Ó' ||
                c == 'ú' || c == 'Ú' || c == 'ñ' || c == 'Ñ') {
            return '_';
        } else {
            return c;
        }
    }

    public String checkForLetter(char c) {
        //character passed in must be lower case
        String answerTextLC = mHangmanAnswerText.toLowerCase();
        char[] questionText = mHangmanQuestionText.toCharArray();
        for(int i = 0; i<questionText.length; i++) {
            if(answerTextLC.charAt(i) == c) {
                questionText[i] = mHangmanAnswerText.charAt(i);
            }
        }
        mHangmanQuestionText = new String(questionText);
        return mHangmanQuestionText;
    }

    public void resetGame() {
        generateHangmanAnswerText(mChapter);
        generateHangmanQuestionText();
    }

    public void generateHangmanAnswerText(int chapter) {
        mHangmanAnswerText = mVocabBook.getRandomVocabWord(chapter).getSpanishTranslation();
        //Eliminate all vocabulary that contains an "_" in the hangman game
        /*
        Unnecessary with second test
        if (mHangmanAnswerText.contains("_")) {
            generateHangmanAnswerText(chapter);
        }
        */
        //Eliminate Phrases longer than 2 words
        String[] wordTest = mHangmanAnswerText.split(" ");
        if (wordTest.length > 2) {
            generateHangmanAnswerText(chapter);
        }
    }

    public String getHangmanAnswerText() {
        return mHangmanAnswerText;
    }

    public String getHangmanQuestionText() {
        return mHangmanQuestionText;
    }

}
