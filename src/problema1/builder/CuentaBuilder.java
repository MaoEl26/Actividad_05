
package problema1.builder;


public abstract class CuentaBuilder {
 
    protected Cuenta unaCuenta;
    
    public CuentaBuilder() {
       unaCuenta =  new Cuenta();
    }
    
    public abstract void defineTipoCuenta();
    public abstract void definePorcentajeInteres();
    public abstract void defineTarjetaDebito();
    public abstract void defineTarjetaCredito();
    public abstract void defineRegalo();
    
    public Cuenta getCuenta(){
        return unaCuenta;
    }
    
}
