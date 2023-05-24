package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import Entidades.Modelo_TipoUsuario;
import Entidades.Modelo_Usuario;
import Modelo.ListadoUsuarios_Modelo;
import Modelo.Usuario_Modelo;
import Vista.Usuarios;
import data.BD;

public class Controlador_Usuarios implements ActionListener {

  public Usuarios u;
  public Controlador_Usuarios(Usuarios u) {
    super();
    this.u = u;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Modelo_TipoUsuario mtu = new Modelo_TipoUsuario(1, "default_tipo", "", 0, 1);
    BD bd;
    if(e.getSource().equals(u.jbGuardar)) {
      Modelo_Usuario user = new Modelo_Usuario(1, u.jtnombre_completo.getText(), u.jtcorreo.getText(), u.jtidentificacion.getText(), mtu, u.jtcontraseña.getText(), "username_default", 1);
      BD.addUser(user);
      try {
        bd = new BD();
        bd.addUserMysql(user);
        // bd.selectAll();
      } catch (SQLException e_) {
      System.out.println("Error aqui");
        System.out.println(e_.toString());
      }
    }
    if(e.getSource().equals(u.jbVolver)){
            u.setVisible(false);
            u.dispose();
            u.mp.setVisible(true);
        }
    if (e.getSource().equals(u.jbGuardar)) {
            Usuario_Modelo lum = new Usuario_Modelo(u);
            lum.guardar();
        }
  }
  
}
