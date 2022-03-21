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
public class Premios {

    // Se definen los puntos a otorgar en cada nivel
    public static void puntosGanados(int nivel) {

        int puntos;

        switch (nivel) {

            case 1:
                puntos = 100;
                System.out.println(puntos);
                break;
            case 2:
                puntos = 500;
                System.out.println(puntos);
                break;
            case 3:
                puntos = 1000;
                System.out.println(puntos);
                break;
            case 4:
                puntos = 2000;
                System.out.println(puntos);
                break;
            case 5:
                puntos = 5000;
                System.out.println(puntos);
                break;

            default:
                puntos = 0;
                System.out.println(puntos);
                break;
        }
    }

}
