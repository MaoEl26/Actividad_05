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
public class Cliente {
    private CuentaBuilder cliente ;

    public void setCliente(CuentaBuilder cliente) {
        this.cliente = cliente;
    }

    public Cuenta  getCuenta() {
        return cliente.getCuenta();
    }
    
    
    public void armarCuenta(){
        cliente.defineTipoCuenta();
        cliente.definePorcentajeInteres();
        cliente.defineTarjetaDebito();
        cliente.defineTarjetaCredito();
        cliente.defineRegalo();
    }
}