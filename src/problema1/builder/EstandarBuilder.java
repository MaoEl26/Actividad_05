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
public class EstandarBuilder extends CuentaBuilder{
    
    public EstandarBuilder() {
        super();
    }

    
    @Override
    public void defineTipoCuenta() {
        unaCuenta.setTipoCuenta("Estandar");
    }

    @Override
    public void definePorcentajeInteres() {
        unaCuenta.setPorcentajeInteres("0.5%");
    }
    
    @Override
    public void defineTarjetaDebito() {
        unaCuenta.setTarjetaDebito("5 euros");
    }
    
    @Override
    public void defineTarjetaCredito() {     
        unaCuenta.setTarjetaCredito("No");
    }
    
    @Override
    public void defineRegalo() {
        unaCuenta.setRegalo("No");
    }
    
}
