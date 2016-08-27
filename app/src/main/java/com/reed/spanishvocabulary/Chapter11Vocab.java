package com.reed.spanishvocabulary;

/**
 * Created by reed_ on 8/26/2016.
 */
public class Chapter11Vocab {
    private VocabWord[] mVocabWords;

    public Chapter11Vocab() {
        mVocabWords = new VocabWord[37];

        mVocabWords[0] = new VocabWord("pedir","to ask for or request");
        mVocabWords[1] = new VocabWord("sentir","to feel");
        mVocabWords[2] = new VocabWord("dormir","to sleep");
        mVocabWords[3] = new VocabWord("servir","to serve");
        mVocabWords[4] = new VocabWord("repetir","to repeat");
        mVocabWords[5] = new VocabWord("preferir","to prefer");
        mVocabWords[6] = new VocabWord("morir","to die");
        mVocabWords[7] = new VocabWord("enfermero(a)","nurse");
        mVocabWords[8] = new VocabWord("obrero(a)","worker");
        mVocabWords[9] = new VocabWord("empresario(a)","businessman");
        mVocabWords[10] = new VocabWord("aeromozo(a)","flight attendant");
        mVocabWords[11] = new VocabWord("mecánico","mechanic");
        mVocabWords[12] = new VocabWord("secretario(a)","secretary");
        mVocabWords[13] = new VocabWord("maestro(a)","teacher");
        mVocabWords[14] = new VocabWord("médico","doctor");
        mVocabWords[15] = new VocabWord("abogado(a)","lawyer");
        mVocabWords[16] = new VocabWord("ingeniero(a)","engineer");
        mVocabWords[17] = new VocabWord("ir a","go to");
        mVocabWords[18] = new VocabWord("salir a","goes out to");
        mVocabWords[19] = new VocabWord("venir a","comes to");
        mVocabWords[20] = new VocabWord("empezar a","begin to");
        mVocabWords[21] = new VocabWord("acabar de","just (finished)");
        mVocabWords[22] = new VocabWord("dejar de","stops");
        mVocabWords[23] = new VocabWord("tratar de","try to");
        mVocabWords[24] = new VocabWord("olvidarse de","forgets to");
        mVocabWords[25] = new VocabWord("cuál","which / what - singular - comes before a verb");
        mVocabWords[26] = new VocabWord("cuáles","which / what - plural - comes before a verb");
        mVocabWords[27] = new VocabWord("que","which / what - singular & plural - comes before a noun");
        mVocabWords[28] = new VocabWord("hacer","to make or do");
        mVocabWords[29] = new VocabWord("estar","to be");
        mVocabWords[30] = new VocabWord("querer","to want");
        mVocabWords[31] = new VocabWord("venir","to come");
        mVocabWords[32] = new VocabWord("andar","to walk or pass");
        mVocabWords[33] = new VocabWord("poder","to be able");
        mVocabWords[34] = new VocabWord("poner","to put or set");
        mVocabWords[35] = new VocabWord("saber","to know or to find out");
        mVocabWords[36] = new VocabWord("tener","to have");
    }

    public VocabWord getVocabWord(int index) {
        return mVocabWords[index];
    }

    public int getLength() {
        return mVocabWords.length;
    }
}
