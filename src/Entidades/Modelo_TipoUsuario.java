package Entidades;

public class Modelo_TipoUsuario {
  public int id;
  public String nombre;
  public String descripcion;
  public int alcance;
  public int estado;

  public Modelo_TipoUsuario(int id, String nombre, String descripcion, int alcance, int estado) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.alcance = alcance;
    this.estado = estado;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public int getAlcance() {
    return alcance;
  }
  public void setAlcance(int alcance) {
    this.alcance = alcance;
  }
  public int getEstado() {
    return estado;
  }
  public void setEstado(int estado) {
    this.estado = estado;
  }

  
}
