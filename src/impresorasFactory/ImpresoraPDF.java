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
public class ImpresoraPDF extends Impresora{
    
    public ImpresoraPDF(){
        super(ImpresoraTipo.PDF);
    }
    
    @Override
    public String toString(){
        return "PDF desde: " + super.toString() + "\n";
    }
    
}
