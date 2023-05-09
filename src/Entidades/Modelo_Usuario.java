package Entidades;

public class Modelo_Usuario {
  public int id;
  public String nombre_comleto;
  public String correo;
  public String identificacion;
  public Modelo_TipoUsuario tipo_usuario;
  public String password;
  public String username;
  public int estado;

  public Modelo_Usuario(int id, String nombre_comleto, String correo, String identificacion,
      Modelo_TipoUsuario tipo_usuario, String password, String username, int estado) {
    this.id = id;
    this.nombre_comleto = nombre_comleto;
    this.correo = correo;
    this.identificacion = identificacion;
    this.tipo_usuario = tipo_usuario;
    this.password = password;
    this.username = username;
    this.estado = estado;
  }
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNombre_comleto() {
    return nombre_comleto;
  }
  public void setNombre_comleto(String nombre_comleto) {
    this.nombre_comleto = nombre_comleto;
  }
  public String getCorreo() {
    return correo;
  }
  public void setCorreo(String correo) {
    this.correo = correo;
  }
  public String getIdentificacion() {
    return identificacion;
  }
  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }
  public Modelo_TipoUsuario getTipo_usuario() {
    return tipo_usuario;
  }
  public void setTipo_usuario(Modelo_TipoUsuario tipo_usuario) {
    this.tipo_usuario = tipo_usuario;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public int getEstado() {
    return estado;
  }
  public void setEstado(int estado) {
    this.estado = estado;
  }

  
}
