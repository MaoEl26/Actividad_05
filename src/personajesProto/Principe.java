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
public class Principe extends Personaje{
    private boolean listo;

    public Principe() {
        super();
        setNombre("Soy Principe");
        setImagen("Mirame");
        setListo(true);
    }

    public Principe(boolean listo, String nombre, String imagen, int peso) {
        super(nombre, imagen, peso);
        this.listo = listo;
    }

    public boolean isListo() {
        return listo;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }
    
    @Override
    public IPrototype clone() {
        return new Principe();
    }

    @Override
    public String toString() {
        return "Principe{" + super.toString() + "listo=" + listo + '}';
    }
    
}
