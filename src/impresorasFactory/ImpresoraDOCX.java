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
public class ImpresoraDOCX extends Impresora{
    
    public ImpresoraDOCX(){
        super(ImpresoraTipo.DOCX);
    }
    
    @Override
    public String toString(){
        return "DOCX desde: " + super.toString() + "\n";
    }
    
}
