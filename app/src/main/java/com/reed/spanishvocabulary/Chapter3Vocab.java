package com.reed.spanishvocabulary;

/**
 * Created by reed_ on 8/23/2016.
 */
public class Chapter3Vocab {
    private VocabWord[] mVocabWords;

    public Chapter3Vocab() {
        mVocabWords = new VocabWord[74];

        mVocabWords[0] = new VocabWord("Estar","to be");
        mVocabWords[1] = new VocabWord("En","in, on, inside of, OR at");
        mVocabWords[2] = new VocabWord("junto a","next to");
        mVocabWords[3] = new VocabWord("Encima de","on top (of)");
        mVocabWords[4] = new VocabWord("al lado de","beside (of)");
        mVocabWords[5] = new VocabWord("detrás de","behind (of)");
        mVocabWords[6] = new VocabWord("delante de","in front (of)");
        mVocabWords[7] = new VocabWord("debajo de","underneath (of)");
        mVocabWords[8] = new VocabWord("sobre de","on top (of)");
        mVocabWords[9] = new VocabWord("contento (a)","content");
        mVocabWords[10] = new VocabWord("de mal humor","unhappy");
        mVocabWords[11] = new VocabWord("sano (a)","healthy OR well");
        mVocabWords[12] = new VocabWord("enfermo (a)","sick");
        mVocabWords[13] = new VocabWord("triste","sad");
        mVocabWords[14] = new VocabWord("alegre","happy");
        mVocabWords[15] = new VocabWord("nervioso (a)","nervous");
        mVocabWords[16] = new VocabWord("tranquilo (a)","calm");
        mVocabWords[17] = new VocabWord("cansado (a)","tired");
        mVocabWords[18] = new VocabWord("sucio (a)","dirty");
        mVocabWords[19] = new VocabWord("limpio (a)","clean");
        mVocabWords[20] = new VocabWord("cerrado (a)","closed");
        mVocabWords[21] = new VocabWord("abierto (a)","open");
        mVocabWords[22] = new VocabWord("presente","present");
        mVocabWords[23] = new VocabWord("ausente","absent");
        mVocabWords[24] = new VocabWord("amable","kind");
        mVocabWords[25] = new VocabWord("bueno (a)","good");
        mVocabWords[26] = new VocabWord("malo (a)","bad");
        mVocabWords[27] = new VocabWord("interesante","interesting");
        mVocabWords[28] = new VocabWord("aburrido (a)","boring");
        mVocabWords[29] = new VocabWord("simpático (a)","nice");
        mVocabWords[30] = new VocabWord("inteligente","intelligent");
        mVocabWords[31] = new VocabWord("generoso (a)","generous");
        mVocabWords[32] = new VocabWord("tacaño (a)","stingy");
        mVocabWords[33] = new VocabWord("feo (a)","ugly");
        mVocabWords[34] = new VocabWord("bonito (a)","pretty");
        mVocabWords[35] = new VocabWord("guapo","handsome");
        mVocabWords[36] = new VocabWord("joven","young");
        mVocabWords[37] = new VocabWord("viejo (a)","old");
        mVocabWords[38] = new VocabWord("delgado (a)","slim");
        mVocabWords[39] = new VocabWord("gordo (a)","fat");
        mVocabWords[40] = new VocabWord("bajo (a)","short");
        mVocabWords[41] = new VocabWord("alto (a)","tall");
        mVocabWords[42] = new VocabWord("muy","very");
        mVocabWords[43] = new VocabWord("bastante","quite, rather, somewhat");
        mVocabWords[44] = new VocabWord("algo","somewhat");
        mVocabWords[45] = new VocabWord("poco","not very");
        mVocabWords[46] = new VocabWord("no / nada","not / at all");
        mVocabWords[47] = new VocabWord("americano (a)","American");
        mVocabWords[48] = new VocabWord("Los Estados Unidos","The United States");
        mVocabWords[49] = new VocabWord("España","Spain");
        mVocabWords[50] = new VocabWord("español / española","Spanish");
        mVocabWords[51] = new VocabWord("puertorriqueño (a)","Puerto Rican");
        mVocabWords[52] = new VocabWord("argentino (a)","Argentinean");
        mVocabWords[53] = new VocabWord("dominicano (a)","Dominican");
        mVocabWords[54] = new VocabWord("mexicano (a)","Mexican");
        mVocabWords[55] = new VocabWord("cubano (a)","Cuban");
        mVocabWords[56] = new VocabWord("francés / francesa","French");
        mVocabWords[57] = new VocabWord("inglés / inglesa","English");
        mVocabWords[58] = new VocabWord("alemán / alemana","German");
        mVocabWords[59] = new VocabWord("el paraguas","umbrella");
        mVocabWords[60] = new VocabWord("el reloj","watch OR clock");
        mVocabWords[60] = new VocabWord("el sombrero","hat");
        mVocabWords[60] = new VocabWord("la bolsa","purse OR bag");
        mVocabWords[60] = new VocabWord("la mochila","backpack");
        mVocabWords[60] = new VocabWord("el portafolio","briefcase");
        mVocabWords[60] = new VocabWord("el collar","necklace");
        mVocabWords[60] = new VocabWord("el algodón","cotton");
        mVocabWords[60] = new VocabWord("el cuero","leather");
        mVocabWords[60] = new VocabWord("el plástico","plastic");
        mVocabWords[60] = new VocabWord("la lana","wool");
        mVocabWords[70] = new VocabWord("el oro","gold");
        mVocabWords[71] = new VocabWord("la plata","silver");
        mVocabWords[72] = new VocabWord("la madera","wood");
        mVocabWords[73] = new VocabWord("el acero","steel");
    }

    public VocabWord getVocabWord(int index) {
        return mVocabWords[index];
    }

    public int getLength() {
        return mVocabWords.length;
    }
}
