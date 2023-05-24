package Vista;


import javax.swing.table.DefaultTableModel;


public class ModeloTabla extends DefaultTableModel{
    
    public ModeloTabla(Object datos[][], Object encazados[]){
        super(datos, encazados);
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
}
