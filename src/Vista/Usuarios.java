
package Vista;

import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controladores.Controlador_Usuarios;

/**
 *
 * @author Saday G
 */
public class Usuarios extends JFrame{
    public JTextField jtid,jtidentificacion,jtnombre_completo,jtcorreo;
    public JPasswordField jtcontraseña;
    public JLabel jlTitulo;
    public JButton jbGuardar,jbVolver,jbLimpiar;
    public JComboBox<String> tipo_usuario;
    public MenuPrincipal mp;
    
    public Usuarios(MenuPrincipal obj){
         super ("Usuarios");// Creacion del JFrame
         mp = obj;
        //Configuracion del JFrame
        setSize(800,500);// px en ancho y alto
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        crearGUI();
        
        setVisible(true);
         
    }

    private void crearGUI() {
        jlTitulo = new JLabel("<html><center>Registro De Usuarios <br>");
        jlTitulo.setBounds(0, 0, 800, 60);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(new Color(156,138,60));
        jlTitulo.setForeground(Color.WHITE);
        jlTitulo.setFont(new Font("Algerian", Font.BOLD|Font.ITALIC,25));
        jlTitulo.setHorizontalAlignment(JLabel.CENTER); 
        add(jlTitulo);
        //-------------ID--------------
        JLabel jlid = new JLabel("Id: ");
        jlid.setBounds(280,90,120,30);
        add(jlid);
        jtid = new JTextField();
        jtid.setBounds(315,90, 200,30);
        jtid.setToolTipText("Ingrese el id");
        add(jtid);
        //------------------identificacion--------------------------
        JLabel jlidentificacion = new JLabel("C.C: ");
        jlidentificacion.setBounds(280,130,120,30);
        add(jlidentificacion);
        jtidentificacion = new JTextField();
        jtidentificacion.setBounds(315,130, 200,30);
        jtidentificacion.setToolTipText("Ingrese su identificacion");
        add(jtidentificacion);
        //-----------------------tipo de usuario---------------------
        JLabel jltipo_usuario = new JLabel("Tipo de Usuario: ");
        jltipo_usuario.setBounds(215,170,120,30);
        add(jltipo_usuario);
        String[] opciones = {"Admin", "Cliente", "Operario"};
        tipo_usuario = new JComboBox<>(opciones);
        add(tipo_usuario);
        tipo_usuario.setBounds(320,170,180,30);
        tipo_usuario.setForeground(Color.BLUE);
        //----------------------Nombre----------------------
        JLabel jlnombre_completo = new JLabel("Nombre Completo: ");
        jlnombre_completo.setBounds(200,210,120,30);
        add(jlnombre_completo);
        jtnombre_completo = new JTextField();
        jtnombre_completo.setBounds(315,210, 200,30);
        jtnombre_completo.setToolTipText("Ingrese su nombre completo");
        add(jtnombre_completo);
        //----------------------Correo----------------------
        JLabel jlcorreo = new JLabel("Correo: ");
        jlcorreo.setBounds(265,250,120,30);
        add(jlcorreo);
        jtcorreo = new JTextField();
        jtcorreo.setBounds(315,250, 200,30);
        jtcorreo.setToolTipText("Ingrese un correo");
        add(jtcorreo);
         //----------------------Contraseña----------------------
        JLabel jlcontraseña= new JLabel("Contraseña: ");
        jlcontraseña.setBounds(240,290,120,30);
        add(jlcontraseña);
        jtcontraseña = new JPasswordField();
        jtcontraseña.setEchoChar('*');
        jtcontraseña.setBounds(315,290, 200,30);
        jtcontraseña.setToolTipText("Ingrese una contraseña");
        JButton mostrar = new JButton("Ver");
        mostrar.setBounds(520, 300,70,20);
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (jtcontraseña.getEchoChar() == (char) 0) {
                    // Si ya se está mostrando el texto, volver a ocultarlo
                    jtcontraseña.setEchoChar('*');
                    mostrar.setText("ver");
                } else {
                    // Si no se está mostrando el texto, mostrarlo
                    jtcontraseña.setEchoChar((char) 0);
                    mostrar.setText("ver");
                }
            }
        });
        add(mostrar);
        add(jtcontraseña);
    //----------------------Boton de guardar----------------------
    jbGuardar = new JButton("Guardar");
    jbGuardar.setBounds(340,420, 150, 30);
    jbGuardar.setMnemonic('G');
    Controlador_Usuarios uc = new Controlador_Usuarios(this);
    //jbGuardar.addActionListener(usc);
    jbGuardar.addActionListener(uc);
    add(jbGuardar);
    
    jbVolver = new JButton("Volver");
    jbVolver.setBounds(340,380, 150, 30);
    jbVolver.addActionListener(uc);
    jbVolver.setMnemonic('V');
    add(jbVolver);
    
    }
}
