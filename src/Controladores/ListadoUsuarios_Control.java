package Controlador;

import Vista.ListadoUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListadoUsuarios_Control implements ActionListener{
    
    ListadoUsuario lp;
    
    public ListadoUsuarios_Control(ListadoUsuario obj){
        lp = obj;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(lp.jbVolver)) {
            lp.setVisible(false);
            lp.dispose();
            lp.mp.setVisible(true);
        }
    }
    
    
}
