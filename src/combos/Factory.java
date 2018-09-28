/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combos;

/**
 *
 * @author mcv26
 */
public class Factory extends AbstractFactory {
    public Factory(){
        
    }
    
    @Override
    public IBebidas getBebida(TipoBebida tipo){
       try {
           switch(tipo){
               case Gaseosa:return (IBebidas) Class.forName(BebidaGaseosa.class.getName()).newInstance();
               case Natural: return (IBebidas) Class.forName(BebidaNatural.class.getName()).newInstance();
           }
           return null;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            return  null; 
        } 
    }
    
    @Override
    public IHamburguesa getHamburguesa(TipoHamburguesa tipo){
        try {
            switch(tipo){
                case Grasosa:return (IHamburguesa) Class.forName(HamburguesaGrasosa.class.getName()).newInstance();
                case Vegana: return (IHamburguesa) Class.forName(HamburguesaVegana.class.getName()).newInstance();
            }
            return null;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            return  null; 
        }
    }
}
