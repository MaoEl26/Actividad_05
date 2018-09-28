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
public class Personaje implements IPrototype {
    protected String nombre;
    protected String imagen;
    protected int altura;
    protected int peso;
    protected int inteligencia;
    protected String habilidades;
    
    protected Personaje(){
    }

    public Personaje(String nombre, String imagen, int peso) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
    
    @Override
    public IPrototype clone(){
        try{
            return (IPrototype) super.clone();
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", imagen=" + imagen + ", altura=" + altura + ", peso=" + peso + ", inteligencia=" + inteligencia + ", habilidades=" + habilidades + '}';
    }
    
}
