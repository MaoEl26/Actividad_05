/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

/**
 *
 * @author mcv26
 */
public class PiezaFactory {

    public static Figura getPieza(PiezaType tipo,Color color){
        
        Figura fig = null;
        switch(tipo){
            case PiezaLDerecha: fig = new PiezaLDerecha(color); break;
            case PiezaLIzquierda: fig = new PiezaLIzquierda(color); break;
            case PiezaRectangulo : fig = new PiezaRectangulo(color); break;
            case PiezaT: fig = new PiezaT(color); break;
            case PiezaSIzquierda: fig = new PiezaSIzquierda(color); break;
            case PiezaSDerecha: fig = new PiezaSDerecha(color); break;
        }
        return fig;
    }
}
