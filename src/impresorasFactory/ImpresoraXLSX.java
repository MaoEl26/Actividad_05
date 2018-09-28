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
public class ImpresoraXLSX extends Impresora{
    
    public ImpresoraXLSX(){
        super(ImpresoraTipo.XLSX);
    }
    
    @Override
    public String toString(){
        return "XLSX desde: " + super.toString() + "\n";
    }
    
}
