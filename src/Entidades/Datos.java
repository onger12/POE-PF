
package Entidades;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;

/**
 *
 * @author Saday G
 */
public class Datos {
    int id, identificacion;
    String nombre_completo,correo;
    JPasswordField jtcontraseña;
    JComboBox tipo_usuario;

    public Datos(int id,int identificacion,String nombre_completo, String correo,JPasswordField jtcontraseña,
    JComboBox tipo_usuario) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre_completo= nombre_completo;
        this.correo= correo;
        this.jtcontraseña= jtcontraseña;
        this.tipo_usuario= tipo_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public JPasswordField getJtcontraseña() {
        return jtcontraseña;
    }

    public void setJtcontraseña(JPasswordField jtcontraseña) {
        this.jtcontraseña = jtcontraseña;
    }

    public JComboBox getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(JComboBox tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    

    @Override
    public String toString() {
        return "Persona{" + "apellido=" + id + ", nombre=" + identificacion + '}';
    }
}
