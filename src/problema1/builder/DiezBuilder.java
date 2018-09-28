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
public class DiezBuilder extends CuentaBuilder{
    
    public DiezBuilder() {
        super();
    }

    
    @Override
    public void defineTipoCuenta() {
        unaCuenta.setTipoCuenta("10");
    }

    @Override
    public void definePorcentajeInteres() {
        unaCuenta.setPorcentajeInteres("1% interes; 50% cubierto");
    }
    
    @Override
    public void defineTarjetaDebito() {
        unaCuenta.setTarjetaDebito("Gratuita");
    }
    
    @Override
    public void defineTarjetaCredito() {     
        unaCuenta.setTarjetaCredito("18 euros; 60% nomina");
    }
    
    @Override
    public void defineRegalo() {
        unaCuenta.setRegalo("Reproductor CD");
    }
    
    
}
