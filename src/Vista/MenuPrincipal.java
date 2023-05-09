package Vista;

import Controladores.Controlador_MenuPrincipal;
import Entidades.Datos;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 * @author Saday G
 */
public class MenuPrincipal extends JFrame{
    
    public JButton jbAdmin,jbCliente,jbProductos;
   public JLabel jlTitulo,jlImg;
   public ArrayList<Datos> arregloPersonas = new ArrayList<>();
    
    public MenuPrincipal(){
         super ("Menu Principal");// Creacion del JFrame
        //Configuracion del JFrame
        setSize(1000,500);// px en ancho y alto
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        crearGUI();
        
        setVisible(true);
         
    }
  

    private void crearGUI() {
        jlTitulo = new JLabel   ("<html><center>Artesanias Blafe <br>");
        jlTitulo.setBounds(0, 0, 1000, 60);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(new Color(156,138,60));
        jlTitulo.setForeground(Color.WHITE);
        jlTitulo.setFont(new Font("Algerian", Font.BOLD|Font.ITALIC,25));
        jlTitulo.setHorizontalAlignment(JLabel.CENTER); 
        add(jlTitulo);
        ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/Logo.png"));
        jlImg = new JLabel(i);
        jlImg.setBounds(20,80,256,256);
        jlImg.setBorder(new LineBorder(new Color(156,138,60)));
        add (jlImg);
        ImageIcon ii = new ImageIcon(getClass().getResource("/Imagenes/Logo.png"));
        jlImg = new JLabel(ii);
        jlImg.setBounds(700,80,256,256);
        jlImg.setBorder(new LineBorder(new Color(156,138,60)));
        add (jlImg);
        jbAdmin= new JButton("Login");
        jbAdmin.setBounds(400,100,200,30);
        jbAdmin.setForeground(Color.BLUE);
        Controlador_MenuPrincipal mpc = new Controlador_MenuPrincipal(this);
        jbAdmin.addActionListener(mpc);
        add(jbAdmin);
        jbCliente = new JButton("Provedores");
        jbCliente.setBounds(400, 150,200,30);
        jbCliente.setForeground(Color.BLUE);
        add(jbCliente);
        jbProductos = new JButton("Productos");
        jbProductos.setBounds(400, 200,200,30);
        jbProductos.setForeground(Color.BLUE);
        add(jbProductos);
        
        
    }
    public static void main(String[] args) {
        MenuPrincipal mp = new MenuPrincipal();
    
    }    
}