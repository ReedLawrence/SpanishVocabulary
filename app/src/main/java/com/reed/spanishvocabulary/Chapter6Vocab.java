package com.reed.spanishvocabulary;

/**
 * Created by reed_ on 8/24/2016.
 */
public class Chapter6Vocab {
    private VocabWord[] mVocabWords;

    public Chapter6Vocab() {
        mVocabWords = new VocabWord[41];

        mVocabWords[0] = new VocabWord("De compras","shopping");
        mVocabWords[1] = new VocabWord("el (la) dependiente","store clerk");
        mVocabWords[2] = new VocabWord("el (la) cliente","client or shopper");
        mVocabWords[3] = new VocabWord("el mostrador","counter or display case");
        mVocabWords[4] = new VocabWord("¿Cuánto cuesta?","How much does it cost?");
        mVocabWords[5] = new VocabWord("el precio","price");
        mVocabWords[6] = new VocabWord("caro","expensive");
        mVocabWords[7] = new VocabWord("barato","inexpensive or cheap");
        mVocabWords[8] = new VocabWord("el centro comercial","commercial center");
        mVocabWords[9] = new VocabWord("Los modos de transporte","modes of transportation");
        mVocabWords[10] = new VocabWord("el carro","car");
        mVocabWords[11] = new VocabWord("el auto","car");
        mVocabWords[12] = new VocabWord("el automóvil","automobile");
        mVocabWords[13] = new VocabWord("el coche","car");
        mVocabWords[14] = new VocabWord("el motocicleta","motorcycle");
        mVocabWords[15] = new VocabWord("el autobús","bus");
        mVocabWords[16] = new VocabWord("el metro","subway or rail train");
        mVocabWords[17] = new VocabWord("el taxi","taxi");
        mVocabWords[18] = new VocabWord("a pie","on foot");
        mVocabWords[19] = new VocabWord("Ir","to go");
        mVocabWords[20] = new VocabWord("Dar","to give");
        mVocabWords[21] = new VocabWord("Estar","to be");
        mVocabWords[22] = new VocabWord("actividad","activity");
        mVocabWords[23] = new VocabWord("capacidad","capacity");
        mVocabWords[24] = new VocabWord("eternidad","eternity");
        mVocabWords[25] = new VocabWord("facultad","faculty");
        mVocabWords[26] = new VocabWord("humanidad","humanity");
        mVocabWords[27] = new VocabWord("imposibilidad","impossibility");
        mVocabWords[28] = new VocabWord("libertad","liberty");
        mVocabWords[29] = new VocabWord("necesidad","necessity");
        mVocabWords[30] = new VocabWord("personalidad","personality");
        mVocabWords[31] = new VocabWord("realidad","reality");
        mVocabWords[32] = new VocabWord("espiritualidad","spirituality");
        mVocabWords[33] = new VocabWord("variedad","variety");
        mVocabWords[34] = new VocabWord("vivir","to live");
        mVocabWords[35] = new VocabWord("asistir","to attend or assist");
        mVocabWords[36] = new VocabWord("abrir","to open");
        mVocabWords[37] = new VocabWord("escribir","to write");
        mVocabWords[38] = new VocabWord("Permitir","to permit or allow");
        mVocabWords[39] = new VocabWord("ocurrir","to occur or happen");
        mVocabWords[40] = new VocabWord("subir","to go up or board");
    }

    public VocabWord getVocabWord(int index) {
        return mVocabWords[index];
    }

    public int getLength() {
        return mVocabWords.length;
    }
}
