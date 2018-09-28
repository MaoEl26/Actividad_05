/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajesProto;

import java.util.HashMap;

/**
 *
 * @author reese
 */
public class PrototypeCache {
    
    private HashMap<String, Personaje> prototipos = new HashMap<String, Personaje>();
    
    public PrototypeCache(){
        prototipos.put("Heroe", new Heroe(true, "miHeroe", "imagenHeroe", 15));
        prototipos.put("Villano", new Villano(true, "miVillano", "imagenVillano", 10));
        prototipos.put("Principe", new Principe(true, "miPrincipe", "imagenPrincipe", 12));
        prototipos.put("Monstruo", new Monstruo(true, "miMonstruo", "imagenMonstruo", 20));
    }
    
    public Object getPrototipo(String tipo) throws CloneNotSupportedException{
        return prototipos.get(tipo).clone();
    }
    
}
