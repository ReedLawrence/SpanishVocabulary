package com.reed.spanishvocabulary;

/**
 * Created by reed_ on 8/23/2016.
 */
public class Chapter2Vocab {
    private VocabWord[] mVocabWords;

    public Chapter2Vocab() {
        mVocabWords = new VocabWord[51];

        mVocabWords[0] = new VocabWord("la casa","the house");
        mVocabWords[1] = new VocabWord("el baño","the bathroom");
        mVocabWords[2] = new VocabWord("la sala","the den");
        mVocabWords[3] = new VocabWord("la cocina","the kitchen");
        mVocabWords[4] = new VocabWord("el comedor","the dining room");
        mVocabWords[5] = new VocabWord("el dormitorio OR la recamara","the bedroom");
        mVocabWords[6] = new VocabWord("el pasillo","the hallway");
        mVocabWords[7] = new VocabWord("el garaje","the garage");
        mVocabWords[8] = new VocabWord("la primera planta","the first floor");
        mVocabWords[9] = new VocabWord("la segunda planta","the second floor");
        mVocabWords[10] = new VocabWord("el piso abajo","the bottom floor");
        mVocabWords[11] = new VocabWord("el piso arriba","the top floor");
        mVocabWords[12] = new VocabWord("la ventana","the window");
        mVocabWords[13] = new VocabWord("la puerta","the door");
        mVocabWords[14] = new VocabWord("el vecino","the neighbor");
        mVocabWords[15] = new VocabWord("el techo","the ceiling OR roof");
        mVocabWords[16] = new VocabWord("la pared","the wall");
        mVocabWords[17] = new VocabWord("la alfombra","the carpet OR rug");
        mVocabWords[18] = new VocabWord("las cortinas","the curtains");
        mVocabWords[19] = new VocabWord("la mesa","the table");
        mVocabWords[20] = new VocabWord("la silla","the chair");
        mVocabWords[21] = new VocabWord("el sofá","the sofa");
        mVocabWords[22] = new VocabWord("el televisor","the television");
        mVocabWords[23] = new VocabWord("el radio","the radio");
        mVocabWords[24] = new VocabWord("la cama","the bed");
        mVocabWords[25] = new VocabWord("la estufa","the stove");
        mVocabWords[26] = new VocabWord("el horno","the oven");
        mVocabWords[27] = new VocabWord("el refrigerador","the refrigerator");
        mVocabWords[28] = new VocabWord("el suelo OR el piso","the floor");
        mVocabWords[29] = new VocabWord("el fregadero","the sink");
        mVocabWords[30] = new VocabWord("esta mañana","this morning");
        mVocabWords[31] = new VocabWord("el aula","classroom");
        mVocabWords[32] = new VocabWord("las matemáticas","mathematics");
        mVocabWords[33] = new VocabWord("la literatura","literature");
        mVocabWords[34] = new VocabWord("el colegio","high school");
        mVocabWords[35] = new VocabWord("el laboratorio","the laboratory");
        mVocabWords[36] = new VocabWord("ahora","now OR today");
        mVocabWords[37] = new VocabWord("la biología","biology");
        mVocabWords[38] = new VocabWord("los reptiles","the reptiles");
        mVocabWords[39] = new VocabWord("detesto","detest");
        mVocabWords[40] = new VocabWord("el gimnasio","the gymnasium");
        mVocabWords[41] = new VocabWord("la cafetería","the cafeteria");
        mVocabWords[42] = new VocabWord("la oficina del director","the principal's office");
        mVocabWords[43] = new VocabWord("la biblioteca","the library");
        mVocabWords[44] = new VocabWord("la educación física","physical education");
        mVocabWords[45] = new VocabWord("la historia","history");
        mVocabWords[46] = new VocabWord("la geografía","geography");
        mVocabWords[47] = new VocabWord("la geometría","geometry");
        mVocabWords[48] = new VocabWord("la ciencia","science");
        mVocabWords[49] = new VocabWord("la química","chemistry");
        mVocabWords[50] = new VocabWord("el español / el inglés","Spanish / English");
    }

    public VocabWord getVocabWord(int index) {
        return mVocabWords[index];
    }

    public int getLength() {
        return mVocabWords.length;
    }
}
