/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresorasFactory;

/**
 *
 * @author reese
 */
public abstract class Impresora {
    private ImpresoraTipo tipo;
    
    public Impresora(ImpresoraTipo tipo){
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "Impresora{" + "tipo= " + tipo + '}';
    }
    
}
