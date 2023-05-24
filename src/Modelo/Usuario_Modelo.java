package Modelo;


import Entidades.Datos;
import Vista.Usuarios;

public class Usuario_Modelo {
    
    Usuarios u;
    
    public Usuario_Modelo(Usuarios obj){
        u = obj;
    }
    
    public void guardar(){
        String correo = u.jtcorreo.getText();
        String nom = u.jtnombre_completo.getText();
        //System.out.println(ape + " " + nom);
        Datos p = new Datos(correo, nom);
        u.mp.arregloUsuarios.add(p);        
    }
}
