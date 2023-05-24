package Vista;

import Controlador.ListadoUsuarios_Control;
import Modelo.ListadoUsuarios_Modelo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;

public class ListadoUsuario extends JFrame{
    
    public MenuPrincipal mp;
    public ModeloTabla mt;
    public JTable tabla;
    public JButton jbVolver;
    
    public ListadoUsuario(MenuPrincipal obj){
        super("Listado de personas");
        mp = obj;
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        crearGUI();
        ListadoUsuarios_Modelo lum = new ListadoUsuarios_Modelo(this);
        lum.addRegistros();
        
        setVisible(true);
    }
    
    private void crearGUI() {
        JLabel jl = new JLabel("  Listado de personas");
        jl.setBounds(0, 0, 600, 50);
        jl.setBorder(new EtchedBorder());
        jl.setOpaque(true);
        jl.setBackground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(jl);
        
        String encabezados[] = {"Correo","Nombre Completo"};
        String datos[][] = {{"", ""}};
        
        mt = new ModeloTabla(datos, encabezados);
        tabla = new JTable(mt);
        
        tabla.setSelectionBackground(Color.lightGray);
        tabla.setSelectionForeground(Color.RED);
                
        JScrollPane js = new JScrollPane(tabla);
        js.setBounds(20, 60, 550, 350);        
        add(js);
        
        ListadoUsuarios_Control lpc = new ListadoUsuarios_Control(this);
        jbVolver = new JButton("Volver al menu principal");
        jbVolver.setBounds((600-250)/2, 420, 250, 25);
        jbVolver.addActionListener(lpc);
        add(jbVolver);
    }    
}

