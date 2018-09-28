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
public class OroBuilder extends CuentaBuilder{
    
    public OroBuilder() {
        super();
    }

    
    @Override
    public void defineTipoCuenta() {
        unaCuenta.setTipoCuenta("Oro");
    }

    @Override
    public void definePorcentajeInteres() {
        unaCuenta.setPorcentajeInteres("1.5%");
    }
    
    @Override
    public void defineTarjetaDebito() {
        unaCuenta.setTarjetaDebito("Gratuita");
    }
    
    @Override
    public void defineTarjetaCredito() {     
        unaCuenta.setTarjetaCredito("Gratuita; 60% pension");
    }
    
    @Override
    public void defineRegalo() {
        unaCuenta.setRegalo("Seguro");
    }
    
}
