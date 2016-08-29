package com.reed.spanishvocabulary;

import java.util.Random;
import java.util.Vector;

/**
 * Created by reed_ on 8/27/2016.
 */
public class VocabList {
    private Vector mList = new Vector();
    private Random mRandom = new Random();

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

    public VocabWord getRandomWord() {
        int randomNum = mRandom.nextInt(mList.size());
        return (VocabWord) mList.get(randomNum);
    }
}
