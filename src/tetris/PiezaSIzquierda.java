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
public class PiezaSIzquierda extends Figura{
    
    public PiezaSIzquierda(){
        super(null);
    }
    
    public PiezaSIzquierda(Color color){
        super(color);
    }
    
    @Override
    public String toString(){
        return "Pieza S Izquierda"+super.toString()+"\n";
    }
    
}
