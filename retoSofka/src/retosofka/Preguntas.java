/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retosofka;

import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class Preguntas {

    // Matrices de las preguntas, respuestas y la correcta de cada nivel
    public static String[][] preguntas = new String[5][5];
    public static String[][] respuestaA = new String[5][5];
    public static String[][] respuestaB = new String[5][5];
    public static String[][] respuestaC = new String[5][5];
    public static String[][] respuestaD = new String[5][5];
    public static String[][] correcta = new String[5][5];

    // Generamos las preguntas que van a aparecer al usuario
    public static void generarPreguntasPartida(String[][] pregunta, String[][] respuestaA, String[][] respuestaB, String[][] respuestaC, String[][] respuestaD) {

        //se genera un numero aleatorio de 0 a 4, para que se elija una pregunta de forma aleatoria por cada nivel
        int rnd = (int) (0 + Math.random() * 5);

        // Inicializamos bucle con el que vamos a mostrar las preguntas y respuestas de cada nivel
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {

                // Mostramos las preguntas y respuestas aleatorias de cada nivel
                System.out.println("\n"+(i + 1) + ". " + preguntas[i][rnd]);
                System.out.println(respuestaA[i][rnd] + "\t" + respuestaB[i][rnd]
                        + "\n" + respuestaC[i][rnd] + "\t" + respuestaD[i][rnd] + "\n");
            }

            // Le pedimos la respuesta a la pregunta del nivel correspondiente
            System.out.print("Respuesta: ");
            boolean repuesta = comprobarRespuesta(i, rnd); //Comprobamos si la respuesta es la correcta

            //Si es correcta y no estamos en el último nivel mostramos:
            if (repuesta == true && i != 4) {
                System.out.println("\n¡¡Respuesta correcta!!\n");
                System.out.print("Puntos acumulados: ");
                Premios.puntosGanados(i + 1);

                System.out.println("\nDesea retirarse con los puntos acumulados hasta el momento?(s/n)");
                if (pedirRespuesta().equals("s")) {
                    System.out.print("\nTotal puntos: ");
                    Premios.puntosGanados(i + 1);
                    break;
                }

            } // Si es correcta y estamos en el último nivel mostramos:
            else if (repuesta == true && i == 4) {
                System.out.println("\nFelicidades has culminado el juego con exito!!\n");
                System.out.print("Total puntos: ");
                Premios.puntosGanados(i + 1);

            } // Si no es correcta mostramos:
            else {
                System.out.println("\nRespuesta incorrecta\n");
                System.out.print("Total puntos: ");
                Premios.puntosGanados(0);
                break;
            }
        }

    }

    // Guardamos la respuesta del usuario
    public static String pedirRespuesta() {

        Scanner in = new Scanner(System.in);

        String resp = in.next();

        return resp.toLowerCase();
    }

    // Comprobamos si la respuesta es correcta
    public static boolean comprobarRespuesta(int nivel, int numPregunta) {

        String respCorrecta = correcta[nivel][numPregunta];

        // Comparamos su respuesta con la respuesta correcta de esa pregunta
        if (pedirRespuesta().equalsIgnoreCase(respCorrecta)) {
            return true;
        } else {
            return false;
        }
    }

    // Generamos las preguntas y respuestas de cada nivel
    public static void generarBancoPreguntas(String[][] pregunta) {

        //Nivel 1
        preguntas[0][0] = "¿Cuál es la capital de Ecuador?";
        preguntas[0][1] = "¿Cuántas patas tiene la araña?";
        preguntas[0][2] = "¿A quién le crecía la nariz cuando mentía?";
        preguntas[0][3] = "¿Cuál es el segundo planeta en el sistema solar?";
        preguntas[0][4] = "¿En que país se encuentra situada la Estatua de la Libertad?";

        respuestaA[0][0] = "a. Quito";
        respuestaA[0][1] = "a. Cuatro";
        respuestaA[0][2] = "a. Blancanieves";
        respuestaA[0][3] = "a. Marte";
        respuestaA[0][4] = "a. Estados Unidos";

        respuestaB[0][0] = "b. Lima";
        respuestaB[0][1] = "b. Diez";
        respuestaB[0][2] = "b. Aladin";
        respuestaB[0][3] = "b. Venus";
        respuestaB[0][4] = "b. Inglaterra";

        respuestaC[0][0] = "c. Caracas";
        respuestaC[0][1] = "c. Ocho";
        respuestaC[0][2] = "c. Simba";
        respuestaC[0][3] = "c. Jupiter";
        respuestaC[0][4] = "c. Canadá";

        respuestaD[0][0] = "d. Bogota";
        respuestaD[0][1] = "d. Dos";
        respuestaD[0][2] = "d. Pinocho";
        respuestaD[0][3] = "d. Saturno";
        respuestaD[0][4] = "d. Francia";

        correcta[0][0] = "a";
        correcta[0][1] = "c";
        correcta[0][2] = "d";
        correcta[0][3] = "b";
        correcta[0][4] = "a";

        //Nivel 2
        preguntas[1][0] = "¿En que año fue el descubrimiento de América?";
        preguntas[1][1] = "¿Qué cantante fue conocido como 'El rey del pop'?";
        preguntas[1][2] = "¿Qué tipo de animal son las ranas?";
        preguntas[1][3] = "¿Cuál es el continente más extenso del planeta?";
        preguntas[1][4] = "¿De qué está recubierto el cuerpo de los peces?";

        respuestaA[1][0] = "a. 1492";
        respuestaA[1][1] = "a. Prince";
        respuestaA[1][2] = "a. Anfibios";
        respuestaA[1][3] = "a. Europa";
        respuestaA[1][4] = "a. Espinas";

        respuestaB[1][0] = "b. 1592";
        respuestaB[1][1] = "b. Elvis Presley";
        respuestaB[1][2] = "b. Mamíferos";
        respuestaB[1][3] = "b. Asia";
        respuestaB[1][4] = "b. Pelo";

        respuestaC[1][0] = "c. 1942";
        respuestaC[1][1] = "c. Michael Jackson";
        respuestaC[1][2] = "c. Reptíles";
        respuestaC[1][3] = "c. America";
        respuestaC[1][4] = "c. Plumas";

        respuestaD[1][0] = "d. 1490";
        respuestaD[1][1] = "d. Freddie Mercury";
        respuestaD[1][2] = "d. Peces";
        respuestaD[1][3] = "d. Africa";
        respuestaD[1][4] = "d. Escamas";

        correcta[1][0] = "a";
        correcta[1][1] = "c";
        correcta[1][2] = "a";
        correcta[1][3] = "b";
        correcta[1][4] = "d";

        //Nivel 3
        preguntas[2][0] = "¿En qué se especializa la cartografía?";
        preguntas[2][1] = "¿Cuántas estrellas aparecen en la bandera de la República Popular China?";
        preguntas[2][2] = "¿En qué parte del mundo se exhibe la Mona Lisa de Leonardo da Vinci?";
        preguntas[2][3] = "¿En qué lugar del cuerpo se produce la insulina?";
        preguntas[2][4] = "¿En qué país se encuentra la región de Transilvania?";

        respuestaA[2][0] = "a. Cartas";
        respuestaA[2][1] = "a. Cuatro";
        respuestaA[2][2] = "a. Francia";
        respuestaA[2][3] = "a. Estomago";
        respuestaA[2][4] = "a. Croacia";

        respuestaB[2][0] = "b. Rocas";
        respuestaB[2][1] = "b. Cinco";
        respuestaB[2][2] = "b. Italia";
        respuestaB[2][3] = "b. Pulmones";
        respuestaB[2][4] = "b. Belgica";

        respuestaC[2][0] = "c. Mapas";
        respuestaC[2][1] = "c. Siete";
        respuestaC[2][2] = "c. España";
        respuestaC[2][3] = "c. Higado";
        respuestaC[2][4] = "c. Rumania";

        respuestaD[2][0] = "d. Rios";
        respuestaD[2][1] = "d. Tres";
        respuestaD[2][2] = "d. Alemania";
        respuestaD[2][3] = "d. Pancreas";
        respuestaD[2][4] = "d. Polonia";

        correcta[2][0] = "c";
        correcta[2][1] = "b";
        correcta[2][2] = "a";
        correcta[2][3] = "d";
        correcta[2][4] = "c";

        //Nivel 4
        preguntas[3][0] = "¿Cuántos corazones tiene un pulpo?";
        preguntas[3][1] = "¿Cuál fue el primer metal que empleó el hombre?";
        preguntas[3][2] = "¿Cómo se llama la parte del ojo que es sensible a la luz?";
        preguntas[3][3] = "¿En que año acabó la Primera Guerra Mundial?";
        preguntas[3][4] = "¿Dónde se disputaron los Juegos Olímpicos en el año 1992?";

        respuestaA[3][0] = "a. Tres";
        respuestaA[3][1] = "a. Cobre";
        respuestaA[3][2] = "a. Pupila";
        respuestaA[3][3] = "a. 1918";
        respuestaA[3][4] = "a. Madrid";

        respuestaB[3][0] = "b. Dos";
        respuestaB[3][1] = "b. Plata";
        respuestaB[3][2] = "b. Cornea";
        respuestaB[3][3] = "b. 1920";
        respuestaB[3][4] = "b. Roma";

        respuestaC[3][0] = "c. Cuatro";
        respuestaC[3][1] = "c. Bronce";
        respuestaC[3][2] = "c. Iris";
        respuestaC[3][3] = "c. 1915";
        respuestaC[3][4] = "c. Barcelona";

        respuestaD[3][0] = "d. Uno";
        respuestaD[3][1] = "d. Oro";
        respuestaD[3][2] = "d. Retina";
        respuestaD[3][3] = "d. 1917";
        respuestaD[3][4] = "d. Berlin";

        correcta[3][0] = "a";
        correcta[3][1] = "a";
        correcta[3][2] = "d";
        correcta[3][3] = "a";
        correcta[3][4] = "c";

        //Nivel 5
        preguntas[4][0] = "¿En qué año viajó al espacio el primer ser humano?";
        preguntas[4][1] = "¿Cuánto duró 'La Guerra de los Cien Años'?";
        preguntas[4][2] = "¿Cuál es la única ciudad que está en dos continentes distintos?";
        preguntas[4][3] = "¿Qué fruto da el arbol de olmo?";
        preguntas[4][4] = "Hormona que libera nuestro cuerpo como respuesta a una situación de estrés:";

        respuestaA[4][0] = "a. 1961";
        respuestaA[4][1] = "a. 95 años";
        respuestaA[4][2] = "a. Moscu";
        respuestaA[4][3] = "a. Bellota";
        respuestaA[4][4] = "a. Oxitocina";

        respuestaB[4][0] = "b. 1956";
        respuestaB[4][1] = "b. 120 años";
        respuestaB[4][2] = "b. Estambul";
        respuestaB[4][3] = "b. Dátil";
        respuestaB[4][4] = "b. Cortisol";

        respuestaC[4][0] = "c. 1973";
        respuestaC[4][1] = "c. 100 años";
        respuestaC[4][2] = "c. Budapest";
        respuestaC[4][3] = "c. Sámara";
        respuestaC[4][4] = "c. Serotonina";

        respuestaD[4][0] = "d. 1968";
        respuestaD[4][1] = "d. 116 años";
        respuestaD[4][2] = "d. Kiev";
        respuestaD[4][3] = "d. Nuez";
        respuestaD[4][4] = "d. Adrenalina";

        correcta[4][0] = "a";
        correcta[4][1] = "d";
        correcta[4][2] = "b";
        correcta[4][3] = "c";
        correcta[4][4] = "b";

    }

}
