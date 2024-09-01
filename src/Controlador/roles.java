/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import javax.swing.JComboBox;

/**
 *
 * @author Mateo
 */
public class roles {
    private String UUID_rol;
    private String Nombre;
    
    
    public roles (){
    
    }
    
    public roles (String uuid, String nombre){
    this.UUID_rol= uuid;
    this.Nombre= nombre;
    }
    
    @Override
    public String toString(){
    return Nombre;
    }
    
    public void CargarComoRoles (JComboBox comboBox) {
    Connection conexion= Conexion.getConexion();
    comboBox.removeAllItems();
    try {
    Statement statement=conexion.createStatement();
    ResultSet rs=statement.executeQuery("select * from rol");
    while(rs.next()){
    String uuid=rs.getString("UUID_rol");
    String nombre=rs.getString("Nombre");
    comboBox.addItem(new roles(uuid, nombre));
    }
    
    }catch(SQLException e){
    e.printStackTrace();
    }
    }
}
