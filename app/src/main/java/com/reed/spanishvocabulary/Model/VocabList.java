package com.reed.spanishvocabulary.Model;

import java.util.Vector;

/**
 * Created by reed_ on 8/27/2016.
 * Class is the container for the different chapters of vocab lists
 * Vector should only contain VocabWords
 */
public class VocabList {
    private Vector mList = new Vector();
    //private Random mRandom = new Random();

    public VocabWord getWord(int index){
        if(index >= mList.size()) {
            return new VocabWord("Size Error", "Size Error");
        } else {
            return (VocabWord) mList.get(index);
        }
    }

    public void addWord(VocabWord word) {
        mList.addElement(word);
    }

    public int size() {
        return mList.size();
    }
    /*
    //Both Flash Card Activity and Multiple Choice use their own
    //Random Generators, unnecessary to have them here
    public VocabWord getRandomWord() {
        int randomNum = mRandom.nextInt(mList.size());
        return (VocabWord) mList.get(randomNum);
    }
    */
}
