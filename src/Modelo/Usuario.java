package Modelo;

import Vista.panelAgregarUsuarios;
import java.sql.*;
import java.util.UUID;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Usuario {
    
    String UUID_Usuario;
    String nombre;
    String correo_electronico;
    String contraseña;
    
    //Llaves foraneas
    int id_grado;
    int id_rol;
    int id_comite;

    public String getUUID_Usuario() {
        return UUID_Usuario;
    }

    public void setUUID_Usuario(String UUID_Usuario) {
        this.UUID_Usuario = UUID_Usuario;
    }

    public int getId_grado() {
        return id_grado;
    }

    public void setId_grado(int id_grado) {
        this.id_grado = id_grado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_comite() {
        return id_comite;
    }

    public void setId_comite(int id_comite) {
        this.id_comite = id_comite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = Encriptacion.SHA256(contraseña);
    }
    
    public void Actualizarcontra(Usuario usuario){
        Connection conexion = ClaseConexion.getConexion();
        try{
            PreparedStatement smpt = conexion.prepareStatement("UPDATE Usuarion set contraseña = ? WHERE correo_electronico = ?");
            smpt.setString(1, usuario.getContraseña());
            smpt.setString(2, usuario.getCorreo_electronico());
            smpt.executeUpdate();
        }
        catch(SQLException e){
            System.err.println("Error al actualizar la contraseña" + e.getMessage());
        }
    }
    
    public void Mostrar(JTable tabla) {

        Connection conexion = ClaseConexion.getConexion();

        DefaultTableModel modeloUsuario = new DefaultTableModel();
        modeloUsuario.setColumnIdentifiers(new Object[]{"UUID_Usuario", "nombre", "id_grado", "id_rol", "id_comite", "correo_electronico", "contraseña"});
        try {

            Statement statement = conexion.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM Usuario");

            while (rs.next()) {

                modeloUsuario.addRow(new Object[]{rs.getString("UUID_Usuario"), 
                    rs.getString("nombre"), 
                    rs.getInt("id_grado"),
                    rs.getInt("id_rol"),
                    rs.getInt("id_comite"),
                    rs.getString("correo_electronico"), 
                    rs.getString("contraseña")});
            }

            tabla.setModel(modeloUsuario);
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
    }
    
    public void cargarDatosTabla(panelAgregarUsuarios vista) {
        

        int filaSeleccionada = vista.jtbUsuarios.getSelectedRow();
        

        if (filaSeleccionada != -1) {
            String UUID_Usuario = vista.jtbUsuarios.getValueAt(filaSeleccionada, 0).toString();
            String nombre = vista.jtbUsuarios.getValueAt(filaSeleccionada, 1).toString();
            int id_grado = Integer.parseInt(vista.jtbUsuarios.getValueAt(filaSeleccionada, 2).toString());
            int id_rol = Integer.parseInt(vista.jtbUsuarios.getValueAt(filaSeleccionada, 3).toString());
            int id_comite = Integer.parseInt(vista.jtbUsuarios.getValueAt(filaSeleccionada, 4).toString());
            String correo_electronico = vista.jtbUsuarios.getValueAt(filaSeleccionada, 5).toString();
            String contraseña = vista.jtbUsuarios.getValueAt(filaSeleccionada, 6).toString();

            vista.txtNombreus.setText(nombre);
            vista.cbGrado.setSelectedItem(id_grado);
            vista.cbRol.setSelectedItem(id_rol);
            vista.cbComite.setSelectedItem(id_comite);
            vista.txtNombreus.setText(correo_electronico);
            vista.txtContraus.setText(contraseña);
        }
    }
    
    public void GuardarUsuario(){
        
        Connection conexion = ClaseConexion.getConexion();
        
        try {
            
            PreparedStatement newUs = conexion.prepareStatement ("Insert into Usuario (UUID_Usuario, nombre, id_grado, id_rol, id_comite, contraseña, correo_electronico) Values (?, ?, ?, ?, ?, ?, ?)");
            
            newUs.setString (1, UUID.randomUUID().toString());
            newUs.setString (2, getNombre());
            newUs.setInt (3, getId_grado());
            newUs.setInt (4, getId_rol());
            newUs.setInt (5, getId_comite());
            newUs.setString (6, getContraseña());
            newUs.setString (7, getCorreo_electronico());
            
            newUs.executeUpdate();

        } 
        
        catch (SQLException ex) {
            System.out.println("este es el error en el modelo: metodo guardar " + ex) ;
        }
                
    }
    
    public void ActualizarUsuario(JTable tabla){
        
        Connection conexion = ClaseConexion.getConexion();
        
        int filaseleccionada = tabla.getSelectedRow();
        if(filaseleccionada != 1){
            String UUIDus = tabla.getValueAt(filaseleccionada, 0).toString();
            try{
                PreparedStatement Actualizarus = conexion.prepareStatement("UPDATE Usuario set nombre =?, id_grado =?, id_rol=?, id_comite=?, correo_electronico =?, contraseña =? WHERE UUID_Usuario =?");
                Actualizarus.setString(1, getNombre());
                Actualizarus.setInt (2, getId_grado());
                Actualizarus.setInt(3, getId_rol());
                Actualizarus.setInt(4, getId_comite());
                Actualizarus.setString(5, getCorreo_electronico());
                Actualizarus.setString(6, getContraseña());
                Actualizarus.setString(7, UUIDus);
                Actualizarus.executeUpdate();
            }
            catch(Exception e){
                System.out.println("este es el error en el metodo de actualizar" + e);
            }
        }
        else {
            System.out.println("no funciona actualizar");
        }

    }
    
    public void EliminarUsuario(JTable tabla){
        
        Connection conexion = ClaseConexion.getConexion();
        
        int filaSeleccionada = tabla.getSelectedRow();
        
        String miId = tabla.getValueAt(filaSeleccionada, 0).toString();
        
        try{
            PreparedStatement EliminarUsuario = conexion.prepareStatement("DELETE FROM Usuario WHERE UUID_Usuario =?");
            EliminarUsuario.setString(1, miId);
            EliminarUsuario.executeUpdate();
        }
        catch(Exception e){
            System.out.println("este es el error metodo de eliminar" + e);
        }
    }
    
    public boolean Usuario(){
        
        Connection conexion = ClaseConexion.getConexion();
        boolean resultado = false;
        
        try {
          
            String sql = "Select * from Usuario WHERE correo_electronico = ? AND cotraseña = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1,getCorreo_electronico());
            statement.setString(2,getContraseña());
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                resultado = true;
            }

        } 
        
        catch (Exception ex) {
            System.out.println("Error en el modélo: En el método Iniciar sesión ha ocurrido: " + ex);
        }
        
        return resultado;
    }
    
}


