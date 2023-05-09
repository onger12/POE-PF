
package Controladores;

import Vista.MenuPrincipal;
import Vista.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Saday G
 */
public class Controlador_MenuPrincipal implements ActionListener{
    MenuPrincipal mp;
    
    public Controlador_MenuPrincipal(MenuPrincipal obj){
        mp = obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(mp.jbAdmin)) {
            //System.out.println("Click en JbOtra");
             Usuarios us = new Usuarios(mp);
             mp.setVisible(false);//Ocultar menu principal
            }
    }
}


