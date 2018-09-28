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
public class Monstruo extends Personaje{
    private boolean bueno;

    public Monstruo() {
        super();
        setNombre("Soy Monstruo");
        setInteligencia(70);
        setBueno(true);
    }

    public Monstruo(boolean bueno, String nombre, String imagen, int peso) {
        super(nombre, imagen, peso);
        this.bueno = bueno;
    }

    public boolean isBueno() {
        return bueno;
    }

    public void setBueno(boolean bueno) {
        this.bueno = bueno;
    }
    
    @Override
    public IPrototype clone() {
        return new Monstruo();
    }

    @Override
    public String toString() {
        return "Monstruo{" + super.toString() + "bueno=" + bueno + '}';
    }
    
}
