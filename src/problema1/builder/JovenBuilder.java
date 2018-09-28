/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.builder;

/**
 *
 * @author andre
 */
public class JovenBuilder extends CuentaBuilder{

    public JovenBuilder() {
        super();
    }

    
    @Override
    public void defineTipoCuenta() {
        unaCuenta.setTipoCuenta("Joven");
    }

    @Override
    public void definePorcentajeInteres() {
        unaCuenta.setPorcentajeInteres("2% interes");
    }
    
    @Override
    public void defineTarjetaDebito() {
        unaCuenta.setTarjetaDebito("Gratuita");
    }
    
    @Override
    public void defineTarjetaCredito() {     
        unaCuenta.setTarjetaCredito("No");
    }
    
    @Override
    public void defineRegalo() {
        unaCuenta.setRegalo("CD Musica");
    }
    
}
