package com.reed.spanishvocabulary;

/**
 * Created by Reed on 7/27/2016.
 * Class is the object that forms the array for the VocabList
 */
public class VocabWord {

    private String mSpanishTranslation;
    private String mEnglishTranslation;

    public VocabWord(String spanishTranslation, String englishTranslation){
        setEnglishTranslation(englishTranslation);
        setSpanishTranslation(spanishTranslation);
    }

    public String getSpanishTranslation() {
        return mSpanishTranslation;
    }

    public void setSpanishTranslation(String spanishTranslation) {
        mSpanishTranslation = spanishTranslation;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        mEnglishTranslation = englishTranslation;
    }
}
