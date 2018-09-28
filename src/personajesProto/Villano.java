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
public class Villano extends Personaje{
    private boolean conocido;
    
    public Villano(){
        super();
        setNombre("Soy Villano");
        setHabilidades("Te hare infeliz");
        setConocido(true);
    }

    public Villano(boolean conocido, String nombre, String imagen, int peso) {
        super(nombre, imagen, peso);
        this.conocido = conocido;
    }

    public boolean isConocido() {
        return conocido;
    }

    public void setConocido(boolean conocido) {
        this.conocido = conocido;
    }
    
    @Override
    public IPrototype clone() {
        return new Villano();
    }

    @Override
    public String toString() {
        return "Villano{" + super.toString() + "conocido=" + conocido + '}';
    }
    
}
