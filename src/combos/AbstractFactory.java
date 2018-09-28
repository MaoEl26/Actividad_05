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
public abstract class AbstractFactory {
    public abstract IBebidas getBebida(TipoBebida tipo);
    public abstract IHamburguesa getHamburguesa(TipoHamburguesa tipo);
}
