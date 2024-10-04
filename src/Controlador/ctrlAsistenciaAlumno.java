package Controlador;

import Modelo.Asistencia;
import Modelo.ClaseConexion;
import Vista.frmAsistenciaAlumno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ctrlAsistenciaAlumno {
    private Asistencia modelo;
    private frmAsistenciaAlumno vista;
    
    public ctrlAsistenciaAlumno(Asistencia modelo, frmAsistenciaAlumno vista){
    this.modelo = modelo;
    this.vista = vista;
    mostrarAlumnos();
    }
    
    public void mostrarAlumnos(){
        ArrayList<String> alumnos = modelo.obtenerAlumnos();
        DefaultTableModel tableModel = (DefaultTableModel) vista.getTable().getModel(); 
        
        for (String alumno : alumnos){
            tableModel.addRow(new Object[]{alumno, false, false, ""});
        }
   }
   
    //////////////////////////////////////////////////////////////////////////////////////////////////      
    
    public void Mostrar(JTable tabla) {
    // Creamos una variable de la clase de conexion
    Connection conexion = ClaseConexion.getConexion();
    // Definimos el modelo de la tabla con las columnas, agregando una columna para los CheckBox ("Disponible")
    DefaultTableModel modeloDatos = new DefaultTableModel() {
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            // Definimos que la última columna sea de tipo Boolean para los CheckBox
            if (columnIndex == 4) {
                return Boolean.class;
            }
            return String.class; // Otras columnas serán texto
        }
 
        @Override
        public boolean isCellEditable(int row, int column) {
            // Hacemos que solo la columna del CheckBox sea editable
            return column == 4;
        }
    };
    // Definimos las columnas
    modeloDatos.setColumnIdentifiers(new Object[]{""});
    try {
        // Creamos un Statement
        Statement statement = conexion.createStatement();
        // Ejecutamos el Statement con la consulta y lo asignamos a una variable de tipo ResultSet
        ResultSet rs = statement.executeQuery("SELECT * FROM Usuario");
        // Recorremos el ResultSet
        while (rs.next()) {
            // Aqui� puedes poner una condición para establecer la disponibilidad (CheckBox)
            boolean disponible = rs.getInt("") > 2000; 
            
            // Llenamos el modelo por cada vez que recorremos el ResultSet
            modeloDatos.addRow(new Object[]{
                
                rs.getString("nombre"), 
                
                disponible // Añadimos el valor booleano para el CheckBox
            });
        }
        // Asignamos el nuevo modelo lleno a la tabla
        tabla.setModel(modeloDatos);
    } catch (Exception e) {
        System.out.println("Este es el error en el modelo, metodo mostrar " + e);
    }
}
    
}
