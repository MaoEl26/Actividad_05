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
public class ImpresoraFactory {
    
    public static Impresora getImpresora(ImpresoraTipo tipo){
        Impresora h = null ;
        switch (tipo){
            case PDF :     h = new ImpresoraPDF(); break;
            case DOCX :     h = new ImpresoraDOCX(); break;
            case XLSX :     h = new ImpresoraXLSX(); break;
            case PPTX :     h = new ImpresoraPPTX(); break;
        }
        return h;
    }
    
    /*public static Impresora getImpresora(ImpresoraTipo tipo){
        Impresora i = null;
        try{
            String paquete = Impresora.class.getPackage().getName();
            
            String laInstancia = paquete+".Impresora"+tipo.name();
            
            i = (Impresora) Class.forName(laInstancia).newInstance();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            i = null;
        }
        return i;
    } */
    
    
}
