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
public abstract class Figura {
    private Color color;
    
    public Figura(Color color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return " {Color "+color+"}";
    }
}
