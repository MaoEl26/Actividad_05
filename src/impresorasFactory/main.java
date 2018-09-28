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
public class main {
    
    public static void main(String[] args) {
    
        //ImpresoraFactory imf = new ImpresoraFactory();
        
        Impresora unaImpresora = ImpresoraFactory.getImpresora(ImpresoraTipo.PDF);
        System.out.println(unaImpresora.toString());
        
        unaImpresora = ImpresoraFactory.getImpresora(ImpresoraTipo.DOCX);
        System.out.println(unaImpresora.toString());
        
        unaImpresora = ImpresoraFactory.getImpresora(ImpresoraTipo.XLSX);
        System.out.println(unaImpresora.toString());
        
        unaImpresora = ImpresoraFactory.getImpresora(ImpresoraTipo.PPTX);
        System.out.println(unaImpresora.toString());
    
    }
    
}
