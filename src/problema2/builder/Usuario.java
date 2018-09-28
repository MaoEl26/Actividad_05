/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2.builder;

/**
 *
 * @author andre
 */
public class Usuario {
    
    private GUIBuilder usuario ;

    public void setUsuario(GUIBuilder usuario) {
        this.usuario = usuario;
    }

        public GUI  getGUI() {
        return usuario.getGUI();
    }
    
    
    public void definirGUI(){
        usuario.defineGUIColors();
    }
    
}
