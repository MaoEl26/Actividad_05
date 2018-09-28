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
public class PiezaLDerecha extends Figura{
    
    public PiezaLDerecha(){
        super(null);
    }
    
    public PiezaLDerecha(Color color){
        super(color);
    }
    
    @Override
    public String toString(){
        return "Pieza L Derecha"+super.toString()+"\n";
    }
    
}
