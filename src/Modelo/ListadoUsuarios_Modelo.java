package Modelo;

import Entidades.Datos;
import Vista.ListadoUsuario;
import java.util.Vector;

public class ListadoUsuarios_Modelo {
    
    ListadoUsuario lu;
    
    public ListadoUsuarios_Modelo(ListadoUsuario obj){
        lu = obj;
    }
    
    public void addRegistros(){
        lu.mt.removeRow(0);
        
        for (int i = 0; i < lu.mp.arregloUsuarios.size(); i++) {
            Datos obj =lu.mp.arregloUsuarios.get(i);
            Vector<String> datos = new Vector<>();
            datos.add(obj.getCorreo());
            datos.add(obj.getNombre_completo());
            lu.mt.addRow(datos);
        }
    }
}

