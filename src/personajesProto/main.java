/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajesProto;

/**
 *
 * @author reese
 */
public class main {
    
    public static void main(String[] args) {
        
        PrototypeCache prototipos = new PrototypeCache();
        try{
            Personaje unPersonaje = (Personaje) prototipos.getPrototipo("Heroe");
            System.out.println("El personaje prototipado es " + unPersonaje);
            unPersonaje = (Personaje) prototipos.getPrototipo("Villano");
            System.out.println("El personaje prototipado es " + unPersonaje);
            unPersonaje = (Personaje) prototipos.getPrototipo("Principe");
            System.out.println("El personaje prototipado es " + unPersonaje);
            unPersonaje = (Personaje) prototipos.getPrototipo("Monstruo");
            System.out.println("El personaje prototipado es " + unPersonaje);
        }
        catch (CloneNotSupportedException ex){
            System.out.println("Problemas generando clon del Personaje solicitado");
        }
        
    }

}
