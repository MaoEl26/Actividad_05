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
public class Heroe extends Personaje{
    private boolean rapido;
    
    public Heroe(){
        super();
        setNombre("El heroe");
        setImagen("Esta es mi foto");
        setRapido(true);
    }

    public Heroe(boolean rapido, String nombre, String imagen, int peso) {
        super(nombre, imagen, peso);
        this.rapido = rapido;
    }

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }
    
    @Override
    public IPrototype clone() {
        return new Heroe();
    }

    @Override
    public String toString() {
        return "Heroe{" + super.toString() + "rapido=" + rapido + '}';
    }
    
}
