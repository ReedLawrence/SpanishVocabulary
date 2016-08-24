package com.reed.spanishvocabulary;

/**
 * Created by reed_ on 8/24/2016.
 */
public class Chapter4Vocab {
    private VocabWord[] mVocabWords;

    public Chapter4Vocab() {
        mVocabWords = new VocabWord[63];

        mVocabWords[0] = new VocabWord("El centro","Downtown");
        mVocabWords[1] = new VocabWord("el parque","the park");
        mVocabWords[2] = new VocabWord("la estación de autobús","the bus station");
        mVocabWords[3] = new VocabWord("el teléfono público","the public telephone");
        mVocabWords[4] = new VocabWord("el teatro","the theater");
        mVocabWords[5] = new VocabWord("la tienda","the store");
        mVocabWords[6] = new VocabWord("el museo","the museum");
        mVocabWords[7] = new VocabWord("la heladería","the ice cream shop");
        mVocabWords[8] = new VocabWord("el restaurante","the restaurant");
        mVocabWords[9] = new VocabWord("la iglesia","the church");
        mVocabWords[10] = new VocabWord("el hospital","the hospital");
        mVocabWords[11] = new VocabWord("yo","I - first person singular");
        mVocabWords[12] = new VocabWord("tú","You - second person singular");
        mVocabWords[13] = new VocabWord("él","He or it- third person singular (masc.)");
        mVocabWords[14] = new VocabWord("ella","She or it - third person singular (fem.)");
        mVocabWords[15] = new VocabWord("usted","You - second person singular (formal) but uses the third person verb conjugation");
        mVocabWords[16] = new VocabWord("nosotros","we - first person plural (masc.)");
        mVocabWords[17] = new VocabWord("nosotras","we - first person plural (fem.)");
        mVocabWords[18] = new VocabWord("ustedes","you all - second person plural but uses the third person verb conjugation");
        mVocabWords[19] = new VocabWord("ellos","they - third person plural (masc.)");
        mVocabWords[20] = new VocabWord("ellas","they - third person plural (fem.)");
        mVocabWords[21] = new VocabWord("cero","zero");
        mVocabWords[22] = new VocabWord("uno","one");
        mVocabWords[23] = new VocabWord("dos","two");
        mVocabWords[24] = new VocabWord("tres","three");
        mVocabWords[25] = new VocabWord("cuatro","four");
        mVocabWords[26] = new VocabWord("cinco","five");
        mVocabWords[27] = new VocabWord("seis","six");
        mVocabWords[28] = new VocabWord("siete","seven");
        mVocabWords[29] = new VocabWord("ocho","eight");
        mVocabWords[30] = new VocabWord("nueve","nine");
        mVocabWords[31] = new VocabWord("diez","ten");
        mVocabWords[32] = new VocabWord("once","eleven");
        mVocabWords[33] = new VocabWord("doce","twelve");
        mVocabWords[34] = new VocabWord("trece","thirteen");
        mVocabWords[35] = new VocabWord("catorce","fourteen");
        mVocabWords[36] = new VocabWord("quince","fifteen");
        mVocabWords[37] = new VocabWord("dieciséis","sixteen");
        mVocabWords[38] = new VocabWord("diecisiete","seventeen");
        mVocabWords[39] = new VocabWord("dieciocho","eighteen");
        mVocabWords[40] = new VocabWord("diecinueve","nineteen");
        mVocabWords[41] = new VocabWord("veinte","twenty");
        mVocabWords[42] = new VocabWord("veintiuno","twenty-one");
        mVocabWords[43] = new VocabWord("treinta","thirty");
        mVocabWords[44] = new VocabWord("cuarenta","forty");
        mVocabWords[45] = new VocabWord("cincuenta","fifty");
        mVocabWords[46] = new VocabWord("sesenta","sixty");
        mVocabWords[47] = new VocabWord("setenta","seventy");
        mVocabWords[48] = new VocabWord("ochenta","eighty");
        mVocabWords[49] = new VocabWord("noventa","ninety");
        mVocabWords[50] = new VocabWord("cien","one hundred");
        mVocabWords[51] = new VocabWord("mil","one thousand");
        mVocabWords[52] = new VocabWord("millón","one million");
        mVocabWords[53] = new VocabWord("Tener","to have");
        mVocabWords[54] = new VocabWord("¿Cuántos años tienes?","How old are you?");
        mVocabWords[55] = new VocabWord("¿Cuántos años tiene tu mamá?","How old is your mother?");
        mVocabWords[56] = new VocabWord("Tengo dieciséis años.","I am 16 years old.");
        mVocabWords[57] = new VocabWord("Tiene ____ años.","He is ____ years old.");
        mVocabWords[58] = new VocabWord("Luis y Ana tienen un carro nuevo.","Luis and Ana have a new car.");
        mVocabWords[59] = new VocabWord("Mi mejor amigo y yo tenemos una clase de francés ahora.","My best friend and I have a French class now.");
        mVocabWords[60] = new VocabWord("Nosotros tenemos una clase de química hoy.","We have a chemistry class today.");
        mVocabWords[61] = new VocabWord("Yo tengo una cita con el dentista.","I have an appointment with the dentist.");
        mVocabWords[62] = new VocabWord("Mi abuelo tiene muchos años.","My grandfather is very old.");
    }

    public VocabWord getVocabWord(int index) {
        return mVocabWords[index];
    }

    public int getLength() {
        return mVocabWords.length;
    }
}
