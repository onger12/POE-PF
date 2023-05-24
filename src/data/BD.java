package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entidades.Modelo_TipoUsuario;
import Entidades.Modelo_Usuario;

public class BD {
  public static ArrayList<Modelo_Usuario> usuarios = new ArrayList<Modelo_Usuario>();
  public static ArrayList<Modelo_TipoUsuario> tiposUsuarios = new ArrayList<Modelo_TipoUsuario>() {
    Modelo_TipoUsuario admin = new Modelo_TipoUsuario(1, "admin", "Este es el administrador", 0, 1);
    Modelo_TipoUsuario operario = new Modelo_TipoUsuario(2, "operario", "Este es el operario", 1, 1);
    Modelo_TipoUsuario cliente = new Modelo_TipoUsuario(3, "cliente", "Este es el cliente", 2, 1);
  };

  String url = "jdbc:mysql://db4free.net:3306/artesanias_poe_2?useUnicode=true&characterEncoding=utf-8";
  String user = "root_art";
  String password = "12345678";
  public static Connection con;
  public BD() throws SQLException {
    super();
    this.con = DriverManager.getConnection(url, user, password);
  }

  public static int getLastUserId () {
    return usuarios.size() + 1;
  }

  public static int getLastUserTypeId () {
    return tiposUsuarios.get(tiposUsuarios.size()).getId();
  }

  public static void addUser(Modelo_Usuario user) {
    usuarios.add(user);
    for(int i = 0; i < usuarios.size(); i++) {
      Modelo_Usuario u = usuarios.get(i);
      System.out.println(u.getId() + " " + u.getCorreo() + " " + u.getEstado() + " " + u.getIdentificacion() + " " + u.getPassword() + " " + u.getUsername() + " " + u.getNombre_comleto());
      System.out.println("");
    }
  }

  public void addUserMysql (Modelo_Usuario user) throws SQLException {
    String sql = "INSERT INTO usuarios (username, password, tipo_usuario, correo, identificacion, estado, nombre_completo) VALUES (?, ? ,? ,?, ?, ?, ?);";
    PreparedStatement ps = con.prepareStatement(sql); // linea 48
    ps.setString(1, user.username);
    ps.setString(2, user.password);
    ps.setInt(3, user.getTipo_usuario().getId());
    ps.setString(4, user.correo);
    ps.setString(5, user.identificacion);
    ps.setInt(6, user.estado);
    ps.setString(7, user.getNombre_comleto());
    int filasAfectadas = ps.executeUpdate();
    System.out.println("Filas Afectadas: " + filasAfectadas);
  }

  public void selectAll () throws SQLException {
    Statement stmt = con.createStatement();
    String sql = "SELECT * FROM tipo_usaurios";
    ResultSet rs = stmt.executeQuery(sql);
    while (rs.next()) {
        int id = rs.getInt("id");
        String nombre = rs.getString("nombre");
        System.out.println(id + " - " + nombre);
    }
  }
}
