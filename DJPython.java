import java.util.Scanner;
public class DJPython {
    static char comillas = '"';
    static void pausar() {  //metodo para pausas de informacion
        System.out.println("\nPresiona ENTER para continuar...");
        try {
            System.in.read();//leer un caracter
        } catch (Exception e) {
            // Ignorar errores
        }
    }
    static boolean ejecutando = true;
    static String[] qstarm1;//arreglos de preguntas
    static String[] qstarm1opc1;//arreglos de opciones
    static String[] qstarm1opc2;
    static String[] qstarm1opc3;
    static String[] qstarm1opc4;
    static String[] qstarm2;
    static String[] qstarm2opc1;
    static String[] qstarm2opc2;
    static String[] qstarm2opc3;
    static String[] qstarm2opc4;
    static String[] qstarm3;
    static String[] qstarm3opc1;
    static String[] qstarm3opc2;
    static String[] qstarm3opc3;
    static String[] qstarm3opc4;
    static String[] qstteo1;
    static String[] qstteo1opc1;
    static String[] qstteo1opc2;
    static String[] qstteo1opc3;
    static String[] qstteo1opc4;
    static String[] qstteo2;
    static String[] qstteo2opc1;
    static String[] qstteo2opc2;
    static String[] qstteo2opc3;
    static String[] qstteo2opc4;
    static String[] qstteo3;
    static String[] qstteo3opc1;
    static String[] qstteo3opc2;
    static String[] qstteo3opc3;
    static String[] qstteo3opc4;
    static int aciertos;//cuestionarios
    static int errores;//cuestionarios
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        while (ejecutando){
            proceso1();
        }
    }
    public static void proceso1() {
        menu();
        int userinput = scanner.nextInt();
        switch (userinput) {
            case 1: descubrimiento();
                break;
            case 2: teoria();
                break;
            case 3: equipo();
                break;
            case 4: librerias();
                break;
            case 5:
                ejecutando = false;
                break;
            default:
                System.out.println("Opción inválida, escribir una opción válida");
                pausar();
                proceso1();
                break;
        }
    }
    public static void menu(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                      Elija la Sección Deseada                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  1. Descubrimiento Musical                         |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  2. Teoría Musical                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  3. Equipo de Audio                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  4. Librerias                                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  5. Salir del programa                             |");
        System.out.println("        |____________________________________________________________________|");}
    public static void descubrimiento(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija el Genero Musical Deseado                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Rock                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Pop                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Folk                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Indie                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Hip-Hop / Rap                        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            6. R&B                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            7. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        desint();}
    public static void desint() { //lector de descubrimiento
        int userdesinput = scanner.nextInt();
        switch (userdesinput) {
            case 1: rockdesint();
                break;
            case 2: popdesint();
                break;
            case 3: folkdesint();
                break;
            case 4: indiedesint();
                break;
            case 5: hipdesint();
                break;
            case 6: rbdesint();
                break;
            case 7: proceso1();
                break;
            default:
                System.out.println("Opcion Invalida, elegir una opción válida");
                pausar();
                descubrimiento();
                break;
        }
    }
    public static void desmenu(){ //menu de los generos de descubrimiento
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Generos Similares                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Artistas                             |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Albumes                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
    }
    //modulo de rock
    public static void rockdesint() {
        desmenu();
        int rockdesint = scanner.nextInt();
        switch (rockdesint) {
            case 1: similarrock();
                pausar();
                rockdesint();
                break;
            case 2: artistasrock();
                pausar();
                rockdesint();
                break;
            case 3: albumrock();
                pausar();
                rockdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccionar una opción válida");
                pausar();
                rockdesint();
                break;
        }
    }
    private static void albumrock() {//lista de albumes de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |            The Dark Side of the Moon - Pink Floyd (1973)           |");
        System.out.println("        |                   Abbey Road – The Beatles (1969)                  |");
        System.out.println("        |                     Back in Black – AC/DC (1980)                   |");
        System.out.println("        |                Led Zeppelin IV – Led Zeppelin (1971)               |");
        System.out.println("        |                 A Night at the Opera – Queen (1975)                |");
        System.out.println("        |            Californication – Red Hot Chili Peppers (1999)          |");
        System.out.println("        |                   OK Computer – Radiohead (1997)                   |");
        System.out.println("        |                    The Joshua Tree – U2 (1987)                     |");
        System.out.println("        |                    The Wall – Pink Floyd (1979)                    |");
        System.out.println("        |                   Is This It – The Strokes (2001)                  |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void artistasrock() {//lista de artistas de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                            Led Zeppelin                            |");
        System.out.println("        |                             Pink Floyd                             |");
        System.out.println("        |                               Queen                                |");
        System.out.println("        |                         The Rolling Stones                         |");
        System.out.println("        |                            The Beatles                             |");
        System.out.println("        |                               AC/DC                                |");
        System.out.println("        |                            Foo Fighters                            |");
        System.out.println("        |                            Guns N’ Roses                           |");
        System.out.println("        |                             The Strokes                            |");
        System.out.println("        |                        Red Hot Chili Peppers                       |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void similarrock() { //lista de generos similaresal rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                               Blues                                |");
        System.out.println("        |                               Punk                                 |");
        System.out.println("        |                               Metal                                |");
        System.out.println("        |____________________________________________________________________|");
    }
    //modulo de pop
    public static void popdesint(){//lector de pop
        desmenu();
        int popdesint = scanner.nextInt();
        switch (popdesint) {
            case 1: similarpop();
                pausar();
                popdesint();
                break;
            case 2: artistaspop();
                pausar();
                popdesint();
                break;
            case 3: albumpop();
                pausar();
                popdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccionar una opción válida");
                pausar();
                popdesint();
                break;
        }
    }
    private static void albumpop() {//lista de albumes de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                  Thriller – Michael Jackson (1982)                 |");
        System.out.println("        |                 Future Nostalgia – Dua Lipa (2020)                 |");
        System.out.println("        |                  Teenage Dream – Katy Perry (2010)                 |");
        System.out.println("        |                  Born This Way – Lady Gaga (2011)                  |");
        System.out.println("        |            Confessions on a Dance Floor – Madonna (2005)           |");
        System.out.println("        |                        X – Ed Sheeran (2014)                       |");
        System.out.println("        |                          25 – Adele (2015)                         |");
        System.out.println("        |                    Revival – Selena Gomez (2015)                   |");
        System.out.println("        |                   Fine Line – Harry Styles (2019)                  |");
        System.out.println("        |           FutureSex/LoveSounds – Justin Timberlake (2006)          |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void artistaspop() {//lista de artistas de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           Michael Jackson                          |");
        System.out.println("        |                            Taylor Swift                            |");
        System.out.println("        |                              Dua Lipa                              |");
        System.out.println("        |                            Harry Styles                            |");
        System.out.println("        |                             Lady Gaga                              |");
        System.out.println("        |                           Ariana Grande                            |");
        System.out.println("        |                         Justin Timberlake                          |");
        System.out.println("        |                             Bruno Mars                             |");
        System.out.println("        |                               Adele                                |");
        System.out.println("        |                           Billie Eilish                            |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void similarpop() {//lista de generos similares al pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                               Dance                                |");
        System.out.println("        |                                EDM                                 |");
        System.out.println("        |                                R&B                                 |");
        System.out.println("        |                             Synthwave                              |");
        System.out.println("        |                            Electropop                              |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo de folk
    public static void folkdesint() {//lector de folk
        desmenu();
        int folkdesint = scanner.nextInt();
        switch (folkdesint) {
            case 1: similarfolk();
                pausar();
                folkdesint();
                break;
            case 2: artistasfolk();
                pausar();
                folkdesint();
                break;
            case 3: albumfolk();
                pausar();
                folkdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccionar una opción válida");
                pausar();
                folkdesint();
                break;
        }
    }
    private static void albumfolk() {//lista de albumes de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          albumes de folk                           |");
        System.out.println("        |____________________________________________________________________|");
    }
    private static void artistasfolk() {//lista de artistas de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          artistas de folk                          |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarfolk() {//lista de generos similares al folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     generos similares al folk                      |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo de indie
    public static void indiedesint(){//lector de indie
        desmenu();
        int indiedesint = scanner.nextInt();
        switch (indiedesint) {
            case 1: similarindie();
                pausar();
                indiedesint();
                break;
            case 2: artistasindie();
                pausar();
                indiedesint();
                break;
            case 3: albumindie();
                pausar();
                indiedesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccionar una opción válida");
                pausar();
                indiedesint();
                break;
        }
    }
    private static void albumindie() {//lista de albumes de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          albumes de indie                          |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void artistasindie() {//lista de artistas de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         artistas de indie                          |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarindie() {// lista de generos similares al indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     generos similares al indie                     |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo hip hop
    public static void hipdesint(){//lector de hip hop
        desmenu();
        int hipdesint = scanner.nextInt();
        switch (hipdesint) {
            case 1: similarhip();
                pausar();
                hipdesint();
                break;
            case 2: artistaship();
                pausar();
                hipdesint();
                break;
            case 3: albumhip();
                pausar();
                hipdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccionar una opción válida");
                pausar();
                hipdesint();
                break;
        }
    }
    private static void albumhip() {//lista de albumes de hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         albumes de hip hop                         |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void artistaship() {//lista de artistas de hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                        artistas de hip hop                         |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarhip() {//lista de generos similares al hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                    generos similares al hip hop                    |");
        System.out.println("        |____________________________________________________________________|");    }
    //modulo R%B
    public static void rbdesint(){//lector de R&B
        desmenu();
        int rbdesint = scanner.nextInt();
        switch (rbdesint) {
            case 1: similarrb();
                pausar();
                rbdesint();
                break;
            case 2: artistasrb();
                pausar();
                rbdesint();
                break;
            case 3: albumrb();
                pausar();
                rbdesint();
                break;
            case 4: descubrimiento();
                break;
            default:
                System.out.println("La opción es inválida, seleccionar una opción válida");
                pausar();
                rbdesint();
                break;
        }
    }
    private static void albumrb() {//lista de albumes de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           albumes de R&B                           |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void artistasrb() {//lista de artistas de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          artistas de R&B                           |");
        System.out.println("        |____________________________________________________________________|");    }
    private static void similarrb() { //lista de generos simolates al rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                      generos similares al R&B                      |");
        System.out.println("        |____________________________________________________________________|");    }
    //acaba el descubrimiento musical
    public static void teoria(){//inicia teoria musical
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Armonía                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Melodía                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Cuestionarios                        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        teoint();}
    public static void teoint(){//lectura de teoria musical
        int userteoinput = scanner.nextInt();
        switch (userteoinput) {
            case 1: armonia();
                break;
            case 2: melodia();
                break;
            case 3: cuestionarios();
                break;
            case 4: proceso1();
                break;
            default:
                System.out.println("Opción inválida, introduce una opcion válida");
                pausar();
                teoria();
                break;
        }
    }
    private static void melodia() {//aqui va la teoria de la meoldia musical
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        | En teoría musical, una melodía, también llamada tono, voz o línea, |");
        System.out.println("        | son una serie de eventos lineales sonoros o una sucesión, pero no  |");
        System.out.println("        | una simultaneidad como es el caso de los acordes. Sin embargo,     |");
        System.out.println("        | esta sucesión debe contener cambios de algún tipo y ser percibida  |");
        System.out.println("        | como una sola entidad para ser llamada melodía. La podemos definir |");
        System.out.println("        | como la sucesión de sonidos graves y agudos en un tiempo determi-  |");
        System.out.println("        | nado.                                                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        | El cambio es necesario para los eventos que son entendidos como    |");
        System.out.println("        | relacionados o no relacionados. Usualmente las melodías constan de |");
        System.out.println("        | una o más frases musicales, es decir, "+ comillas + "motivos" + comillas + " y son por lo gene- |");
        System.out.println("        | ral, repetidas a lo largo de una canción o pieza en varias formas. |");
        System.out.println("        |                                                                    |");
        System.out.println("        | La mayoría de la música occidental utiliza la escala de 12 tonos.  |");
        System.out.println("        | Los elementos esenciales de la melodía son: duración, altura, cua- |");
        System.out.println("        | lidad, textura e intensidad.                                       |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        teoria();
    }
    private static void armonia() {//aqui va la teoria de armonia musical
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        | La armonía musical es el estudio y la práctica de combinar notas   |");
        System.out.println("        | simultáneas, formando acordes, así como de cómo esos acordes pro-  |");
        System.out.println("        | gresan a lo largo de una pieza.                                    |");
        System.out.println("        | Representan el aspecto del sonido musical que puede generar ten-   |");
        System.out.println("        | sión (disonancia) y resolución (consonancia) según su estructura.  |");
        System.out.println("        | El término armonía deriva del griego ἁρμονία (harmonía), que sig-  |");
        System.out.println("        | nifica " + comillas + "conjunto, acuerdo, concordia" + comillas + ", del verbo ἁρμόζω (harmozo)  |");
        System.out.println("        | " + comillas + "encajar" + comillas + " o " + comillas + "unir" + comillas + ".                                                |");
        System.out.println("        | Finalmente, la armonía aporta estructura, color emocional y sopor- |");
        System.out.println("        | te a la melodía, influenciando cómo percibimos la música.          |");
        System.out.println("        | Algunos elementos básicos de la armonía son: intervalos, acordes,  |");
        System.out.println("        | progresiones, tonalidad y modalidad, modulación y ritmo armónico.  |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        teoria();
    }
    public static void cuestionarios(){//menu de cuestionarios
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                    Elija El Cuestionario Deseado                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Armonia 1                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Armonia 2                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Armonia 3                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Teoria  1                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Teoria  2                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            6. Teoria  3                            |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            7. Salir                                |");
        System.out.println("        |____________________________________________________________________|");
        qstint();}
    public static void qstint(){//lectura de cuestionarios
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: armonia1();
                break;
            case 2: armonia2();
                break;
            case 3: armonia3();
                break;
            case 4: teoria1();
                break;
            case 5: teoria2();
                break;
            case 6: teoria3();
                break;
            case 7: teoria();
                break;
            default:
                System.out.println("Opción inválida");
                pausar();
                cuestionarios();
                break;
        }
    }
    private static void menucuestionarios(){//menu de los cuestionarios
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Consta de 10 preguntas                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                             1. Iniciar                             |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                             2. Volver                              |");
        System.out.println("        |____________________________________________________________________|");
    }
    //nota: aquí inician los cuestionarios, en cada uno de ellos es necesario cambiar los resultados y las preguntas que estan asignadas al inicio de cada modulo
    //nota2: para el formato de cuadro (DJPython) de izquiera a derecha siempre va a ser de 5 espacios, pero la separacion a la derecha se cambia manualmente en ña pregunta
    private static void teoria3(){
        screen();//aqui se modifica el tema y subtema del cuestionario2
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Teoria 3                       |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: teoria3_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("Opción inválida");
                pausar();
                teoria3();
                break;
        }
    }
    private static void teoria3_1() {
        aciertos=0;
        errores=0;
        qstteo3 = new String[10];
        qstteo3opc1 = new String[10];
        qstteo3opc2 = new String[10];
        qstteo3opc3 = new String[10];
        qstteo3opc4 = new String[10];
        qstteo3[0]= "Pregunta 1 teo3                                     |";//asignacion para las preguntas
        qstteo3[1]= "Pregunta 2 teo3                                     |";//para el formato de cuadro llena 52 espacios y "|"
        qstteo3[2]= "Pregunta 3 teo3                                     |";
        qstteo3[3]= "Pregunta 4 teo3                                     |";
        qstteo3[4]= "Pregunta 5 teo3                                     |";
        qstteo3[5]= "Pregunta 6 teo3                                     |";
        qstteo3[6]= "Pregunta 7 teo3                                     |";
        qstteo3[7]= "Pregunta 8 teo3                                     |";
        qstteo3[8]= "Pregunta 9 teo3                                     |";
        qstteo3[9]= "Pregunta 10 teo3                                   |";
        qstteo3opc1[0]="opcion 1 teo3 pregunta 1                           |";//opcion 1
        qstteo3opc1[1]="opcion 1 teo3 pregunta 2                           |";//para el formato de cuadro llena 51 espacios y "|"
        qstteo3opc1[2]="opcion 1 teo3 pregunta 3                           |";
        qstteo3opc1[3]="opcion 1 teo3 pregunta 4                           |";
        qstteo3opc1[4]="opcion 1 teo3 pregunta 5                           |";
        qstteo3opc1[5]="opcion 1 teo3 pregunta 6                           |";
        qstteo3opc1[6]="opcion 1 teo3 pregunta 7                           |";
        qstteo3opc1[7]="opcion 1 teo3 pregunta 8                           |";
        qstteo3opc1[8]="opcion 1 teo3 pregunta 9                           |";
        qstteo3opc1[9]="opcion 1 teo3 pregunta 10                          |";
        qstteo3opc2[0]="opcion 2 teo3 pregunta 1                           |";//opcion 2
        qstteo3opc2[1]="opcion 2 teo3 pregunta 2                           |";
        qstteo3opc2[2]="opcion 2 teo3 pregunta 3                           |";
        qstteo3opc2[3]="opcion 2 teo3 pregunta 4                           |";
        qstteo3opc2[4]="opcion 2 teo3 pregunta 5                           |";
        qstteo3opc2[5]="opcion 2 teo3 pregunta 6                           |";
        qstteo3opc2[6]="opcion 2 teo3 pregunta 7                           |";
        qstteo3opc2[7]="opcion 2 teo3 pregunta 8                           |";
        qstteo3opc2[8]="opcion 2 teo3 pregunta 9                           |";
        qstteo3opc2[9]="opcion 2 teo3 pregunta 10                          |";
        qstteo3opc3[0]="opcion 3 teo3 pregunta 1                           |";//opcion 3
        qstteo3opc3[1]="opcion 3 teo3 pregunta 2                           |";
        qstteo3opc3[2]="opcion 3 teo3 pregunta 3                           |";
        qstteo3opc3[3]="opcion 3 teo3 pregunta 4                           |";
        qstteo3opc3[4]="opcion 3 teo3 pregunta 5                           |";
        qstteo3opc3[5]="opcion 3 teo3 pregunta 6                           |";
        qstteo3opc3[6]="opcion 3 teo3 pregunta 7                           |";
        qstteo3opc3[7]="opcion 3 teo3 pregunta 8                           |";
        qstteo3opc3[8]="opcion 3 teo3 pregunta 9                           |";
        qstteo3opc3[9]="opcion 3 teo3 pregunta 10                          |";
        qstteo3opc4[0]="opcion 4 teo3 pregunta 1                           |";//opcion 4
        qstteo3opc4[1]="opcion 4 teo3 pregunta 2                           |";
        qstteo3opc4[2]="opcion 4 teo3 pregunta 3                           |";
        qstteo3opc4[3]="opcion 4 teo3 pregunta 4                           |";
        qstteo3opc4[4]="opcion 4 teo3 pregunta 5                           |";
        qstteo3opc4[5]="opcion 4 teo3 pregunta 6                           |";
        qstteo3opc4[6]="opcion 4 teo3 pregunta 7                           |";
        qstteo3opc4[7]="opcion 4 teo3 pregunta 8                           |";
        qstteo3opc4[8]="opcion 4 teo3 pregunta 9                           |";
        qstteo3opc4[9]="opcion 4 teo3 pregunta 10                          |";
        int[] respuestasCorrectas = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstteo3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     1) Opción 1 ");
            System.out.println(qstteo3opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     2) Opción 2 ");
            System.out.println(qstteo3opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     3) Opción 3 ");
            System.out.println(qstteo3opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     4) Opción 4 ");
            System.out.println(qstteo3opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("Opción inválida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |     Resultados del cuestionario:                                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Errores: " + errores+"                                                     |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        cuestionarios();
    }
    private static void teoria2() {
        screen();//aqui se modifica el tema y subtema del cuestionario2
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Teoria 2                       |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: teoria2_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("Opción inválida");
                pausar();
                teoria2();
                break;
        }
    }
    private static void teoria2_1() {

        aciertos=0;
        errores=0;
        qstteo2 = new String[10];
        qstteo2opc1 = new String[10];
        qstteo2opc2 = new String[10];
        qstteo2opc3 = new String[10];
        qstteo2opc4 = new String[10];
        qstteo2[0]= "Pregunta 1 teo2                                     |";//asignacion para las preguntas
        qstteo2[1]= "Pregunta 2 teo2                                     |";//para el formato de cuadro llena 52 espacios y "|"
        qstteo2[2]= "Pregunta 3 teo2                                     |";
        qstteo2[3]= "Pregunta 4 teo2                                     |";
        qstteo2[4]= "Pregunta 5 teo2                                     |";
        qstteo2[5]= "Pregunta 6 teo2                                     |";
        qstteo2[6]= "Pregunta 7 teo2                                     |";
        qstteo2[7]= "Pregunta 8 teo2                                     |";
        qstteo2[8]= "Pregunta 9 teo2                                     |";
        qstteo2[9]= "Pregunta 10 teo2                                   |";
        qstteo2opc1[0]="opcion 1 teo2 pregunta 1                           |";//opcion 1
        qstteo2opc1[1]="opcion 1 teo2 pregunta 2                           |";//para el formato de cuadro llena 51 espacios y "|"
        qstteo2opc1[2]="opcion 1 teo2 pregunta 3                           |";
        qstteo2opc1[3]="opcion 1 teo2 pregunta 4                           |";
        qstteo2opc1[4]="opcion 1 teo2 pregunta 5                           |";
        qstteo2opc1[5]="opcion 1 teo2 pregunta 6                           |";
        qstteo2opc1[6]="opcion 1 teo2 pregunta 7                           |";
        qstteo2opc1[7]="opcion 1 teo2 pregunta 8                           |";
        qstteo2opc1[8]="opcion 1 teo2 pregunta 9                           |";
        qstteo2opc1[9]="opcion 1 teo2 pregunta 10                          |";
        qstteo2opc2[0]="opcion 2 teo2 pregunta 1                           |";//opcion 2
        qstteo2opc2[1]="opcion 2 teo2 pregunta 2                           |";
        qstteo2opc2[2]="opcion 2 teo2 pregunta 3                           |";
        qstteo2opc2[3]="opcion 2 teo2 pregunta 4                           |";
        qstteo2opc2[4]="opcion 2 teo2 pregunta 5                           |";
        qstteo2opc2[5]="opcion 2 teo2 pregunta 6                           |";
        qstteo2opc2[6]="opcion 2 teo2 pregunta 7                           |";
        qstteo2opc2[7]="opcion 2 teo2 pregunta 8                           |";
        qstteo2opc2[8]="opcion 2 teo2 pregunta 9                           |";
        qstteo2opc2[9]="opcion 2 teo2 pregunta 10                          |";
        qstteo2opc3[0]="opcion 3 teo2 pregunta 1                           |";//opcion 3
        qstteo2opc3[1]="opcion 3 teo2 pregunta 2                           |";
        qstteo2opc3[2]="opcion 3 teo2 pregunta 3                           |";
        qstteo2opc3[3]="opcion 3 teo2 pregunta 4                           |";
        qstteo2opc3[4]="opcion 3 teo2 pregunta 5                           |";
        qstteo2opc3[5]="opcion 3 teo2 pregunta 6                           |";
        qstteo2opc3[6]="opcion 3 teo2 pregunta 7                           |";
        qstteo2opc3[7]="opcion 3 teo2 pregunta 8                           |";
        qstteo2opc3[8]="opcion 3 teo2 pregunta 9                           |";
        qstteo2opc3[9]="opcion 3 teo2 pregunta 10                          |";
        qstteo2opc4[0]="opcion 4 teo2 pregunta 1                           |";//opcion 4
        qstteo2opc4[1]="opcion 4 teo2 pregunta 2                           |";
        qstteo2opc4[2]="opcion 4 teo2 pregunta 3                           |";
        qstteo2opc4[3]="opcion 4 teo2 pregunta 4                           |";
        qstteo2opc4[4]="opcion 4 teo2 pregunta 5                           |";
        qstteo2opc4[5]="opcion 4 teo2 pregunta 6                           |";
        qstteo2opc4[6]="opcion 4 teo2 pregunta 7                           |";
        qstteo2opc4[7]="opcion 4 teo2 pregunta 8                           |";
        qstteo2opc4[8]="opcion 4 teo2 pregunta 9                           |";
        qstteo2opc4[9]="opcion 4 teo2 pregunta 10                          |";
        int[] respuestasCorrectas = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstteo2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     1) Opción 1 ");
            System.out.println(qstteo2opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     2) Opción 2 ");
            System.out.println(qstteo2opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     3) Opción 3 ");
            System.out.println(qstteo2opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     4) Opción 4 ");
            System.out.println(qstteo2opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("Opción inválida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |     Resultados del cuestionario:                                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Errores: " + errores+"                                                     |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        cuestionarios();
    }
    private static void teoria1() {
        screen();//aqui se modifica el tema y subtema del cuestionario2
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Teoria 1                       |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: teoria1_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("Opción inválida");
                pausar();
                teoria1();
                break;
        }
    }
    private static void teoria1_1() {

        aciertos=0;
        errores=0;
        qstteo1 = new String[10];
        qstteo1opc1 = new String[10];
        qstteo1opc2 = new String[10];
        qstteo1opc3 = new String[10];
        qstteo1opc4 = new String[10];
        qstteo1[0]= "Pregunta 1 teo1                                     |";//asignacion para las preguntas
        qstteo1[1]= "Pregunta 2 teo1                                     |";//para el formato de cuadro llena 52 espacios y "|"
        qstteo1[2]= "Pregunta 3 teo1                                     |";
        qstteo1[3]= "Pregunta 4 teo1                                     |";
        qstteo1[4]= "Pregunta 5 teo1                                     |";
        qstteo1[5]= "Pregunta 6 teo1                                     |";
        qstteo1[6]= "Pregunta 7 teo1                                     |";
        qstteo1[7]= "Pregunta 8 teo1                                     |";
        qstteo1[8]= "Pregunta 9 teo1                                     |";
        qstteo1[9]= "Pregunta 10 teo1                                   |";
        qstteo1opc1[0]="opcion 1 teo1 pregunta 1                           |";//opcion 1
        qstteo1opc1[1]="opcion 1 teo1 pregunta 2                           |";//para el formato de cuadro llena 51 espacios y "|"
        qstteo1opc1[2]="opcion 1 teo1 pregunta 3                           |";
        qstteo1opc1[3]="opcion 1 teo1 pregunta 4                           |";
        qstteo1opc1[4]="opcion 1 teo1 pregunta 5                           |";
        qstteo1opc1[5]="opcion 1 teo1 pregunta 6                           |";
        qstteo1opc1[6]="opcion 1 teo1 pregunta 7                           |";
        qstteo1opc1[7]="opcion 1 teo1 pregunta 8                           |";
        qstteo1opc1[8]="opcion 1 teo1 pregunta 9                           |";
        qstteo1opc1[9]="opcion 1 teo1 pregunta 10                          |";
        qstteo1opc2[0]="opcion 2 teo1 pregunta 1                           |";//opcion 2
        qstteo1opc2[1]="opcion 2 teo1 pregunta 2                           |";
        qstteo1opc2[2]="opcion 2 teo1 pregunta 3                           |";
        qstteo1opc2[3]="opcion 2 teo1 pregunta 4                           |";
        qstteo1opc2[4]="opcion 2 teo1 pregunta 5                           |";
        qstteo1opc2[5]="opcion 2 teo1 pregunta 6                           |";
        qstteo1opc2[6]="opcion 2 teo1 pregunta 7                           |";
        qstteo1opc2[7]="opcion 2 teo1 pregunta 8                           |";
        qstteo1opc2[8]="opcion 2 teo1 pregunta 9                           |";
        qstteo1opc2[9]="opcion 2 teo1 pregunta 10                          |";
        qstteo1opc3[0]="opcion 3 teo1 pregunta 1                           |";//opcion 3
        qstteo1opc3[1]="opcion 3 teo1 pregunta 2                           |";
        qstteo1opc3[2]="opcion 3 teo1 pregunta 3                           |";
        qstteo1opc3[3]="opcion 3 teo1 pregunta 4                           |";
        qstteo1opc3[4]="opcion 3 teo1 pregunta 5                           |";
        qstteo1opc3[5]="opcion 3 teo1 pregunta 6                           |";
        qstteo1opc3[6]="opcion 3 teo1 pregunta 7                           |";
        qstteo1opc3[7]="opcion 3 teo1 pregunta 8                           |";
        qstteo1opc3[8]="opcion 3 teo1 pregunta 9                           |";
        qstteo1opc3[9]="opcion 3 teo1 pregunta 10                          |";
        qstteo1opc4[0]="opcion 4 teo1 pregunta 1                           |";//opcion 4
        qstteo1opc4[1]="opcion 4 teo1 pregunta 2                           |";
        qstteo1opc4[2]="opcion 4 teo1 pregunta 3                           |";
        qstteo1opc4[3]="opcion 4 teo1 pregunta 4                           |";
        qstteo1opc4[4]="opcion 4 teo1 pregunta 5                           |";
        qstteo1opc4[5]="opcion 4 teo1 pregunta 6                           |";
        qstteo1opc4[6]="opcion 4 teo1 pregunta 7                           |";
        qstteo1opc4[7]="opcion 4 teo1 pregunta 8                           |";
        qstteo1opc4[8]="opcion 4 teo1 pregunta 9                           |";
        qstteo1opc4[9]="opcion 4 teo1 pregunta 10                          |";
        int[] respuestasCorrectas = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstteo1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     1) Opción 1 ");
            System.out.println(qstteo1opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     2) Opción 2 ");
            System.out.println(qstteo1opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     3) Opción 3 ");
            System.out.println(qstteo1opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     4) Opción 4 ");
            System.out.println(qstteo1opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("Opción inválida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |     Resultados del cuestionario:                                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Errores: " + errores+"                                                     |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        cuestionarios();
    }
    private static void armonia3() {
        screen();//aqui se modifica el tema y subtema del cuestionario
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Armonia 3                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: armonia3_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("Opción inválida");
                pausar();
                armonia3();
                break;
        }
    }

    private static void armonia3_1() {
        aciertos=0;
        errores=0;
        qstarm3 = new String[10];
        qstarm3opc1 = new String[10];
        qstarm3opc2 = new String[10];
        qstarm3opc3 = new String[10];
        qstarm3opc4 = new String[10];
        qstarm3[0]= "Pregunta 1 arm3                                     |";//asignacion para las preguntas
        qstarm3[1]= "Pregunta 2 arm3                                     |";//para el formato de cuadro llena 52 espacios y "|"
        qstarm3[2]= "Pregunta 3 arm3                                     |";
        qstarm3[3]= "Pregunta 4 arm3                                     |";
        qstarm3[4]= "Pregunta 5 arm3                                     |";
        qstarm3[5]= "Pregunta 6 arm3                                     |";
        qstarm3[6]= "Pregunta 7 arm3                                     |";
        qstarm3[7]= "Pregunta 8 arm3                                     |";
        qstarm3[8]= "Pregunta 9 arm3                                     |";
        qstarm3[9]= "Pregunta 10 arm3                                   |";
        qstarm3opc1[0]="opcion 1 arm3 pregunta 1                           |";//opcion 1
        qstarm3opc1[1]="opcion 1 arm3 pregunta 2                           |";//para el formato de cuadro llena 51 espacios y "|"
        qstarm3opc1[2]="opcion 1 arm3 pregunta 3                           |";
        qstarm3opc1[3]="opcion 1 arm3 pregunta 4                           |";
        qstarm3opc1[4]="opcion 1 arm3 pregunta 5                           |";
        qstarm3opc1[5]="opcion 1 arm3 pregunta 6                           |";
        qstarm3opc1[6]="opcion 1 arm3 pregunta 7                           |";
        qstarm3opc1[7]="opcion 1 arm3 pregunta 8                           |";
        qstarm3opc1[8]="opcion 1 arm3 pregunta 9                           |";
        qstarm3opc1[9]="opcion 1 arm3 pregunta 10                          |";
        qstarm3opc2[0]="opcion 2 arm3 pregunta 1                           |";//opcion 2
        qstarm3opc2[1]="opcion 2 arm3 pregunta 2                           |";
        qstarm3opc2[2]="opcion 2 arm3 pregunta 3                           |";
        qstarm3opc2[3]="opcion 2 arm3 pregunta 4                           |";
        qstarm3opc2[4]="opcion 2 arm3 pregunta 5                           |";
        qstarm3opc2[5]="opcion 2 arm3 pregunta 6                           |";
        qstarm3opc2[6]="opcion 2 arm3 pregunta 7                           |";
        qstarm3opc2[7]="opcion 2 arm3 pregunta 8                           |";
        qstarm3opc2[8]="opcion 2 arm3 pregunta 9                           |";
        qstarm3opc2[9]="opcion 2 arm3 pregunta 10                          |";
        qstarm3opc3[0]="opcion 3 arm3 pregunta 1                           |";//opcion 3
        qstarm3opc3[1]="opcion 3 arm3 pregunta 2                           |";
        qstarm3opc3[2]="opcion 3 arm3 pregunta 3                           |";
        qstarm3opc3[3]="opcion 3 arm3 pregunta 4                           |";
        qstarm3opc3[4]="opcion 3 arm3 pregunta 5                           |";
        qstarm3opc3[5]="opcion 3 arm3 pregunta 6                           |";
        qstarm3opc3[6]="opcion 3 arm3 pregunta 7                           |";
        qstarm3opc3[7]="opcion 3 arm3 pregunta 8                           |";
        qstarm3opc3[8]="opcion 3 arm3 pregunta 9                           |";
        qstarm3opc3[9]="opcion 3 arm3 pregunta 10                          |";
        qstarm3opc4[0]="opcion 4 arm3 pregunta 1                           |";//opcion 4
        qstarm3opc4[1]="opcion 4 arm3 pregunta 2                           |";
        qstarm3opc4[2]="opcion 4 arm3 pregunta 3                           |";
        qstarm3opc4[3]="opcion 4 arm3 pregunta 4                           |";
        qstarm3opc4[4]="opcion 4 arm3 pregunta 5                           |";
        qstarm3opc4[5]="opcion 4 arm3 pregunta 6                           |";
        qstarm3opc4[6]="opcion 4 arm3 pregunta 7                           |";
        qstarm3opc4[7]="opcion 4 arm3 pregunta 8                           |";
        qstarm3opc4[8]="opcion 4 arm3 pregunta 9                           |";
        qstarm3opc4[9]="opcion 4 arm3 pregunta 10                          |";
        int[] respuestasCorrectas = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstarm3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     1) Opción 1 ");
            System.out.println(qstarm3opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     2) Opción 2 ");
            System.out.println(qstarm3opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     3) Opción 3 ");
            System.out.println(qstarm3opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     4) Opción 4 ");
            System.out.println(qstarm3opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("Opción inválida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |     Resultados del cuestionario:                                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Errores: " + errores+"                                                     |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        cuestionarios();
    }
    private static void armonia2(){
        screen();//aqui se modifica el tema y subtema del cuestionario
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Armonia 2                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: armonia2_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("Opción inválida");
                pausar();
                armonia2();
                break;
        }
    }
    private static void armonia2_1() {
        aciertos=0;
        errores=0;
        qstarm2 = new String[10];
        qstarm2opc1 = new String[10];
        qstarm2opc2 = new String[10];
        qstarm2opc3 = new String[10];
        qstarm2opc4 = new String[10];
        qstarm2[0]= "Pregunta 1 arm2                                     |";//asignacion para las preguntas
        qstarm2[1]= "Pregunta 2 arm2                                     |";//para el formato de cuadro llena 52 espacios y "|"
        qstarm2[2]= "Pregunta 3 arm2                                     |";
        qstarm2[3]= "Pregunta 4 arm2                                     |";
        qstarm2[4]= "Pregunta 5 arm2                                     |";
        qstarm2[5]= "Pregunta 6 arm2                                     |";
        qstarm2[6]= "Pregunta 7 arm2                                     |";
        qstarm2[7]= "Pregunta 8 arm2                                     |";
        qstarm2[8]= "Pregunta 9 arm2                                     |";
        qstarm2[9]= "Pregunta 10 arm2                                   |";
        qstarm2opc1[0]="opcion 1 arm2 pregunta 1                           |";//opcion 1
        qstarm2opc1[1]="opcion 1 arm2 pregunta 2                           |";//para el formato de cuadro llena 51 espacios y "|"
        qstarm2opc1[2]="opcion 1 arm2 pregunta 3                           |";
        qstarm2opc1[3]="opcion 1 arm2 pregunta 4                           |";
        qstarm2opc1[4]="opcion 1 arm2 pregunta 5                           |";
        qstarm2opc1[5]="opcion 1 arm2 pregunta 6                           |";
        qstarm2opc1[6]="opcion 1 arm2 pregunta 7                           |";
        qstarm2opc1[7]="opcion 1 arm2 pregunta 8                           |";
        qstarm2opc1[8]="opcion 1 arm2 pregunta 9                           |";
        qstarm2opc1[9]="opcion 1 arm2 pregunta 10                          |";
        qstarm2opc2[0]="opcion 2 arm2 pregunta 1                           |";//opcion 2
        qstarm2opc2[1]="opcion 2 arm2 pregunta 2                           |";
        qstarm2opc2[2]="opcion 2 arm2 pregunta 3                           |";
        qstarm2opc2[3]="opcion 2 arm2 pregunta 4                           |";
        qstarm2opc2[4]="opcion 2 arm2 pregunta 5                           |";
        qstarm2opc2[5]="opcion 2 arm2 pregunta 6                           |";
        qstarm2opc2[6]="opcion 2 arm2 pregunta 7                           |";
        qstarm2opc2[7]="opcion 2 arm2 pregunta 8                           |";
        qstarm2opc2[8]="opcion 2 arm2 pregunta 9                           |";
        qstarm2opc2[9]="opcion 2 arm2 pregunta 10                          |";
        qstarm2opc3[0]="opcion 3 arm2 pregunta 1                           |";//opcion 3
        qstarm2opc3[1]="opcion 3 arm2 pregunta 2                           |";
        qstarm2opc3[2]="opcion 3 arm2 pregunta 3                           |";
        qstarm2opc3[3]="opcion 3 arm2 pregunta 4                           |";
        qstarm2opc3[4]="opcion 3 arm2 pregunta 5                           |";
        qstarm2opc3[5]="opcion 3 arm2 pregunta 6                           |";
        qstarm2opc3[6]="opcion 3 arm2 pregunta 7                           |";
        qstarm2opc3[7]="opcion 3 arm2 pregunta 8                           |";
        qstarm2opc3[8]="opcion 3 arm2 pregunta 9                           |";
        qstarm2opc3[9]="opcion 3 arm2 pregunta 10                          |";
        qstarm2opc4[0]="opcion 4 arm2 pregunta 1                           |";//opcion 4
        qstarm2opc4[1]="opcion 4 arm2 pregunta 2                           |";
        qstarm2opc4[2]="opcion 4 arm2 pregunta 3                           |";
        qstarm2opc4[3]="opcion 4 arm2 pregunta 4                           |";
        qstarm2opc4[4]="opcion 4 arm2 pregunta 5                           |";
        qstarm2opc4[5]="opcion 4 arm2 pregunta 6                           |";
        qstarm2opc4[6]="opcion 4 arm2 pregunta 7                           |";
        qstarm2opc4[7]="opcion 4 arm2 pregunta 8                           |";
        qstarm2opc4[8]="opcion 4 arm2 pregunta 9                           |";
        qstarm2opc4[9]="opcion 4 arm2 pregunta 10                          |";
        int[] respuestasCorrectas = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstarm2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     1) Opción 1 ");
            System.out.println(qstarm2opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     2) Opción 2 ");
            System.out.println(qstarm2opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     3) Opción 3 ");
            System.out.println(qstarm2opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     4) Opción 4 ");
            System.out.println(qstarm2opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("Opción inválida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |     Resultados del cuestionario:                                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Errores: " + errores+"                                                     |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        cuestionarios();
    }
    public static void armonia1() {
        screen();//aqui se modifica el tema y subtema del cuestionario
        System.out.println("        |                                                                    |");
        System.out.println("        |                        Cuestionario Armonia 1                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
        menucuestionarios();
        int userqstint = scanner.nextInt();
        switch(userqstint){
            case 1: teoria1_1();
                break;
            case 2: cuestionarios();
                break;
            default:
                System.out.println("Opción inválida");
                pausar();
                armonia1();
                break;
        }
    }
    public static void armonia1_1(){
        aciertos=0;
        errores=0;
        qstarm1 = new String[10];
        qstarm1opc1 = new String[10];
        qstarm1opc2 = new String[10];
        qstarm1opc3 = new String[10];
        qstarm1opc4 = new String[10];
        qstarm1[0]= "Pregunta 1 arm1                                     |";//asignacion para las preguntas
        qstarm1[1]= "Pregunta 2 arm1                                     |";//para el formato de cuadro llena 52 espacios y "|"
        qstarm1[2]= "Pregunta 3 arm1                                     |";
        qstarm1[3]= "Pregunta 4 arm1                                     |";
        qstarm1[4]= "Pregunta 5 arm1                                     |";
        qstarm1[5]= "Pregunta 6 arm1                                     |";
        qstarm1[6]= "Pregunta 7 arm1                                     |";
        qstarm1[7]= "Pregunta 8 arm1                                     |";
        qstarm1[8]= "Pregunta 9 arm1                                     |";
        qstarm1[9]= "Pregunta 10 arm1                                   |";
        qstarm1opc1[0]="opcion 1 arm1 pregunta 1                           |";//opcion 1
        qstarm1opc1[1]="opcion 1 arm1 pregunta 2                           |";//para el formato de cuadro llena 51 espacios y "|"
        qstarm1opc1[2]="opcion 1 arm1 pregunta 3                           |";
        qstarm1opc1[3]="opcion 1 arm1 pregunta 4                           |";
        qstarm1opc1[4]="opcion 1 arm1 pregunta 5                           |";
        qstarm1opc1[5]="opcion 1 arm1 pregunta 6                           |";
        qstarm1opc1[6]="opcion 1 arm1 pregunta 7                           |";
        qstarm1opc1[7]="opcion 1 arm1 pregunta 8                           |";
        qstarm1opc1[8]="opcion 1 arm1 pregunta 9                           |";
        qstarm1opc1[9]="opcion 1 arm1 pregunta 10                          |";
        qstarm1opc2[0]="opcion 2 arm1 pregunta 1                           |";//opcion 2
        qstarm1opc2[1]="opcion 2 arm1 pregunta 2                           |";
        qstarm1opc2[2]="opcion 2 arm1 pregunta 3                           |";
        qstarm1opc2[3]="opcion 2 arm1 pregunta 4                           |";
        qstarm1opc2[4]="opcion 2 arm1 pregunta 5                           |";
        qstarm1opc2[5]="opcion 2 arm1 pregunta 6                           |";
        qstarm1opc2[6]="opcion 2 arm1 pregunta 7                           |";
        qstarm1opc2[7]="opcion 2 arm1 pregunta 8                           |";
        qstarm1opc2[8]="opcion 2 arm1 pregunta 9                           |";
        qstarm1opc2[9]="opcion 2 arm1 pregunta 10                          |";
        qstarm1opc3[0]="opcion 3 arm1 pregunta 1                           |";//opcion 3
        qstarm1opc3[1]="opcion 3 arm1 pregunta 2                           |";
        qstarm1opc3[2]="opcion 3 arm1 pregunta 3                           |";
        qstarm1opc3[3]="opcion 3 arm1 pregunta 4                           |";
        qstarm1opc3[4]="opcion 3 arm1 pregunta 5                           |";
        qstarm1opc3[5]="opcion 3 arm1 pregunta 6                           |";
        qstarm1opc3[6]="opcion 3 arm1 pregunta 7                           |";
        qstarm1opc3[7]="opcion 3 arm1 pregunta 8                           |";
        qstarm1opc3[8]="opcion 3 arm1 pregunta 9                           |";
        qstarm1opc3[9]="opcion 3 arm1 pregunta 10                          |";
        qstarm1opc4[0]="opcion 4 arm1 pregunta 1                           |";//opcion 4
        qstarm1opc4[1]="opcion 4 arm1 pregunta 2                           |";
        qstarm1opc4[2]="opcion 4 arm1 pregunta 3                           |";
        qstarm1opc4[3]="opcion 4 arm1 pregunta 4                           |";
        qstarm1opc4[4]="opcion 4 arm1 pregunta 5                           |";
        qstarm1opc4[5]="opcion 4 arm1 pregunta 6                           |";
        qstarm1opc4[6]="opcion 4 arm1 pregunta 7                           |";
        qstarm1opc4[7]="opcion 4 arm1 pregunta 8                           |";
        qstarm1opc4[8]="opcion 4 arm1 pregunta 9                           |";
        qstarm1opc4[9]="opcion 4 arm1 pregunta 10                          |";
        int[] respuestasCorrectas = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};//aciertos
        for (int i = 0; i < respuestasCorrectas.length; i++) {//aqui solo se modifican los aciertos NO SE TOCA NADA MÁS
            screen();
            System.out.println("        |                                                                    |");
            System.out.print("        |     Pregunta " + (i + 1)+ " ");
            System.out.println(qstarm1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     1) Opción 1 ");
            System.out.println(qstarm1opc1[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     2) Opción 2 ");
            System.out.println(qstarm1opc2[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     3) Opción 3 ");
            System.out.println(qstarm1opc3[i]);
            System.out.println("        |                                                                    |");
            System.out.print("        |     4) Opción 4 ");
            System.out.println(qstarm1opc4[i]);
            System.out.println("        |                                                                    |");
            System.out.println("        |        Tu respuesta:                                               |");//esto no se modifica
            System.out.println("        |____________________________________________________________________|");
            int respuesta = scanner.nextInt();
            if(respuesta<1||respuesta>4) {
                System.out.println("Opción inválida");
                pausar();
                i--;
            }else if (respuesta == respuestasCorrectas[i]) {
                aciertos++;
                System.out.println("Tu respuesta es correcta");
                pausar();
            } else {
                errores++;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestasCorrectas[i]);
                pausar();
            }
        }
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |     Resultados del cuestionario:                                   |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Aciertos: " + aciertos+"                                                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |     Errores: " + errores+"                                                     |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        cuestionarios();
    }//acaba el módulo de teoría musical
    //inicio del modulo de equipo de audio
    public static void equipo(){//menu de equipo de audio
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Instrumentos                         |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. IEMs                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. DAC                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Accesorios                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        equint();
    }
    public static void equint(){//lector del menu de equipo de audio
        int userequinput = scanner.nextInt();
        switch (userequinput){
            case 1: instrumentos();
                break;
            case 2: IEMs();
                break;
            case 3: DAC();
                break;
            case 4: Accesorios();
                break;
            case 5: proceso1();
                break;
            default:
                System.out.println("Opción inválida, escriba una opción válida");
                pausar();
                equipo();
                break;
        }
    }

    private static void instrumentos() {//aqui va la lista de instrumentos
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                        lista de instruemntos                       |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }
    private static void IEMs() {//aqui va la lista de IEMs
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           lista de IEMs                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }
    private static void DAC() {//aqui va la lista de DAC
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                            lista de DAC                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }
    private static void Accesorios() {//aqui va la lista de accesorios
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         lista de accesorios                        |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        equipo();
    }//acaba el módulo de equipo de audio
    //inicia el módulo de librerias
    public static void librerias(){//menu genral de las librerias
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija el Genero Musical Deseado                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Rock                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Pop                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Folk                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Indie                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Hip-Hop / Rap                        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            6. R&B                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            7. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        lint();}
    public static void lint(){ //lector de librerias
        int userlinput = scanner.nextInt();
        switch(userlinput){
            case 1: librock();
                break;
            case 2: libpop();
                break;
            case 3: libfolk();
                break;
            case 4: libind();
                break;
            case 5: libhip();
                break;
            case 6: librb();
                break;
            case 7: proceso1();
                break;
            default:
                System.out.println("Opcion inválida, seleccionar una opción válida");
                pausar();
                librerias();
                break;
        }
    }
    public static void menulib(){//menu general de los playlist
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Playlist 1                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Playlist 2                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Playlist 3                           |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
    }
    public static void librock(){//lector del genero rock
        menulib();
        int rocklibint = scanner.nextInt();
        switch(rocklibint){
            case 1: librocklista1();
                break;
            case 2: librocklista2();
                break;
            case 3: librocklista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("Opción inválida, porfavor escriba una opción válida");
                pausar();
                librock();
                break;
        }
    }
    private static void librocklista1() {//aqui va el playlist 1 de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 1 rock                           |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librock();
    }
    private static void librocklista2() {//aqui va el playlist 2 de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 2 rock                           |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librock();
    }
    private static void librocklista3() {//aqui va el playlist 3 de rock
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 3 rock                           |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librock();
    }
    public static void libpop(){//lector del genero pop
        menulib();
        int poplibint = scanner.nextInt();
        switch(poplibint){
            case 1: libpoplista1();
                break;
            case 2: libpoplista2();
                break;
            case 3: libpoplista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("Opción inválida, porfavor escriba una opción válida");
                pausar();
                libpop();
                break;
        }
    }
    private static void libpoplista1() {//aqui va el playlist 1 de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 1 pop                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libpop();
    }
    private static void libpoplista2() {//aqui va el playlist 2 de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 2 pop                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libpop();
    }
    private static void libpoplista3() {//aqui va el playlist 3 de pop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 3 pop                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libpop();
    }
    public static void libfolk(){//lector del genero folk
        menulib();
        int folklibint = scanner.nextInt();
        switch(folklibint){
            case 1: libfolklista1();
                break;
            case 2: libfolklista2();
                break;
            case 3: libfolklista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("Opción inválida, porfavor escriba una opción válida");
                pausar();
                libfolk();
                break;
        }
    }
    private static void libfolklista1() {//aqui va el playlist 1 de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 1 folk                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libfolk();
    }
    private static void libfolklista2() {//aqui va el playlist 2 de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 2 folk                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libfolk();
    }
    private static void libfolklista3() {//aqui va el playlist 3 de folk
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 3 folk                            |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libfolk();
    }
    public static void libind(){//lector del genero R&B
        menulib();
        int indlibint = scanner.nextInt();
        switch(indlibint){
            case 1: libindlista1();
                break;
            case 2: libindlista2();
                break;
            case 3: libindlista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("Opción inválida, porfavor escriba una opción válida");
                pausar();
                libind();
                break;
        }
    }
    private static void libindlista1() {//aqui va el playlist 1 de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 1 indie                           |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libind();
    }
    private static void libindlista2() {//aqui va el playlist 2 de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 2 indie                           |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libind();
    }
    private static void libindlista3() {//aqui va el playlist 3 de indie
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                         playlist 3 indie                           |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libind();
    }
    public static void libhip(){//lector del genero R&B
        menulib();
        int hiplibint = scanner.nextInt();
        switch(hiplibint){
            case 1: libhiplista1();
                break;
            case 2: libhiplista2();
                break;
            case 3: libhiplista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("Opción inválida, porfavor escriba una opción válida");
                pausar();
                libhip();
                break;
        }
    }
    private static void libhiplista1() {//aqui va el playlist 1 de hip-hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 1 hip-hop                             |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libhip();
    }
    private static void libhiplista2() {//aqui va el playlist 2 de hip-hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                        playlist 2 hip-hop                          |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libhip();
    }
    private static void libhiplista3() {//aqui va el playlist 3 de hip hop
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                        playlist 3 hip-hop                          |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        libhip();
    }
    public static void librb(){//lector del genero R&B
        menulib();
        int rblibint = scanner.nextInt();
        switch(rblibint){
            case 1: librblista1();
                break;
            case 2: librblista2();
                break;
            case 3: librblista3();
                break;
            case 4: librerias();
                break;
            default:
                System.out.println("Opción inválida, porfavor escriba una opción válida");
                pausar();
                librb();
                break;
        }
    }
    private static void librblista1() {//aqui va el playlist 1 de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 1 rb                             |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librb();
    }
    private static void librblista2() {//aqui va el playlist 2 de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 2 rb                             |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librb();
    }
    private static void librblista3() {//aqui va el playlist 3 de rb
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                          playlist 3 rb                             |");
        System.out.println("        |____________________________________________________________________|");
        pausar();
        librb();
    }
    public static void screen(){//68 espacios
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("         ____________________________________________________________________");
        System.out.println("        |                                                                    |");
        System.out.println("        |          _____       _   _____       _   _                         |");
        System.out.println("        |         |  __ \\     | | |  __ \\     | | | |                        |");
        System.out.println("        |         | |  | |    | | | |__) |   _| |_| |__   ___  _ __          |");
        System.out.println("        |         | |  | |_   | | |  ___/ | | | __| '_ \\ / _ \\| '_ \\         |");
        System.out.println("        |         | |__| | |__| | | |   | |_| | |_| | | | (_) | | | |        |");
        System.out.println("        |         |_____/ \\____/  |_|    \\__, |\\__|_| |_|\\___/|_| |_|        |");
        System.out.println("        |                                 __/ |                              |");
        System.out.println("        |                                |___/                               |");
        System.out.println("        |____________________________________________________________________|");
    }}