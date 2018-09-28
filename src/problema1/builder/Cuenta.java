/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.builder;


public class Cuenta {
    
    private String tipoCuenta;
    private String porcentajeInteres;
    private String tarjetaDebito;
    private String tarjetaCredito;
    private String regalo;
    
    public Cuenta(){
        
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(String porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public String getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(String tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }
    
  
}
