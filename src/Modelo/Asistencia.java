package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuel pc
 */
public class Asistencia {
     public ArrayList<String> obtenerAlumnos(){
    ArrayList<String> alumnos = new ArrayList<>();
    try{
        Connection conexion = ClaseConexion.getConexion();
        String query = "SELECT nombre FROM Usuario";
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()){
            alumnos.add(rs.getString("nombre"));
        }
        }catch(Exception e){
    e.printStackTrace();
          }
          return alumnos;
          
          
    }
     
     public void Buscar(JTable tabla, JTextField miTextField){
         Connection conexion = ClaseConexion.getConexion();
         
         DefaultTableModel modelo = new DefaultTableModel();
         modelo.setColumnIdentifiers(new Object[]{"nombre"});
         try {
             String sql = "SELECT * FROM Usuario WHERE nombre LIKE ? || '%";
             PreparedStatement deleteEstudiante = conexion.prepareStatement(sql);
             deleteEstudiante.setString(0, miTextField.getText());
             ResultSet rs = deleteEstudiante.executeQuery();
             
             while (rs.next()) {
                 modelo.addRow(new Object[]{rs.getString("nombre"),
                 false,
                 false});
                 
                 
             }
             tabla.setModel(modelo);
             
         } catch (Exception e) {
             System.out.println("Error en el metodo buscarAlumno");
         }
     }
        
    
    
}
