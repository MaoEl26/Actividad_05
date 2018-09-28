
package problema2.builder;


public abstract class GUIBuilder {
    
    protected GUI unaGUI;
    
    public GUIBuilder() {
       unaGUI =  new GUI();
    }
    
    public abstract void defineGUIColors();
    
    public GUI getGUI(){
        return unaGUI;
    }
    
}
