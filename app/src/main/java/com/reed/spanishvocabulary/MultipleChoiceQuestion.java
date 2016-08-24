package com.reed.spanishvocabulary;

import java.util.Random;

/**
 * Created by Reed on 7/27/2016.
 */
public class MultipleChoiceQuestion {
    private String mQuestionText;
    private String mCorrectAnswer;
    private String[] mIncorrectAnswer = {"", "", ""};
    private Random mRandomGenerator = new Random();
    private Chapter1Vocab mList;

    public MultipleChoiceQuestion(Chapter1Vocab list) {
        int randomNumber = mRandomGenerator.nextInt(list.getLength());
        setList(list);
        setQuestionText(list.getVocabWord(randomNumber).getSpanishTranslation());
        setCorrectAnswer(list.getVocabWord(randomNumber).getEnglishTranslation());
        setIncorrectAnswer(0, generateIncorrectAnswer());
        setIncorrectAnswer(1, generateIncorrectAnswer());
        setIncorrectAnswer(2, generateIncorrectAnswer());
    }

    private String generateIncorrectAnswer() {
        //Potential for Infinite recursion, need to optimize
        int randomNumber = mRandomGenerator.nextInt(mList.getLength());
        String answer = mList.getVocabWord(randomNumber).getEnglishTranslation();
        if(answer == getCorrectAnswer()) {
            //answer = mList.getVocabWord(randomNumber + 1).getEnglishTranslation();
            answer = generateIncorrectAnswer();
        }
        if(answer == getIncorrectAnswer(0)) {
            //answer = mList.getVocabWord(randomNumber + 1).getEnglishTranslation();
            answer = generateIncorrectAnswer();
        }
        if(answer == getIncorrectAnswer(1)) {
            //answer = mList.getVocabWord(randomNumber + 1).getEnglishTranslation();
            answer = generateIncorrectAnswer();
        }
        if(answer == getIncorrectAnswer(2)) {
            //answer = mList.getVocabWord(randomNumber + 1).getEnglishTranslation();
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

    public Chapter1Vocab getList() {
        return mList;
    }

    public void setList(Chapter1Vocab list) {
        mList = list;
    }
}
