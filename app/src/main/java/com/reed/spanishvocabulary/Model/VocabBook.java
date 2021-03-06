package com.reed.spanishvocabulary.Model;

/**
 * Created by reed_ on 8/27/2016.
 * Class acts as the index for the different Vocab Chapters
 */
public class VocabBook {

    private VocabList mChapter1 = new VocabList();
    private VocabList mChapter2 = new VocabList();
    private VocabList mChapter3 = new VocabList();
    private VocabList mChapter4 = new VocabList();
    private VocabList mChapter5 = new VocabList();
    private VocabList mChapter6 = new VocabList();
    private VocabList mChapter7 = new VocabList();
    private VocabList mChapter8 = new VocabList();
    private VocabList mChapter9 = new VocabList();
    private VocabList mChapter10 = new VocabList();
    private VocabList mChapter11 = new VocabList();

    //Both Flash Card Activity and Multiple Choice use their own
    //Random Generators, unnecessary to have them here
    public VocabWord getRandomVocabWord(int chapter){
        if(chapter == 1){
            return mChapter1.getRandomWord();
        }
        if(chapter == 2){
            return mChapter2.getRandomWord();
        }
        if(chapter == 3){
            return mChapter3.getRandomWord();
        }
        if(chapter == 4){
            return mChapter4.getRandomWord();
        }
        if(chapter == 5){
            return mChapter5.getRandomWord();
        }
        if(chapter == 6){
            return mChapter6.getRandomWord();
        }
        if(chapter == 7){
            return mChapter7.getRandomWord();
        }
        if(chapter == 8){
            return mChapter8.getRandomWord();
        }
        if(chapter == 9){
            return mChapter9.getRandomWord();
        }
        if(chapter == 10){
            return mChapter10.getRandomWord();
        }
        if(chapter == 11){
            return mChapter11.getRandomWord();
        }
        return new VocabWord("Invalid Chapter","Invalid Chapter");
    }

    public VocabWord getVocabWord(int chapter, int index) {
        if(chapter == 1){
            return mChapter1.getWord(index);
        }
        if(chapter == 2){
            return mChapter2.getWord(index);
        }
        if(chapter == 3){
            return mChapter3.getWord(index);
        }
        if(chapter == 4){
            return mChapter4.getWord(index);
        }
        if(chapter == 5){
            return mChapter5.getWord(index);
        }
        if(chapter == 6){
            return mChapter6.getWord(index);
        }
        if(chapter == 7){
            return mChapter7.getWord(index);
        }
        if(chapter == 8){
            return mChapter8.getWord(index);
        }
        if(chapter == 9){
            return mChapter9.getWord(index);
        }
        if(chapter == 10){
            return mChapter10.getWord(index);
        }
        if(chapter == 11){
            return mChapter11.getWord(index);
        }
        return new VocabWord("Invalid Chapter","Invalid Chapter");
    }

    public int getLength(int chapter) {
        if(chapter == 1){
            return mChapter1.size();
        }
        if(chapter == 2){
            return mChapter2.size();
        }
        if(chapter == 3){
            return mChapter3.size();
        }
        if(chapter == 4){
            return mChapter4.size();
        }
        if(chapter == 5){
            return mChapter5.size();
        }
        if(chapter == 6){
            return mChapter6.size();
        }
        if(chapter == 7){
            return mChapter7.size();
        }
        if(chapter == 8){
            return mChapter8.size();
        }
        if(chapter == 9){
            return mChapter9.size();
        }
        if(chapter == 10){
            return mChapter10.size();
        }
        if(chapter == 11){
            return mChapter11.size();
        }
        return 0;
    }

    public VocabBook() {
        buildChapter1();
        buildChapter2();
        buildChapter3();
        buildChapter4();
        buildChapter5();
        buildChapter6();
        buildChapter7();
        buildChapter8();
        buildChapter9();
        buildChapter10();
        buildChapter11();
    }

    private void buildChapter11() {
        mChapter11.addWord(new VocabWord("pedir","to ask for or request"));
        mChapter11.addWord(new VocabWord("sentir","to feel"));
        mChapter11.addWord(new VocabWord("dormir","to sleep"));
        mChapter11.addWord(new VocabWord("servir","to serve"));
        mChapter11.addWord(new VocabWord("repetir","to repeat"));
        mChapter11.addWord(new VocabWord("preferir","to prefer"));
        mChapter11.addWord(new VocabWord("morir","to die"));
        mChapter11.addWord(new VocabWord("enfermero(a)","nurse"));
        mChapter11.addWord(new VocabWord("obrero(a)","worker"));
        mChapter11.addWord(new VocabWord("empresario(a)","businessman"));
        mChapter11.addWord(new VocabWord("aeromozo(a)","flight attendant"));
        mChapter11.addWord(new VocabWord("mecánico","mechanic"));
        mChapter11.addWord(new VocabWord("secretario(a)","secretary"));
        mChapter11.addWord(new VocabWord("maestro(a)","teacher"));
        mChapter11.addWord(new VocabWord("médico","doctor"));
        mChapter11.addWord(new VocabWord("abogado(a)","lawyer"));
        mChapter11.addWord(new VocabWord("ingeniero(a)","engineer"));
        mChapter11.addWord(new VocabWord("ir a","go to"));
        mChapter11.addWord(new VocabWord("salir a","goes out to"));
        mChapter11.addWord(new VocabWord("venir a","comes to"));
        mChapter11.addWord(new VocabWord("empezar a","begin to"));
        mChapter11.addWord(new VocabWord("acabar de","just (finished)"));
        mChapter11.addWord(new VocabWord("dejar de","stops"));
        mChapter11.addWord(new VocabWord("tratar de","try to"));
        mChapter11.addWord(new VocabWord("olvidarse de","forgets to"));
        mChapter11.addWord(new VocabWord("cuál","which / what - singular - comes before a verb"));
        mChapter11.addWord(new VocabWord("cuáles","which / what - plural - comes before a verb"));
        mChapter11.addWord(new VocabWord("que","which / what - singular & plural - comes before a noun"));
        mChapter11.addWord(new VocabWord("hacer","to make or do"));
        mChapter11.addWord(new VocabWord("estar","to be"));
        mChapter11.addWord(new VocabWord("querer","to want"));
        mChapter11.addWord(new VocabWord("venir","to come"));
        mChapter11.addWord(new VocabWord("andar","to walk or pass"));
        mChapter11.addWord(new VocabWord("poder","to be able"));
        mChapter11.addWord(new VocabWord("poner","to put or set"));
        mChapter11.addWord(new VocabWord("saber","to know or to find out"));
        mChapter11.addWord(new VocabWord("tener","to have"));
    }

    private void buildChapter10() {
        mChapter10.addWord(new VocabWord("los quehaceres","chores"));
        mChapter10.addWord(new VocabWord("cocinar","to cook"));
        mChapter10.addWord(new VocabWord("poner la mesa","set the table"));
        mChapter10.addWord(new VocabWord("lavar los platos","wash the dishes"));
        mChapter10.addWord(new VocabWord("lavar la ropa","wash the clothes"));
        mChapter10.addWord(new VocabWord("planchar la ropa","iron the clothes"));
        mChapter10.addWord(new VocabWord("aspirar","to vacuum"));
        mChapter10.addWord(new VocabWord("marcar el número de teléfono","dial the number"));
        mChapter10.addWord(new VocabWord("contestar el teléfono","answer the phone"));
        mChapter10.addWord(new VocabWord("La correspondencia","mail"));
        mChapter10.addWord(new VocabWord("La fecha","the date"));
        mChapter10.addWord(new VocabWord("n postal; una tarjeta postal","a postcard"));
        mChapter10.addWord(new VocabWord("El buzón","the mailbox"));
        mChapter10.addWord(new VocabWord("La estampilla","the stamp"));
        mChapter10.addWord(new VocabWord("El cartero","the mailman"));
        mChapter10.addWord(new VocabWord("Una carta","a letter"));
        mChapter10.addWord(new VocabWord("La dirección","the address"));
        mChapter10.addWord(new VocabWord("saludos","greetings"));
        mChapter10.addWord(new VocabWord("despedidas","closings"));
        mChapter10.addWord(new VocabWord("estimado","esteemed"));
        mChapter10.addWord(new VocabWord("querido","dear"));
        mChapter10.addWord(new VocabWord("mi querida","my dear"));
        mChapter10.addWord(new VocabWord("atentamente","attentively"));
        mChapter10.addWord(new VocabWord("sinceramente","sincerely"));
        mChapter10.addWord(new VocabWord("con mucho cariño","with much love"));
        mChapter10.addWord(new VocabWord("aprender","to learn"));
        mChapter10.addWord(new VocabWord("vivir","to live"));
        mChapter10.addWord(new VocabWord("romper","to break or tear"));
        mChapter10.addWord(new VocabWord("perder","to lose"));
        mChapter10.addWord(new VocabWord("nacer","to be born"));
        mChapter10.addWord(new VocabWord("descubrir","to discover"));
        mChapter10.addWord(new VocabWord("abrir","to open"));
        mChapter10.addWord(new VocabWord("escribir","to write"));
        mChapter10.addWord(new VocabWord("venir","to come"));
        mChapter10.addWord(new VocabWord("asistir","to attend or assist"));
        mChapter10.addWord(new VocabWord("correr","to run"));
        mChapter10.addWord(new VocabWord("comer","to eat"));
        mChapter10.addWord(new VocabWord("comprar","to buy"));
        mChapter10.addWord(new VocabWord("querer","to want"));
        mChapter10.addWord(new VocabWord("preferir","to prefer"));
        mChapter10.addWord(new VocabWord("enviar","to send"));
        mChapter10.addWord(new VocabWord("ir","to go"));
        mChapter10.addWord(new VocabWord("ser","to be"));
        mChapter10.addWord(new VocabWord("dar","to give"));
        mChapter10.addWord(new VocabWord("ver","to see"));
        mChapter10.addWord(new VocabWord("leer","to read"));
        mChapter10.addWord(new VocabWord("oír","to hear"));
        mChapter10.addWord(new VocabWord("caer","to fall"));
        mChapter10.addWord(new VocabWord("creer","to believe"));
    }

    private void buildChapter9() {
        mChapter9.addWord(new VocabWord("alto (a)","tall"));
        mChapter9.addWord(new VocabWord("bajo (a)","short"));
        mChapter9.addWord(new VocabWord("rizado (a)","curly"));
        mChapter9.addWord(new VocabWord("negro (a)","black"));
        mChapter9.addWord(new VocabWord("café","brown"));
        mChapter9.addWord(new VocabWord("largo (a)","long"));
        mChapter9.addWord(new VocabWord("pequeño (a)","little"));
        mChapter9.addWord(new VocabWord("delgado (a)","thin"));
        mChapter9.addWord(new VocabWord("liso (a)","straight (hair)"));
        mChapter9.addWord(new VocabWord("castaño (a)","brown (chestnut)"));
        mChapter9.addWord(new VocabWord("rubio (a)","blond"));
        mChapter9.addWord(new VocabWord("azul","blue"));
        mChapter9.addWord(new VocabWord("guapo","handsome"));
        mChapter9.addWord(new VocabWord("fuerte","strong"));
        mChapter9.addWord(new VocabWord("verde","green"));
        mChapter9.addWord(new VocabWord("gordo (a)","fat"));
        mChapter9.addWord(new VocabWord("atleta","athletic"));
        mChapter9.addWord(new VocabWord("inteligente","intelligent"));
        mChapter9.addWord(new VocabWord("más","more"));
        mChapter9.addWord(new VocabWord("menos","less"));
        mChapter9.addWord(new VocabWord("tan","as"));
        mChapter9.addWord(new VocabWord("más . . .que","more . . . than"));
        mChapter9.addWord(new VocabWord("menos . . . que","less . . . than"));
        mChapter9.addWord(new VocabWord("tan . . . como","as . . . as"));
        mChapter9.addWord(new VocabWord("bueno","good"));
        mChapter9.addWord(new VocabWord("mejor","better"));
        mChapter9.addWord(new VocabWord("malo","bad"));
        mChapter9.addWord(new VocabWord("peor","worse"));
        mChapter9.addWord(new VocabWord("mayor","older"));
        mChapter9.addWord(new VocabWord("menor","younger"));
        mChapter9.addWord(new VocabWord("mayor que","older than"));
        mChapter9.addWord(new VocabWord("menor que","younger than"));
        mChapter9.addWord(new VocabWord("grande","big"));
        mChapter9.addWord(new VocabWord("más grande","bigger"));
        mChapter9.addWord(new VocabWord("pequeño (a)","small"));
        mChapter9.addWord(new VocabWord("más pequeño (a)","smaller"));
        mChapter9.addWord(new VocabWord("fuerte","strong"));
        mChapter9.addWord(new VocabWord("más fuerte","stronger"));
        mChapter9.addWord(new VocabWord("el  (la) mayor","the oldest"));
        mChapter9.addWord(new VocabWord("el (la) menor","the youngest"));
        mChapter9.addWord(new VocabWord("el (la) más fuerte","the strongest"));
        mChapter9.addWord(new VocabWord("el (la) más bonito","the prettiest"));
        mChapter9.addWord(new VocabWord("se despierta","he, she, it  awaken"));
        mChapter9.addWord(new VocabWord("se levanta","he, she, it  get up"));
        mChapter9.addWord(new VocabWord("se baña","he, she, it  bathes"));
        mChapter9.addWord(new VocabWord("se afeita","he, she, it  shaves"));
        mChapter9.addWord(new VocabWord("se cepilla los dientes","he, she, it  brushes his teeth"));
        mChapter9.addWord(new VocabWord("se prepara de desayuno","he, she, it prepares breakfast"));
        mChapter9.addWord(new VocabWord("se viste","he, she, it  dresses"));
        mChapter9.addWord(new VocabWord("se peina","he, she, it combs his hair"));
        mChapter9.addWord(new VocabWord("me despierto","I awaken"));
        mChapter9.addWord(new VocabWord("te despiertas","you awaken"));
        mChapter9.addWord(new VocabWord("nos despertamos","we awaken"));
        mChapter9.addWord(new VocabWord("me levanto","I get up"));
        mChapter9.addWord(new VocabWord("te levantas","you get up"));
        mChapter9.addWord(new VocabWord("nos levantamos","we get up"));
        mChapter9.addWord(new VocabWord("me baño","I bathe"));
        mChapter9.addWord(new VocabWord("te bañas","you bathe"));
        mChapter9.addWord(new VocabWord("nos bañamos","we bathe"));
        mChapter9.addWord(new VocabWord("me afeito","I shave"));
        mChapter9.addWord(new VocabWord("te afeitas","you shave"));
        mChapter9.addWord(new VocabWord("nos afeitamos","we shave"));
        mChapter9.addWord(new VocabWord("me cepillo los dientes","I brush my teeth"));
        mChapter9.addWord(new VocabWord("se cepilla los dientes","you (formal) brush my teeth"));
        mChapter9.addWord(new VocabWord("me cepillo los dientes","I brush my teeth"));
        mChapter9.addWord(new VocabWord("me preparo de desayuno","I prepare breakfast"));
        mChapter9.addWord(new VocabWord("te preparas el desayuno","you prepare breakfast"));
        mChapter9.addWord(new VocabWord("nos preparamos el desayuno","we prepare breakfast"));
        mChapter9.addWord(new VocabWord("me visto","I dress"));
        mChapter9.addWord(new VocabWord("te vistes","you dress"));
        mChapter9.addWord(new VocabWord("nos vistamos","we dress"));
        mChapter9.addWord(new VocabWord("me peino","I comb my hair"));
        mChapter9.addWord(new VocabWord("te peinas","you comb your hair"));
        mChapter9.addWord(new VocabWord("nos peinamos","we comb our hair"));
        mChapter9.addWord(new VocabWord("este","this (sing., masc.)"));
        mChapter9.addWord(new VocabWord("esta","this (sing., fem.)"));
        mChapter9.addWord(new VocabWord("ese","that (sing., masc.)"));
        mChapter9.addWord(new VocabWord("esa","that (sing., fem.)"));
        mChapter9.addWord(new VocabWord("aquel","that one over there (sing., masc.)"));
        mChapter9.addWord(new VocabWord("aquella","that one over there (sing., fem.)"));
        mChapter9.addWord(new VocabWord("estos","these (plural, masc.)"));
        mChapter9.addWord(new VocabWord("estas","these (plural, fem.)"));
        mChapter9.addWord(new VocabWord("esos","those (plural, masc.)"));
        mChapter9.addWord(new VocabWord("esas","those (plural, fem.)"));
        mChapter9.addWord(new VocabWord("aquellos","those over there (plural, masc.)"));
        mChapter9.addWord(new VocabWord("aquellas","those over there (plural, fem.)"));
    }

    private void buildChapter7() {
        mChapter7.addWord(new VocabWord("domingo","Sunday"));
        mChapter7.addWord(new VocabWord("lunes","Monday"));
        mChapter7.addWord(new VocabWord("martes","Tuesday"));
        mChapter7.addWord(new VocabWord("miércoles","Wednesday"));
        mChapter7.addWord(new VocabWord("jueves","Thursday"));
        mChapter7.addWord(new VocabWord("viernes","Friday"));
        mChapter7.addWord(new VocabWord("sábado","Saturday"));
        mChapter7.addWord(new VocabWord("Hoy es . . .","Today is . . ."));
        mChapter7.addWord(new VocabWord("Ayer fue . . .","Yesterday was  . . ."));
        mChapter7.addWord(new VocabWord("Mañana será . . .","Tomorrow will be . . ."));
        mChapter7.addWord(new VocabWord("enero","January"));
        mChapter7.addWord(new VocabWord("febrero","February"));
        mChapter7.addWord(new VocabWord("marzo","March"));
        mChapter7.addWord(new VocabWord("abril","April"));
        mChapter7.addWord(new VocabWord("mayo","May"));
        mChapter7.addWord(new VocabWord("junio","June"));
        mChapter7.addWord(new VocabWord("julio","July"));
        mChapter7.addWord(new VocabWord("agosto","August"));
        mChapter7.addWord(new VocabWord("septiembre","September"));
        mChapter7.addWord(new VocabWord("octubre","October"));
        mChapter7.addWord(new VocabWord("noviembre","November"));
        mChapter7.addWord(new VocabWord("diciembre","December"));
        mChapter7.addWord(new VocabWord("el invierno","winter"));
        mChapter7.addWord(new VocabWord("la primavera","spring"));
        mChapter7.addWord(new VocabWord("el verano","summer"));
        mChapter7.addWord(new VocabWord("el otoño","autumn or fall"));
        mChapter7.addWord(new VocabWord("Hacer","to make or do"));
        mChapter7.addWord(new VocabWord("Tener que","to have or to have to"));
        mChapter7.addWord(new VocabWord("Ir","to go"));
        mChapter7.addWord(new VocabWord("Decir","to say or tell"));
        mChapter7.addWord(new VocabWord("puerta de salida","exit"));
        mChapter7.addWord(new VocabWord("la sala de espera","waiting area"));
        mChapter7.addWord(new VocabWord("el equipaje","baggage / luggage"));
        mChapter7.addWord(new VocabWord("la maleta","suitcase"));
        mChapter7.addWord(new VocabWord("el pasaje","ticket"));
        mChapter7.addWord(new VocabWord("el mostrador","counter"));
        mChapter7.addWord(new VocabWord("el agente","agent"));
        mChapter7.addWord(new VocabWord("aeropuerto","airport"));
        mChapter7.addWord(new VocabWord("ayudar","to help"));
        mChapter7.addWord(new VocabWord("esperar","to wait for"));
        mChapter7.addWord(new VocabWord("recibir","to receive"));
        mChapter7.addWord(new VocabWord("buscar","to look for"));
        mChapter7.addWord(new VocabWord("llamar","to call"));
        mChapter7.addWord(new VocabWord("los deportes","sports"));
        mChapter7.addWord(new VocabWord("el esquí","skiing"));
        mChapter7.addWord(new VocabWord("el tenis","tennis"));
        mChapter7.addWord(new VocabWord("la natación","swimming"));
        mChapter7.addWord(new VocabWord("la gimnasia","gymnastics"));
        mChapter7.addWord(new VocabWord("el fútbol","soccer"));
        mChapter7.addWord(new VocabWord("el fútbol americano","football"));
        mChapter7.addWord(new VocabWord("el baloncesto","basketball"));
        mChapter7.addWord(new VocabWord("el voleibol","volleyball"));
        mChapter7.addWord(new VocabWord("el béisbol","baseball"));
        mChapter7.addWord(new VocabWord("un aficionado","fan"));
        mChapter7.addWord(new VocabWord("una aficionada","female fan"));
        mChapter7.addWord(new VocabWord("un equipo","team"));
        mChapter7.addWord(new VocabWord("un partido","a match or game"));
        mChapter7.addWord(new VocabWord("un jugador","player"));
        mChapter7.addWord(new VocabWord("una jugadora","female player"));
        mChapter7.addWord(new VocabWord("un (a) atleta","athlete"));
        mChapter7.addWord(new VocabWord("un (a) deportista","athlete"));
        mChapter7.addWord(new VocabWord("deportivo(a)","concerning sports"));
        mChapter7.addWord(new VocabWord("gustar","to please"));
        mChapter7.addWord(new VocabWord("fascinar","to fascinate"));
        mChapter7.addWord(new VocabWord("encantar","to delight"));
        mChapter7.addWord(new VocabWord("molestar","to bother"));
        mChapter7.addWord(new VocabWord("jugar","to play (a game)"));
        mChapter7.addWord(new VocabWord("tocar","to play (an instrument)"));
        mChapter7.addWord(new VocabWord("saber","to know (information)"));
    }

    private void buildChapter6() {
        mChapter6.addWord(new VocabWord("De compras","shopping"));
        mChapter6.addWord(new VocabWord("el (la) dependiente","store clerk"));
        mChapter6.addWord(new VocabWord("el (la) cliente","client or shopper"));
        mChapter6.addWord(new VocabWord("el mostrador","counter or display case"));
        mChapter6.addWord(new VocabWord("¿Cuánto cuesta?","How much does it cost?"));
        mChapter6.addWord(new VocabWord("el precio","price"));
        mChapter6.addWord(new VocabWord("caro","expensive"));
        mChapter6.addWord(new VocabWord("barato","inexpensive or cheap"));
        mChapter6.addWord(new VocabWord("el centro comercial","commercial center"));
        mChapter6.addWord(new VocabWord("Los modos de transporte","modes of transportation"));
        mChapter6.addWord(new VocabWord("el carro","car"));
        mChapter6.addWord(new VocabWord("el auto","car"));
        mChapter6.addWord(new VocabWord("el automóvil","automobile"));
        mChapter6.addWord(new VocabWord("el coche","car"));
        mChapter6.addWord(new VocabWord("el motocicleta","motorcycle"));
        mChapter6.addWord(new VocabWord("el autobús","bus"));
        mChapter6.addWord(new VocabWord("el metro","subway or rail train"));
        mChapter6.addWord(new VocabWord("el taxi","taxi"));
        mChapter6.addWord(new VocabWord("a pie","on foot"));
        mChapter6.addWord(new VocabWord("Ir","to go"));
        mChapter6.addWord(new VocabWord("Dar","to give"));
        mChapter6.addWord(new VocabWord("Estar","to be"));
        mChapter6.addWord(new VocabWord("actividad","activity"));
        mChapter6.addWord(new VocabWord("capacidad","capacity"));
        mChapter6.addWord(new VocabWord("eternidad","eternity"));
        mChapter6.addWord(new VocabWord("facultad","faculty"));
        mChapter6.addWord(new VocabWord("humanidad","humanity"));
        mChapter6.addWord(new VocabWord("imposibilidad","impossibility"));
        mChapter6.addWord(new VocabWord("libertad","liberty"));
        mChapter6.addWord(new VocabWord("necesidad","necessity"));
        mChapter6.addWord(new VocabWord("personalidad","personality"));
        mChapter6.addWord(new VocabWord("realidad","reality"));
        mChapter6.addWord(new VocabWord("espiritualidad","spirituality"));
        mChapter6.addWord(new VocabWord("variedad","variety"));
        mChapter6.addWord(new VocabWord("vivir","to live"));
        mChapter6.addWord(new VocabWord("asistir","to attend or assist"));
        mChapter6.addWord(new VocabWord("abrir","to open"));
        mChapter6.addWord(new VocabWord("escribir","to write"));
        mChapter6.addWord(new VocabWord("Permitir","to permit or allow"));
        mChapter6.addWord(new VocabWord("ocurrir","to occur or happen"));
        mChapter6.addWord(new VocabWord("subir","to go up or board"));
    }

    private void buildChapter5() {
        mChapter5.addWord(new VocabWord("hablar","to talk"));
        mChapter5.addWord(new VocabWord("entrar","to enter"));
        mChapter5.addWord(new VocabWord("estudiar","to study"));
        mChapter5.addWord(new VocabWord("ganar","to win"));
        mChapter5.addWord(new VocabWord("cantar","to sing"));
        mChapter5.addWord(new VocabWord("comprar","to buy"));
        mChapter5.addWord(new VocabWord("llegar","to arrive"));
        mChapter5.addWord(new VocabWord("practicar","to practice"));
        mChapter5.addWord(new VocabWord("trabajar","to work"));
        mChapter5.addWord(new VocabWord("tomar","to take or drink"));
        mChapter5.addWord(new VocabWord("caminar","to walk"));
        mChapter5.addWord(new VocabWord("estudiar","to study"));
        mChapter5.addWord(new VocabWord("desear","to want"));
        mChapter5.addWord(new VocabWord("mí (in Spanish)","me (in English)"));
        mChapter5.addWord(new VocabWord("ti (singular)","you (singular)"));
        mChapter5.addWord(new VocabWord("él (singular)","him (singular)"));
        mChapter5.addWord(new VocabWord("ella (singular)","her (singular)"));
        mChapter5.addWord(new VocabWord("Ud. (singular)","your (singular)"));
        mChapter5.addWord(new VocabWord("nosotros / nosotras (plural)","we (plural)"));
        mChapter5.addWord(new VocabWord("ellos / ellas (plural)","they (plural)"));
        mChapter5.addWord(new VocabWord("Uds. (plural)","you all (plural)"));
        mChapter5.addWord(new VocabWord("conmigo","with me"));
        mChapter5.addWord(new VocabWord("contigo","with you"));
        mChapter5.addWord(new VocabWord("El ensayo","the rehearsal"));
        mChapter5.addWord(new VocabWord("un dúo","duet"));
        mChapter5.addWord(new VocabWord("un cuarteto","quartet"));
        mChapter5.addWord(new VocabWord("los instrumentos musicales","musical instruments"));
        mChapter5.addWord(new VocabWord("la trompeta","trumpet"));
        mChapter5.addWord(new VocabWord("el acordeón","accordion"));
        mChapter5.addWord(new VocabWord("la flauta","flute"));
        mChapter5.addWord(new VocabWord("el piano","piano"));
        mChapter5.addWord(new VocabWord("la guitarra","guitar"));
        mChapter5.addWord(new VocabWord("la marimba","marimba"));
        mChapter5.addWord(new VocabWord("predicar","to preach"));
        mChapter5.addWord(new VocabWord("ensayar","to rehearse"));
        mChapter5.addWord(new VocabWord("mirar","to look at"));
        mChapter5.addWord(new VocabWord("sacar","to take or take out"));
        mChapter5.addWord(new VocabWord("esperar","to hope for or wait for"));
        mChapter5.addWord(new VocabWord("invitar","to invite"));
        mChapter5.addWord(new VocabWord("enseñar","to teach or show"));
        mChapter5.addWord(new VocabWord("buscar","to look for"));
        mChapter5.addWord(new VocabWord("señalar","to point out"));
        mChapter5.addWord(new VocabWord("reservar","to reserve"));
        mChapter5.addWord(new VocabWord("tocar","to play or touch"));
        mChapter5.addWord(new VocabWord("un","a"));
        mChapter5.addWord(new VocabWord("unos","some"));
        mChapter5.addWord(new VocabWord("varios","some"));
        mChapter5.addWord(new VocabWord("algunos","some"));
        mChapter5.addWord(new VocabWord("cuántos","how many"));
        mChapter5.addWord(new VocabWord("muchos","many"));
        mChapter5.addWord(new VocabWord("otros","other"));
        mChapter5.addWord(new VocabWord("todos","all"));
        mChapter5.addWord(new VocabWord("una","a"));
        mChapter5.addWord(new VocabWord("unas","some"));
        mChapter5.addWord(new VocabWord("varias","some"));
        mChapter5.addWord(new VocabWord("algunas","some"));
        mChapter5.addWord(new VocabWord("cuántas","how many"));
        mChapter5.addWord(new VocabWord("muchas","many"));
        mChapter5.addWord(new VocabWord("otras","other"));
        mChapter5.addWord(new VocabWord("todas","all"));
        mChapter5.addWord(new VocabWord("Preparar","to prepare"));
        mChapter5.addWord(new VocabWord("orar","to pray"));
        mChapter5.addWord(new VocabWord("rezar","to pray"));
        mChapter5.addWord(new VocabWord("alabar","to praise"));
        mChapter5.addWord(new VocabWord("necesitar","to need"));
        mChapter5.addWord(new VocabWord("terminar","to end"));
        mChapter5.addWord(new VocabWord("presentar","to show or present"));
        mChapter5.addWord(new VocabWord("olvidar","to forget"));
        mChapter5.addWord(new VocabWord("mencionar","to mention"));
        mChapter5.addWord(new VocabWord("felicitar","to congratulate"));
        mChapter5.addWord(new VocabWord("bueno","good"));
        mChapter5.addWord(new VocabWord("malo","bad"));
        mChapter5.addWord(new VocabWord("interesante","interesting"));
        mChapter5.addWord(new VocabWord("importante","important"));
        mChapter5.addWord(new VocabWord("fácil","easy"));
        mChapter5.addWord(new VocabWord("difícil","difficult"));
        mChapter5.addWord(new VocabWord("necesario","necessary"));
        mChapter5.addWord(new VocabWord("práctico","practical"));
        mChapter5.addWord(new VocabWord("imposible","impossible"));
        mChapter5.addWord(new VocabWord("ridículo","ridiculous"));
        mChapter5.addWord(new VocabWord("posible","possible"));
        mChapter5.addWord(new VocabWord("imposible","impossible"));
        mChapter5.addWord(new VocabWord("siempre","always"));
        mChapter5.addWord(new VocabWord("alguno(a)","some"));
        mChapter5.addWord(new VocabWord("alguien","someone (anyone)"));
        mChapter5.addWord(new VocabWord("algo","something (anything)"));
        mChapter5.addWord(new VocabWord("nunca","never"));
        mChapter5.addWord(new VocabWord("ninguno(a)","none (not any)"));
        mChapter5.addWord(new VocabWord("nadie","no one (not anyone)"));
        mChapter5.addWord(new VocabWord("nada","nothing (not anything)"));
        mChapter5.addWord(new VocabWord("algún","some (before a singular, masculine noun)"));
        mChapter5.addWord(new VocabWord("ningún","none (before a singular, masculine noun)"));
    }

    private void buildChapter4() {
        mChapter4.addWord(new VocabWord("El centro","Downtown"));
        mChapter4.addWord(new VocabWord("el parque","the park"));
        mChapter4.addWord(new VocabWord("la estación de autobús","the bus station"));
        mChapter4.addWord(new VocabWord("el teléfono público","the public telephone"));
        mChapter4.addWord(new VocabWord("el teatro","the theater"));
        mChapter4.addWord(new VocabWord("la tienda","the store"));
        mChapter4.addWord(new VocabWord("el museo","the museum"));
        mChapter4.addWord(new VocabWord("la heladería","the ice cream shop"));
        mChapter4.addWord(new VocabWord("el restaurante","the restaurant"));
        mChapter4.addWord(new VocabWord("la iglesia","the church"));
        mChapter4.addWord(new VocabWord("el hospital","the hospital"));
        mChapter4.addWord(new VocabWord("yo","I - first person singular"));
        mChapter4.addWord(new VocabWord("tú","You - second person singular"));
        mChapter4.addWord(new VocabWord("él","He or it- third person singular (masc.)"));
        mChapter4.addWord(new VocabWord("ella","She or it - third person singular (fem.)"));
        mChapter4.addWord(new VocabWord("usted","You - second person singular (formal) but uses the third person verb conjugation"));
        mChapter4.addWord(new VocabWord("nosotros","we - first person plural (masc.)"));
        mChapter4.addWord(new VocabWord("nosotras","we - first person plural (fem.)"));
        mChapter4.addWord(new VocabWord("ustedes","you all - second person plural but uses the third person verb conjugation"));
        mChapter4.addWord(new VocabWord("ellos","they - third person plural (masc.)"));
        mChapter4.addWord(new VocabWord("ellas","they - third person plural (fem.)"));
        mChapter4.addWord(new VocabWord("cero","zero"));
        mChapter4.addWord(new VocabWord("uno","one"));
        mChapter4.addWord(new VocabWord("dos","two"));
        mChapter4.addWord(new VocabWord("tres","three"));
        mChapter4.addWord(new VocabWord("cuatro","four"));
        mChapter4.addWord(new VocabWord("cinco","five"));
        mChapter4.addWord(new VocabWord("seis","six"));
        mChapter4.addWord(new VocabWord("siete","seven"));
        mChapter4.addWord(new VocabWord("ocho","eight"));
        mChapter4.addWord(new VocabWord("nueve","nine"));
        mChapter4.addWord(new VocabWord("diez","ten"));
        mChapter4.addWord(new VocabWord("once","eleven"));
        mChapter4.addWord(new VocabWord("doce","twelve"));
        mChapter4.addWord(new VocabWord("trece","thirteen"));
        mChapter4.addWord(new VocabWord("catorce","fourteen"));
        mChapter4.addWord(new VocabWord("quince","fifteen"));
        mChapter4.addWord(new VocabWord("dieciséis","sixteen"));
        mChapter4.addWord(new VocabWord("diecisiete","seventeen"));
        mChapter4.addWord(new VocabWord("dieciocho","eighteen"));
        mChapter4.addWord(new VocabWord("diecinueve","nineteen"));
        mChapter4.addWord(new VocabWord("veinte","twenty"));
        mChapter4.addWord(new VocabWord("veintiuno","twenty-one"));
        mChapter4.addWord(new VocabWord("treinta","thirty"));
        mChapter4.addWord(new VocabWord("cuarenta","forty"));
        mChapter4.addWord(new VocabWord("cincuenta","fifty"));
        mChapter4.addWord(new VocabWord("sesenta","sixty"));
        mChapter4.addWord(new VocabWord("setenta","seventy"));
        mChapter4.addWord(new VocabWord("ochenta","eighty"));
        mChapter4.addWord(new VocabWord("noventa","ninety"));
        mChapter4.addWord(new VocabWord("cien","one hundred"));
        mChapter4.addWord(new VocabWord("mil","one thousand"));
        mChapter4.addWord(new VocabWord("millón","one million"));
        mChapter4.addWord(new VocabWord("Tener","to have"));
        mChapter4.addWord(new VocabWord("¿Cuántos años tienes?","How old are you?"));
        mChapter4.addWord(new VocabWord("¿Cuántos años tiene tu mamá?","How old is your mother?"));
        mChapter4.addWord(new VocabWord("Tengo dieciséis años.","I am 16 years old."));
        mChapter4.addWord(new VocabWord("Tiene ____ años.","He is ____ years old."));
        mChapter4.addWord(new VocabWord("Luis y Ana tienen un carro nuevo.","Luis and Ana have a new car."));
        mChapter4.addWord(new VocabWord("Mi mejor amigo y yo tenemos una clase de francés ahora.","My best friend and I have a French class now."));
        mChapter4.addWord(new VocabWord("Nosotros tenemos una clase de química hoy.","We have a chemistry class today."));
        mChapter4.addWord(new VocabWord("Yo tengo una cita con el dentista.","I have an appointment with the dentist."));
        mChapter4.addWord(new VocabWord("Mi abuelo tiene muchos años.","My grandfather is very old."));
    }

    private void buildChapter8() {
        mChapter8.addWord(new VocabWord("¿Qué vas a hacer este fin de semana?","What are you going to do this weekend?"));
        mChapter8.addWord(new VocabWord("Voy a salir con mí prima.","I am going out with my cousin."));
        mChapter8.addWord(new VocabWord("Voy a repartir tratados.","I am going to hand out tracts."));
        mChapter8.addWord(new VocabWord("Voy a salir con mis amigas.","I am going out with my friends."));
        mChapter8.addWord(new VocabWord("Voy a dar un paseo por el parque.","I am going to walk through the park."));
        mChapter8.addWord(new VocabWord("Voy a jugar al baloncesto.","I am going to play basketball."));
        mChapter8.addWord(new VocabWord("Voy a estudiar.","I am going to study."));
        mChapter8.addWord(new VocabWord("Voy a ir a la iglesia el domingo.","I am going to church Sunday."));
        mChapter8.addWord(new VocabWord("Voy a ir al concierto.","I am going to the concert."));
        mChapter8.addWord(new VocabWord("salir","to leave"));
        mChapter8.addWord(new VocabWord("poner","to put or place"));
        mChapter8.addWord(new VocabWord("traer","to bring"));
        mChapter8.addWord(new VocabWord("oír","to hear"));
        mChapter8.addWord(new VocabWord("conocer","to know (familiar)"));
        mChapter8.addWord(new VocabWord("obedecer","to obey"));
        mChapter8.addWord(new VocabWord("Ropa de mujer","Women's clothes"));
        mChapter8.addWord(new VocabWord("el vestido","dress"));
        mChapter8.addWord(new VocabWord("la blusa","blouse"));
        mChapter8.addWord(new VocabWord("las medias","socks or hose"));
        mChapter8.addWord(new VocabWord("la falda","skirt"));
        mChapter8.addWord(new VocabWord("los zapatos","shoes"));
        mChapter8.addWord(new VocabWord("la chaqueta","jacket"));
        mChapter8.addWord(new VocabWord("los calcetines","socks"));
        mChapter8.addWord(new VocabWord("el suéter","sweater"));
        mChapter8.addWord(new VocabWord("el abrigo","coat"));
        mChapter8.addWord(new VocabWord( "ropa de hombre","Men's clothes"));
        mChapter8.addWord(new VocabWord("la camisa","shirt"));
        mChapter8.addWord(new VocabWord("el sombrero","hat"));
        mChapter8.addWord(new VocabWord("la corbata","tie"));
        mChapter8.addWord(new VocabWord("los pantalones","pants"));
        mChapter8.addWord(new VocabWord("el traje","suit"));
        mChapter8.addWord(new VocabWord("rojo (a)","red"));
        mChapter8.addWord(new VocabWord("verde","green"));
        mChapter8.addWord(new VocabWord("negro (a)","black"));
        mChapter8.addWord(new VocabWord("marrón, café","brown"));
        mChapter8.addWord(new VocabWord("anaranjado (a)","orange"));
        mChapter8.addWord(new VocabWord("amarillo (a)","yellow"));
        mChapter8.addWord(new VocabWord("blanco (a)","white"));
        mChapter8.addWord(new VocabWord("azul","blue"));
        mChapter8.addWord(new VocabWord("rosa","pink"));
        mChapter8.addWord(new VocabWord("gris","grey"));
        mChapter8.addWord(new VocabWord("morado (a), púrpura, violeta","purple, violet"));
        mChapter8.addWord(new VocabWord("azul marino (a)","aqua"));
        mChapter8.addWord(new VocabWord("beige","beige"));
        mChapter8.addWord(new VocabWord("los colores","colors"));
        mChapter8.addWord(new VocabWord("dar","to give"));
        mChapter8.addWord(new VocabWord("ver","to see"));
        mChapter8.addWord(new VocabWord("hacer","to make or to do"));
        mChapter8.addWord(new VocabWord("salir","to go out, to leave"));
        mChapter8.addWord(new VocabWord("traer","to bring"));
        mChapter8.addWord(new VocabWord("conocer","to know (familiar)"));
        mChapter8.addWord(new VocabWord("obedecer","to obey"));
        mChapter8.addWord(new VocabWord("conducir","to conduct, to lead, to drive (a car)"));
        mChapter8.addWord(new VocabWord("pensar","to think"));
        mChapter8.addWord(new VocabWord("perder","to lose"));
        mChapter8.addWord(new VocabWord("sentir","to feel"));
        mChapter8.addWord(new VocabWord("empezar","to begin"));
        mChapter8.addWord(new VocabWord("entender","to understand"));
        mChapter8.addWord(new VocabWord("querer","to want, to like or to love someone"));
        mChapter8.addWord(new VocabWord("preferir","to prefer"));
        mChapter8.addWord(new VocabWord("encontrar","to find or encounter"));
        mChapter8.addWord(new VocabWord("poder","to be able to"));
        mChapter8.addWord(new VocabWord("dormir","to sleep"));
        mChapter8.addWord(new VocabWord("volver","to return"));
        mChapter8.addWord(new VocabWord("morir","to die"));
        mChapter8.addWord(new VocabWord("el restaurante","restaurant"));
        mChapter8.addWord(new VocabWord("el mesero","the waiter"));
        mChapter8.addWord(new VocabWord("el cocinero","cook, chef"));
        mChapter8.addWord(new VocabWord("el menú","menu"));
        mChapter8.addWord(new VocabWord("la propina","tip"));
        mChapter8.addWord(new VocabWord("una mesa para cuatro","a table for four"));
        mChapter8.addWord(new VocabWord("las carnes","meats"));
        mChapter8.addWord(new VocabWord("el pollo","chicken"));
        mChapter8.addWord(new VocabWord("el filete de pescado","fillet of fish"));
        mChapter8.addWord(new VocabWord("la chuleta de puerco","pork chop"));
        mChapter8.addWord(new VocabWord("el bistec","steak"));
        mChapter8.addWord(new VocabWord("los vegetales, las verduras","vegetables"));
        mChapter8.addWord(new VocabWord("la zanahoria","carrot"));
        mChapter8.addWord(new VocabWord("la lechuga","lettuce"));
        mChapter8.addWord(new VocabWord("el maíz, el elote","corn"));
        mChapter8.addWord(new VocabWord("los frijoles","beans"));
        mChapter8.addWord(new VocabWord("el tomate","tomato"));
        mChapter8.addWord(new VocabWord("la papa","potato"));
        mChapter8.addWord(new VocabWord("las frutas","fruit"));
        mChapter8.addWord(new VocabWord("la pera","pear"));
        mChapter8.addWord(new VocabWord("la piña","pineapple"));
        mChapter8.addWord(new VocabWord("la naranja","orange"));
        mChapter8.addWord(new VocabWord("la banana","banana"));
        mChapter8.addWord(new VocabWord("el mango","mango"));
        mChapter8.addWord(new VocabWord("el limón","lemon"));
        mChapter8.addWord(new VocabWord("la manzana","apple"));
        mChapter8.addWord(new VocabWord("los postres","deserts"));
        mChapter8.addWord(new VocabWord("el arroz con leche","rice pudding"));
        mChapter8.addWord(new VocabWord("el flan","flan"));
        mChapter8.addWord(new VocabWord("el helado","ice cream"));
        mChapter8.addWord(new VocabWord("la torta, el pastel","cake"));
        mChapter8.addWord(new VocabWord("las bebidas","drinks"));
        mChapter8.addWord(new VocabWord("el café","coffee"));
        mChapter8.addWord(new VocabWord("el té","tea"));
        mChapter8.addWord(new VocabWord("la limonada","lemonade"));
        mChapter8.addWord(new VocabWord("el agua mineral","mineral water"));
        mChapter8.addWord(new VocabWord("la leche","milk"));
        mChapter8.addWord(new VocabWord("el refresco","soft drink"));
        mChapter8.addWord(new VocabWord("pedir","to ask or request"));
        mChapter8.addWord(new VocabWord("servir","to serve"));
        mChapter8.addWord(new VocabWord("repetir","to repeat"));
        mChapter8.addWord(new VocabWord("saber","to know (knowledge)"));
        mChapter8.addWord(new VocabWord("conocer","to know (familiar)"));
        mChapter8.addWord(new VocabWord("rápido","fast, quick, rapid"));
        mChapter8.addWord(new VocabWord("rápida","fast, quick, rapid"));
        mChapter8.addWord(new VocabWord("rápidamente","quickly, rapidly"));
        mChapter8.addWord(new VocabWord("lento","slow"));
        mChapter8.addWord(new VocabWord("lenta","slow"));
        mChapter8.addWord(new VocabWord("lentamente","slowly"));
        mChapter8.addWord(new VocabWord("sincero","sincere"));
        mChapter8.addWord(new VocabWord("sincera","sincere"));
        mChapter8.addWord(new VocabWord("sinceramente","sincerely"));
        mChapter8.addWord(new VocabWord("fácil","easy"));
        mChapter8.addWord(new VocabWord("fácilmente","easily"));
        mChapter8.addWord(new VocabWord("triste","sad"));
        mChapter8.addWord(new VocabWord("tristemente","sadly"));
        mChapter8.addWord(new VocabWord("igual","equal"));
        mChapter8.addWord(new VocabWord("igualmente","equally"));
    }

    private void buildChapter3() {
        mChapter3.addWord(new VocabWord("Estar","to be"));
        mChapter3.addWord(new VocabWord("En","in, on, inside of, OR at"));
        mChapter3.addWord(new VocabWord("junto a","next to"));
        mChapter3.addWord(new VocabWord("Encima de","on top (of)"));
        mChapter3.addWord(new VocabWord("al lado de","beside (of)"));
        mChapter3.addWord(new VocabWord("detrás de","behind (of)"));
        mChapter3.addWord(new VocabWord("delante de","in front (of)"));
        mChapter3.addWord(new VocabWord("debajo de","underneath (of)"));
        mChapter3.addWord(new VocabWord("sobre de","on top (of)"));
        mChapter3.addWord(new VocabWord("contento (a)","content"));
        mChapter3.addWord(new VocabWord("de mal humor","unhappy"));
        mChapter3.addWord(new VocabWord("sano (a)","healthy OR well"));
        mChapter3.addWord(new VocabWord("enfermo (a)","sick"));
        mChapter3.addWord(new VocabWord("triste","sad"));
        mChapter3.addWord(new VocabWord("alegre","happy"));
        mChapter3.addWord(new VocabWord("nervioso (a)","nervous"));
        mChapter3.addWord(new VocabWord("tranquilo (a)","calm"));
        mChapter3.addWord(new VocabWord("cansado (a)","tired"));
        mChapter3.addWord(new VocabWord("sucio (a)","dirty"));
        mChapter3.addWord(new VocabWord("limpio (a)","clean"));
        mChapter3.addWord(new VocabWord("cerrado (a)","closed"));
        mChapter3.addWord(new VocabWord("abierto (a)","open"));
        mChapter3.addWord(new VocabWord("presente","present"));
        mChapter3.addWord(new VocabWord("ausente","absent"));
        mChapter3.addWord(new VocabWord("amable","kind"));
        mChapter3.addWord(new VocabWord("bueno (a)","good"));
        mChapter3.addWord(new VocabWord("malo (a)","bad"));
        mChapter3.addWord(new VocabWord("interesante","interesting"));
        mChapter3.addWord(new VocabWord("aburrido (a)","boring"));
        mChapter3.addWord(new VocabWord("simpático (a)","nice"));
        mChapter3.addWord(new VocabWord("inteligente","intelligent"));
        mChapter3.addWord(new VocabWord("generoso (a)","generous"));
        mChapter3.addWord(new VocabWord("tacaño (a)","stingy"));
        mChapter3.addWord(new VocabWord("feo (a)","ugly"));
        mChapter3.addWord(new VocabWord("bonito (a)","pretty"));
        mChapter3.addWord(new VocabWord("guapo","handsome"));
        mChapter3.addWord(new VocabWord("joven","young"));
        mChapter3.addWord(new VocabWord("viejo (a)","old"));
        mChapter3.addWord(new VocabWord("delgado (a)","slim"));
        mChapter3.addWord(new VocabWord("gordo (a)","fat"));
        mChapter3.addWord(new VocabWord("bajo (a)","short"));
        mChapter3.addWord(new VocabWord("alto (a)","tall"));
        mChapter3.addWord(new VocabWord("muy","very"));
        mChapter3.addWord(new VocabWord("bastante","quite, rather, somewhat"));
        mChapter3.addWord(new VocabWord("algo","somewhat"));
        mChapter3.addWord(new VocabWord("poco","not very"));
        mChapter3.addWord(new VocabWord("no / nada","not / at all"));
        mChapter3.addWord(new VocabWord("americano (a)","American"));
        mChapter3.addWord(new VocabWord("Los Estados Unidos","The United States"));
        mChapter3.addWord(new VocabWord("España","Spain"));
        mChapter3.addWord(new VocabWord("español / española","Spanish"));
        mChapter3.addWord(new VocabWord("puertorriqueño (a)","Puerto Rican"));
        mChapter3.addWord(new VocabWord("argentino (a)","Argentinean"));
        mChapter3.addWord(new VocabWord("dominicano (a)","Dominican"));
        mChapter3.addWord(new VocabWord("mexicano (a)","Mexican"));
        mChapter3.addWord(new VocabWord("cubano (a)","Cuban"));
        mChapter3.addWord(new VocabWord("francés / francesa","French"));
        mChapter3.addWord(new VocabWord("inglés / inglesa","English"));
        mChapter3.addWord(new VocabWord("alemán / alemana","German"));
        mChapter3.addWord(new VocabWord("el paraguas","umbrella"));
        mChapter3.addWord(new VocabWord("el reloj","watch OR clock"));
        mChapter3.addWord(new VocabWord("el sombrero","hat"));
        mChapter3.addWord(new VocabWord("la bolsa","purse OR bag"));
        mChapter3.addWord(new VocabWord("la mochila","backpack"));
        mChapter3.addWord(new VocabWord("el portafolio","briefcase"));
        mChapter3.addWord(new VocabWord("el collar","necklace"));
        mChapter3.addWord(new VocabWord("el algodón","cotton"));
        mChapter3.addWord(new VocabWord("el cuero","leather"));
        mChapter3.addWord(new VocabWord("el plástico","plastic"));
        mChapter3.addWord(new VocabWord("la lana","wool"));
        mChapter3.addWord(new VocabWord("el oro","gold"));
        mChapter3.addWord(new VocabWord("la plata","silver"));
        mChapter3.addWord(new VocabWord("la madera","wood"));
        mChapter3.addWord(new VocabWord("el acero","steel"));
    }

    private void buildChapter2() {
        mChapter2.addWord(new VocabWord("la casa","the house"));
        mChapter2.addWord(new VocabWord("el baño","the bathroom"));
        mChapter2.addWord(new VocabWord("la sala","the den"));
        mChapter2.addWord(new VocabWord("la cocina","the kitchen"));
        mChapter2.addWord(new VocabWord("el comedor","the dining room"));
        mChapter2.addWord(new VocabWord("el dormitorio OR la recamara","the bedroom"));
        mChapter2.addWord(new VocabWord("el pasillo","the hallway"));
        mChapter2.addWord(new VocabWord("el garaje","the garage"));
        mChapter2.addWord(new VocabWord("la primera planta","the first floor"));
        mChapter2.addWord(new VocabWord("la segunda planta","the second floor"));
        mChapter2.addWord(new VocabWord("el piso abajo","the bottom floor"));
        mChapter2.addWord(new VocabWord("el piso arriba","the top floor"));
        mChapter2.addWord(new VocabWord("la ventana","the window"));
        mChapter2.addWord(new VocabWord("la puerta","the door"));
        mChapter2.addWord(new VocabWord("el vecino","the neighbor"));
        mChapter2.addWord(new VocabWord("el techo","the ceiling OR roof"));
        mChapter2.addWord(new VocabWord("la pared","the wall"));
        mChapter2.addWord(new VocabWord("la alfombra","the carpet OR rug"));
        mChapter2.addWord(new VocabWord("las cortinas","the curtains"));
        mChapter2.addWord(new VocabWord("la mesa","the table"));
        mChapter2.addWord(new VocabWord("la silla","the chair"));
        mChapter2.addWord(new VocabWord("el sofá","the sofa"));
        mChapter2.addWord(new VocabWord("el televisor","the television"));
        mChapter2.addWord(new VocabWord("el radio","the radio"));
        mChapter2.addWord(new VocabWord("la cama","the bed"));
        mChapter2.addWord(new VocabWord("la estufa","the stove"));
        mChapter2.addWord(new VocabWord("el horno","the oven"));
        mChapter2.addWord(new VocabWord("el refrigerador","the refrigerator"));
        mChapter2.addWord(new VocabWord("el suelo OR el piso","the floor"));
        mChapter2.addWord(new VocabWord("el fregadero","the sink"));
        mChapter2.addWord(new VocabWord("esta mañana","this morning"));
        mChapter2.addWord(new VocabWord("el aula","classroom"));
        mChapter2.addWord(new VocabWord("las matemáticas","mathematics"));
        mChapter2.addWord(new VocabWord("la literatura","literature"));
        mChapter2.addWord(new VocabWord("el colegio","high school"));
        mChapter2.addWord(new VocabWord("el laboratorio","the laboratory"));
        mChapter2.addWord(new VocabWord("ahora","now OR today"));
        mChapter2.addWord(new VocabWord("la biología","biology"));
        mChapter2.addWord(new VocabWord("los reptiles","the reptiles"));
        mChapter2.addWord(new VocabWord("detesto","detest"));
        mChapter2.addWord(new VocabWord("el gimnasio","the gymnasium"));
        mChapter2.addWord(new VocabWord("la cafetería","the cafeteria"));
        mChapter2.addWord(new VocabWord("la oficina del director","the principal's office"));
        mChapter2.addWord(new VocabWord("la biblioteca","the library"));
        mChapter2.addWord(new VocabWord("la educación física","physical education"));
        mChapter2.addWord(new VocabWord("la historia","history"));
        mChapter2.addWord(new VocabWord("la geografía","geography"));
        mChapter2.addWord(new VocabWord("la geometría","geometry"));
        mChapter2.addWord(new VocabWord("la ciencia","science"));
        mChapter2.addWord(new VocabWord("la química","chemistry"));
        mChapter2.addWord(new VocabWord("el español / el inglés","Spanish / English"));
    }

    private void buildChapter1() {
        mChapter1.addWord(new VocabWord("Buenos días. ¿Cómo estás?","Good morning. How are you?"));
        mChapter1.addWord(new VocabWord("Estoy muy bien, gracias. ¿Y tú??","I am fine, thank you. And you?"));
        mChapter1.addWord(new VocabWord("¡Hola! ¿Qué tal?","Hi! How is everything?"));
        mChapter1.addWord(new VocabWord("Regular, gracias.","The same, thank you."));
        mChapter1.addWord(new VocabWord("Más o menos, gracias.","So, so, thank you."));
        mChapter1.addWord(new VocabWord("Buenas tardes. ¿Cómo está usted?","Good afternoon. How are you?"));
        mChapter1.addWord(new VocabWord("Bien, gracias.","Fine, thank you."));
        mChapter1.addWord(new VocabWord("Adiós.","Good bye."));
        mChapter1.addWord(new VocabWord("¡Hasta mañana!","Until tomorrow."));
        mChapter1.addWord(new VocabWord("Buenas noches.","Good evening."));
        mChapter1.addWord(new VocabWord("¡Hasta luego!", "Until later!"));
        mChapter1.addWord(new VocabWord("¡Hola! Soy _____ .", "Hello! I am _____ ."));
        mChapter1.addWord(new VocabWord("Me llamo _________.", "My name is ______."));
        mChapter1.addWord(new VocabWord("¿Cómo te llamas?", "What is your name?"));
        mChapter1.addWord(new VocabWord("Normal","Normal"));
        mChapter1.addWord(new VocabWord("Justo","Just"));
        mChapter1.addWord(new VocabWord("posible / imposible","Possible / Impossible"));
        mChapter1.addWord(new VocabWord("práctico / impráctico","practical / impractical"));
        mChapter1.addWord(new VocabWord("probable","probably"));
        mChapter1.addWord(new VocabWord("inteligente","intelligent"));
        mChapter1.addWord(new VocabWord("terrible","terrible"));
        mChapter1.addWord(new VocabWord("maravilloso","marvelous"));
        mChapter1.addWord(new VocabWord("espléndido","splendid"));
        mChapter1.addWord(new VocabWord("interesante","interesting"));
        mChapter1.addWord(new VocabWord("brillante","brilliant"));
        mChapter1.addWord(new VocabWord("importante","important"));
        mChapter1.addWord(new VocabWord("necesario / innecesario","necessary / unnecessary"));
        mChapter1.addWord(new VocabWord("estudioso","studious"));
        mChapter1.addWord(new VocabWord("académico","academic"));
        mChapter1.addWord(new VocabWord("común","common"));
        mChapter1.addWord(new VocabWord("famoso","famous"));
        mChapter1.addWord(new VocabWord("impulsivo","impulsive"));
        mChapter1.addWord(new VocabWord("cruel","cruel"));
        mChapter1.addWord(new VocabWord("sincero","sincere"));
        mChapter1.addWord(new VocabWord("generoso","generous"));
        mChapter1.addWord(new VocabWord("nervioso","nervous"));
        mChapter1.addWord(new VocabWord("religioso","religious"));
        mChapter1.addWord(new VocabWord("diplomático","diplomatic"));
        mChapter1.addWord(new VocabWord("político","political"));
        mChapter1.addWord(new VocabWord("económico", "economical"));
        mChapter1.addWord(new VocabWord("Zero","Cero"));
        mChapter1.addWord(new VocabWord("One","Uno"));
        mChapter1.addWord(new VocabWord("Two","Dos"));
        mChapter1.addWord(new VocabWord("Three","Tres"));
        mChapter1.addWord(new VocabWord("Four","Cuatro"));
        mChapter1.addWord(new VocabWord("Five","Cinco"));
        mChapter1.addWord(new VocabWord("Six","Seis"));
        mChapter1.addWord(new VocabWord("Seven","Siete"));
        mChapter1.addWord(new VocabWord("Eight","Ocho"));
        mChapter1.addWord(new VocabWord("Nine","Nueve"));
        mChapter1.addWord(new VocabWord("Ten","Diez"));
        mChapter1.addWord(new VocabWord("profesor","professor"));
        mChapter1.addWord(new VocabWord("estudiante","student"));
        mChapter1.addWord(new VocabWord("oficinista","office worker"));
        mChapter1.addWord(new VocabWord("secretaria","secretary"));
        mChapter1.addWord(new VocabWord("doctor","doctor"));
        mChapter1.addWord(new VocabWord("dentista","dentist"));
        mChapter1.addWord(new VocabWord("pastor","pastor"));
        mChapter1.addWord(new VocabWord("ministro","minister"));
        mChapter1.addWord(new VocabWord("músico","musician"));
        mChapter1.addWord(new VocabWord("violinista","violinist"));
        mChapter1.addWord(new VocabWord("guitarrista","guitarist"));
        mChapter1.addWord(new VocabWord("organista","organist"));
        mChapter1.addWord(new VocabWord("pianista","pianist"));
        mChapter1.addWord(new VocabWord("arquitecto","architect"));
        mChapter1.addWord(new VocabWord("ingeniero","engineer"));
        mChapter1.addWord(new VocabWord("electricista","electrician"));
        mChapter1.addWord(new VocabWord("contratista","contractor"));
        mChapter1.addWord(new VocabWord("carpintero","carpenter"));
        mChapter1.addWord(new VocabWord("plomero","plumber"));
        mChapter1.addWord(new VocabWord("piloto / aviador","pilot / aviator"));
        mChapter1.addWord(new VocabWord("general","general"));
        mChapter1.addWord(new VocabWord("capitán","captain"));
        mChapter1.addWord(new VocabWord("sargento","sergeant"));
        mChapter1.addWord(new VocabWord("detective","detective"));
        mChapter1.addWord(new VocabWord("policía","police"));
        mChapter1.addWord(new VocabWord("la abuela","the grandmother"));
        mChapter1.addWord(new VocabWord("el abuelo","the grandfather"));
        mChapter1.addWord(new VocabWord("el padre","the father"));
        mChapter1.addWord(new VocabWord("la madre","the mother"));
        mChapter1.addWord(new VocabWord("la hija","the daughter"));
        mChapter1.addWord(new VocabWord("el hijo","the son"));
        mChapter1.addWord(new VocabWord("los abuelos","the grandparents"));
        mChapter1.addWord(new VocabWord("los padres","the parents"));
        mChapter1.addWord(new VocabWord("los hijos","the children"));
        mChapter1.addWord(new VocabWord("el hermano","the brother"));
        mChapter1.addWord(new VocabWord("la hermana","the sister"));
        mChapter1.addWord(new VocabWord("el tío","the uncle"));
        mChapter1.addWord(new VocabWord("la tía","the aunt"));
        mChapter1.addWord(new VocabWord("el primo","the cousin (boy)"));
        mChapter1.addWord(new VocabWord("la prima","the cousin (girl)"));
        mChapter1.addWord(new VocabWord("el sobrino","the nephew"));
        mChapter1.addWord(new VocabWord("la sobrina","the niece"));
        mChapter1.addWord(new VocabWord("el nieto","the grandson"));
        mChapter1.addWord(new VocabWord("la nieta","the granddaughter"));
        mChapter1.addWord(new VocabWord("los parientes","the relatives"));
        mChapter1.addWord(new VocabWord("una puerta","a door"));
        mChapter1.addWord(new VocabWord("una ventana","a window"));
        mChapter1.addWord(new VocabWord("un libro","a book"));
        mChapter1.addWord(new VocabWord("una estudiante","a student (girl)"));
        mChapter1.addWord(new VocabWord("un estudiante","a student (boy)"));
        mChapter1.addWord(new VocabWord("una profesora","a teacher (woman)"));
        mChapter1.addWord(new VocabWord("un profesor","a teacher (man)"));
        mChapter1.addWord(new VocabWord("un papel","a paper"));
        mChapter1.addWord(new VocabWord("un escritorio / pupitre","a desk / student desk"));
        mChapter1.addWord(new VocabWord("un bolígrafo / pluma","a fountain pen / pen"));
        mChapter1.addWord(new VocabWord("una silla","a chair"));
        mChapter1.addWord(new VocabWord("un cuaderno","a notebook"));
        mChapter1.addWord(new VocabWord("un lápiz","a pencil"));
        mChapter1.addWord(new VocabWord("una goma","a pencil eraser"));
        mChapter1.addWord(new VocabWord("un borrador","a chalkboard eraser"));
        mChapter1.addWord(new VocabWord("una pizarra","a chalkboard"));
        mChapter1.addWord(new VocabWord("una tiza","a chalk"));
        mChapter1.addWord(new VocabWord("Levanten la mano.","Raise your hand."));
        mChapter1.addWord(new VocabWord("Bajen la mano.","Lower your hand."));
        mChapter1.addWord(new VocabWord("Escuchen.","Listen."));
        mChapter1.addWord(new VocabWord("Repitan.","Repeat."));
        mChapter1.addWord(new VocabWord("Párense.","Stand up."));
        mChapter1.addWord(new VocabWord("Siéntense.","Sit down."));
        mChapter1.addWord(new VocabWord("Contesten en español.","Answer in Spanish."));
        mChapter1.addWord(new VocabWord("Abran el libro.","Open the book."));
        mChapter1.addWord(new VocabWord("Cierren el libro.","Close the book."));
        mChapter1.addWord(new VocabWord("¿Hay preguntas?","Are there questions?"));
        mChapter1.addWord(new VocabWord("¡Silencio!","Quiet!"));
        mChapter1.addWord(new VocabWord("Miren.","Look."));
        mChapter1.addWord(new VocabWord("Por favor.","Please."));
        mChapter1.addWord(new VocabWord("domingo","Sunday"));
        mChapter1.addWord(new VocabWord("lunes","Monday"));
        mChapter1.addWord(new VocabWord("martes","Tuesday"));
        mChapter1.addWord(new VocabWord("miércoles","Wednesday"));
        mChapter1.addWord(new VocabWord("jueves","Thursday"));
        mChapter1.addWord(new VocabWord("viernes","Friday"));
        mChapter1.addWord(new VocabWord("sábado","Saturday"));
        mChapter1.addWord(new VocabWord("Hoy es . . .","Today is . . ."));
        mChapter1.addWord(new VocabWord("Ayer fue . . .","Yesterday was  . . ."));
        mChapter1.addWord(new VocabWord("Mañana será . . .","Tomorrow will be . . ."));
        mChapter1.addWord(new VocabWord("una congregación","a congregation"));
        mChapter1.addWord(new VocabWord("una iglesia","a church"));
        mChapter1.addWord(new VocabWord("un predicador","a preacher"));
        mChapter1.addWord(new VocabWord("un coro","a choir"));
        mChapter1.addWord(new VocabWord("un himnario","a hymnal"));
        mChapter1.addWord(new VocabWord("un(a) cristiano(a)","a Christian"));
        mChapter1.addWord(new VocabWord("una Biblia","a Bible"));
        mChapter1.addWord(new VocabWord("un creyente","a believer"));
        mChapter1.addWord(new VocabWord("un misionero","a missionary"));
        mChapter1.addWord(new VocabWord("un Nuevo Testamento","a New Testament"));
        mChapter1.addWord(new VocabWord("una oración","a prayer"));
        mChapter1.addWord(new VocabWord("un pastor","a pastor / a shepherd"));
        mChapter1.addWord(new VocabWord("un himno","a hymn"));
        mChapter1.addWord(new VocabWord("una cruz","a cross"));
        mChapter1.addWord(new VocabWord("El Señor","Lord"));
        mChapter1.addWord(new VocabWord("Jesucristo","Jesus Christ"));
        mChapter1.addWord(new VocabWord("Dios","God"));
        mChapter1.addWord(new VocabWord("Jehová","Jehovah"));
        mChapter1.addWord(new VocabWord("Salmo","Psalms"));
        mChapter1.addWord(new VocabWord("Jehová es mi pastor, nada me faltará.  Salmo 23:1","The Lord is my shepherd, I shall not want. Psalms 23:1"));
        mChapter1.addWord(new VocabWord("Voy","I am going"));
        mChapter1.addWord(new VocabWord("Ven conmigo","Come with me"));
        mChapter1.addWord(new VocabWord("El Señor les bendiga","May the Lord bless you"));
        mChapter1.addWord(new VocabWord("El va a predicar hoy","He is going to preach today"));
        mChapter1.addWord(new VocabWord("Predicador","Preacher"));
        mChapter1.addWord(new VocabWord("por invitarme","for inviting me"));
        mChapter1.addWord(new VocabWord("por acompañarme","for going with me"));
    }
}
