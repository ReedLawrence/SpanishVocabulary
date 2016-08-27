package com.reed.spanishvocabulary;

/**
 * Created by reed_ on 8/25/2016.
 */
public class Chapter7Vocab {
    private VocabWord[] mVocabWords;

    public Chapter7Vocab() {
        mVocabWords = new VocabWord[69];

        mVocabWords[0] = new VocabWord("domingo","Sunday");
        mVocabWords[1] = new VocabWord("lunes","Monday");
        mVocabWords[2] = new VocabWord("martes","Tuesday");
        mVocabWords[3] = new VocabWord("miércoles","Wednesday");
        mVocabWords[4] = new VocabWord("jueves","Thursday");
        mVocabWords[5] = new VocabWord("viernes","Friday");
        mVocabWords[6] = new VocabWord("sábado","Saturday");
        mVocabWords[7] = new VocabWord("Hoy es . . .","Today is . . .");
        mVocabWords[8] = new VocabWord("Ayer fue . . .","Yesterday was  . . .");
        mVocabWords[9] = new VocabWord("Mañana será . . .","Tomorrow will be . . .");
        mVocabWords[10] = new VocabWord("enero","January");
        mVocabWords[11] = new VocabWord("febrero","February");
        mVocabWords[12] = new VocabWord("marzo","March");
        mVocabWords[13] = new VocabWord("abril","April");
        mVocabWords[14] = new VocabWord("mayo","May");
        mVocabWords[15] = new VocabWord("junio","June");
        mVocabWords[16] = new VocabWord("julio","July");
        mVocabWords[17] = new VocabWord("agosto","August");
        mVocabWords[18] = new VocabWord("septiembre","September");
        mVocabWords[19] = new VocabWord("octubre","October");
        mVocabWords[20] = new VocabWord("noviembre","November");
        mVocabWords[21] = new VocabWord("diciembre","December");
        mVocabWords[22] = new VocabWord("el invierno","winter");
        mVocabWords[23] = new VocabWord("la primavera","spring");
        mVocabWords[24] = new VocabWord("el verano","summer");
        mVocabWords[25] = new VocabWord("el otoño","autumn or fall");
        mVocabWords[26] = new VocabWord("Hacer","to make or do");
        mVocabWords[27] = new VocabWord("Tener que","to have or to have to");
        mVocabWords[28] = new VocabWord("Ir","to go");
        mVocabWords[29] = new VocabWord("Decir","to say or tell");
        mVocabWords[30] = new VocabWord("puerta de salida","exit");
        mVocabWords[31] = new VocabWord("la sala de espera","waiting area");
        mVocabWords[32] = new VocabWord("el equipaje","baggage / luggage");
        mVocabWords[33] = new VocabWord("la maleta","suitcase");
        mVocabWords[34] = new VocabWord("el pasaje","ticket");
        mVocabWords[35] = new VocabWord("el mostrador","counter");
        mVocabWords[36] = new VocabWord("el agente","agent");
        mVocabWords[37] = new VocabWord("aeropuerto","airport");
        mVocabWords[38] = new VocabWord("ayudar","to help");
        mVocabWords[39] = new VocabWord("esperar","to wait for");
        mVocabWords[40] = new VocabWord("recibir","to receive");
        mVocabWords[41] = new VocabWord("buscar","to look for");
        mVocabWords[42] = new VocabWord("llamar","to call");
        mVocabWords[43] = new VocabWord("los deportes","sports");
        mVocabWords[44] = new VocabWord("el esquí","skiing");
        mVocabWords[45] = new VocabWord("el tenis","tennis");
        mVocabWords[46] = new VocabWord("la natación","swimming");
        mVocabWords[47] = new VocabWord("la gimnasia","gymnastics");
        mVocabWords[48] = new VocabWord("el fútbol","soccer");
        mVocabWords[49] = new VocabWord("el fútbol americano","football");
        mVocabWords[50] = new VocabWord("el baloncesto","basketball");
        mVocabWords[51] = new VocabWord("el voleibol","volleyball");
        mVocabWords[52] = new VocabWord("el béisbol","baseball");
        mVocabWords[53] = new VocabWord("un aficionado","fan");
        mVocabWords[54] = new VocabWord("una aficionada","female fan");
        mVocabWords[55] = new VocabWord("un equipo","team");
        mVocabWords[56] = new VocabWord("un partido","a match or game");
        mVocabWords[57] = new VocabWord("un jugador","player");
        mVocabWords[58] = new VocabWord("una jugadora","female player");
        mVocabWords[59] = new VocabWord("un (a) atleta","athlete");
        mVocabWords[60] = new VocabWord("un (a) deportista","athlete");
        mVocabWords[61] = new VocabWord("deportivo(a)","concerning sports");
        mVocabWords[62] = new VocabWord("gustar","to please");
        mVocabWords[63] = new VocabWord("fascinar","to fascinate");
        mVocabWords[64] = new VocabWord("encantar","to delight");
        mVocabWords[65] = new VocabWord("molestar","to bother");
        mVocabWords[66] = new VocabWord("jugar","to play (a game)");
        mVocabWords[67] = new VocabWord("tocar","to play (an instrument)");
        mVocabWords[68] = new VocabWord("saber","to know (information)");
    }

    public VocabWord getVocabWord(int index) {
        return mVocabWords[index];
    }

    public int getLength() {
        return mVocabWords.length;
    }
}
