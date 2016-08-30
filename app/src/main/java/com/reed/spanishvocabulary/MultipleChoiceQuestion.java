package com.reed.spanishvocabulary;

import java.util.Random;

/**
 * Created by Reed on 7/27/2016.
 * Class generates and stores a single multiple choice question
 */
public class MultipleChoiceQuestion {
    private String mQuestionText;
    private String mCorrectAnswer;
    private String[] mIncorrectAnswer = {"", "", ""};
    private Random mRandomGenerator = new Random();
    private VocabBook mVocabBook = new VocabBook();
    private int mChapterNum = 1;

    public MultipleChoiceQuestion(int chapter) {
        setChapterNum(chapter);
        generateNewQuestion();
    }

    public void generateNewQuestion() {
        int randomNumber = mRandomGenerator.nextInt(mVocabBook.getLength(mChapterNum));
        setQuestionText(mVocabBook.getVocabWord(mChapterNum, randomNumber).getSpanishTranslation());
        setCorrectAnswer(mVocabBook.getVocabWord(mChapterNum, randomNumber).getEnglishTranslation());
        setIncorrectAnswer(0, generateIncorrectAnswer());
        setIncorrectAnswer(1, generateIncorrectAnswer());
        setIncorrectAnswer(2, generateIncorrectAnswer());
    }

    private String generateIncorrectAnswer() {
        //Potential for Infinite recursion, need to optimize
        int randomNumber = mRandomGenerator.nextInt(mVocabBook.getLength(mChapterNum));
        String answer = mVocabBook.getVocabWord(mChapterNum, randomNumber).getEnglishTranslation();
        if(answer.equals(getCorrectAnswer())) {
            //answer = mVocabBook.getRandomVocabWord(randomNumber + 1).getEnglishTranslation();
            answer = generateIncorrectAnswer();
        }
        if(answer.equals(getIncorrectAnswer(0))) {
            //answer = mVocabBook.getRandomVocabWord(randomNumber + 1).getEnglishTranslation();
            answer = generateIncorrectAnswer();
        }
        if(answer.equals(getIncorrectAnswer(1))) {
            //answer = mVocabBook.getRandomVocabWord(randomNumber + 1).getEnglishTranslation();
            answer = generateIncorrectAnswer();
        }
        if(answer.equals(getIncorrectAnswer(2))) {
            //answer = mVocabBook.getRandomVocabWord(randomNumber + 1).getEnglishTranslation();
            answer = generateIncorrectAnswer();
        }
        return answer;
    }

    public String getQuestionText() {
        return mQuestionText;
    }

    public void setQuestionText(String questionText) {
        mQuestionText = questionText;
    }

    public String getCorrectAnswer() {
        return mCorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        mCorrectAnswer = correctAnswer;
    }

    public void setIncorrectAnswer(int index, String answer) {
        mIncorrectAnswer[index] = answer;
    }

    public String getIncorrectAnswer(int index) {
        return mIncorrectAnswer[index];
    }

    public void setChapterNum(int chapterNum) {
        mChapterNum = chapterNum;
    }
}
