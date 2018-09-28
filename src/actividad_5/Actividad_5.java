/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_5;

import tetris.*;
import combos.*;
/**
 *
 * @author mcv26
 */
public class Actividad_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercio 4
        Figura  unaPieza = PiezaFactory.getPieza(PiezaType.PiezaT, Color.Rojo);
        System.out.println(unaPieza.toString());
        
        unaPieza = PiezaFactory.getPieza(PiezaType.PiezaLIzquierda,Color.Negro);
        System.out.println(unaPieza.toString());
        
        //Ejercicio 3
        
        AbstractFactory fabrica = new Factory();
        IBebidas unaBebida = fabrica.getBebida(TipoBebida.Natural);
        IHamburguesa unaHamburguesa = fabrica.getHamburguesa(TipoHamburguesa.Grasosa);
        unaBebida.crearBebidas();
        unaHamburguesa.crearHamburguesa();
    }
    
}
