/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retosofka;

/**
 *
 * @author Wilson
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("------CONCURSO DE PREGUNTAS Y RESPUESTAS------");
        System.out.print("Ingresa tu nombre: ");
        String nombre = in.nextLine();

        Jugador j1 = new Jugador(nombre);

        
        System.out.println("\nBienvenid@ al juego " + j1.getName()+ "\n");

        Preguntas.generarBancoPreguntas(Preguntas.preguntas);
        Preguntas.generarPreguntasPartida(Preguntas.preguntas, Preguntas.respuestaA, Preguntas.respuestaB, Preguntas.respuestaC, Preguntas.respuestaD);
        System.out.println("\n¡¡Gracias por participar!!");

    }

}
