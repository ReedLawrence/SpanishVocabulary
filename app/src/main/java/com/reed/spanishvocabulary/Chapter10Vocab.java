package com.reed.spanishvocabulary;

/**
 * Created by reed_ on 8/26/2016.
 */
public class Chapter10Vocab {
    private VocabWord[] mVocabWords;

    public Chapter10Vocab() {
        mVocabWords = new VocabWord[49];

        mVocabWords[0] = new VocabWord("los quehaceres","chores");
        mVocabWords[1] = new VocabWord("cocinar","to cook");
        mVocabWords[2] = new VocabWord("poner la mesa","set the table");
        mVocabWords[3] = new VocabWord("lavar los platos","wash the dishes");
        mVocabWords[4] = new VocabWord("lavar la ropa","wash the clothes");
        mVocabWords[5] = new VocabWord("planchar la ropa","iron the clothes");
        mVocabWords[6] = new VocabWord("aspirar","to vacuum");
        mVocabWords[7] = new VocabWord("marcar el número de teléfono","dial the number");
        mVocabWords[8] = new VocabWord("contestar el teléfono","answer the phone");
        mVocabWords[9] = new VocabWord("La correspondencia","mail");
        mVocabWords[10] = new VocabWord("La fecha","the date");
        mVocabWords[11] = new VocabWord("n postal; una tarjeta postal","a postcard");
        mVocabWords[12] = new VocabWord("El buzón","the mailbox");
        mVocabWords[13] = new VocabWord("La estampilla","the stamp");
        mVocabWords[14] = new VocabWord("El cartero","the mailman");
        mVocabWords[15] = new VocabWord("Una carta","a letter");
        mVocabWords[16] = new VocabWord("La dirección","the address");
        mVocabWords[17] = new VocabWord("saludos","greetings");
        mVocabWords[18] = new VocabWord("despedidas","closings");
        mVocabWords[19] = new VocabWord("estimado","esteemed");
        mVocabWords[20] = new VocabWord("querido","dear");
        mVocabWords[21] = new VocabWord("mi querida","my dear");
        mVocabWords[22] = new VocabWord("atentamente","attentively");
        mVocabWords[23] = new VocabWord("sinceramente","sincerely");
        mVocabWords[24] = new VocabWord("con mucho cariño","with much love");
        mVocabWords[25] = new VocabWord("aprender","to learn");
        mVocabWords[26] = new VocabWord("vivir","to live");
        mVocabWords[27] = new VocabWord("romper","to break or tear");
        mVocabWords[28] = new VocabWord("perder","to lose");
        mVocabWords[29] = new VocabWord("nacer","to be born");
        mVocabWords[30] = new VocabWord("descubrir","to discover");
        mVocabWords[31] = new VocabWord("abrir","to open");
        mVocabWords[32] = new VocabWord("escribir","to write");
        mVocabWords[33] = new VocabWord("venir","to come");
        mVocabWords[34] = new VocabWord("asistir","to attend or assist");
        mVocabWords[35] = new VocabWord("correr","to run");
        mVocabWords[36] = new VocabWord("comer","to eat");
        mVocabWords[37] = new VocabWord("comprar","to buy");
        mVocabWords[38] = new VocabWord("querer","to want");
        mVocabWords[39] = new VocabWord("preferir","to prefer");
        mVocabWords[40] = new VocabWord("enviar","to send");
        mVocabWords[41] = new VocabWord("ir","to go");
        mVocabWords[42] = new VocabWord("ser","to be");
        mVocabWords[43] = new VocabWord("dar","to give");
        mVocabWords[44] = new VocabWord("ver","to see");
        mVocabWords[45] = new VocabWord("leer","to read");
        mVocabWords[46] = new VocabWord("oír","to hear");
        mVocabWords[47] = new VocabWord("caer","to fall");
        mVocabWords[48] = new VocabWord("creer","to believe");
    }

    public VocabWord getVocabWord(int index) {
        return mVocabWords[index];
    }

    public int getLength() {
        return mVocabWords.length;
    }
}
