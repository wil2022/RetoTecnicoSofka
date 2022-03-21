/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retosofka;
import java.io.Serializable;
/**
 *
 * @author Wilson
 */
public class Jugador implements Serializable{
    //atributos
    private String name;
    private int acumulado;


    
    //constructor
    public Jugador(String name) {
        this.name = name;
        
    }
    
    //getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }
    
    
}
