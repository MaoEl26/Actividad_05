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
public class PiezaT extends Figura {
    
    public PiezaT(){
        super(null);
    }
    
    public PiezaT(Color color){
        super(color);
    }
    
    @Override
    public String toString(){
        return "Pieza T"+super.toString()+"\n";
    }
}
