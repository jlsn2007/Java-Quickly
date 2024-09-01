/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vista.frmRegistroCuenta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class ctrlRegistro implements MouseListener { 
    //1- llamar a las otras capas
    Usuario modelo;
    frmRegistroCuenta vista;
    
    //2-Constructor
    public ctrlRegistro (Usuario Modelo, frmRegistroCuenta Vista) {
    this.modelo = Modelo;
    this.vista = Vista;
    
    vista.btnRegistroCuenta.addMouseListener(this);
    vista.cbRegistroCuenta.addMouseListener(this);
    this.Usuario.CargarComboUsuarios(vista.cbRegistroCuenta);
    
    //obtener el UUID del rol seleccionado 
    Usuario.cbRegistroCuenta.addActionListener(e -> {
    if (e.getSource () == Vista.cbRegistroCuenta) {
    Usuarios selectedItem = (Usuarios) Vista.cbRegistroCuenta.getSelectedItem();
    if (selectedItem != null) {
    String UUID = selectedItem.getUUID_Usuario ();
    Usuario.setUUID_Usuario(UUID);
    }
    }
    });
    
    
    
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getSource() == vista.btnRegistroCuenta) {
    modelo.setNombre(vista.txtNombreRegistroCuenta.getText ());
    modelo.setCorreo(vista.txtCorreoRegistroCuenta.getText());
    modelo.setContraseña(vista.txtContraseñaRegistroCuenta.getText());
    modelo.setUUID_Usuario(Usuario.getUUID_Usuario());
    
    modelo.GuardarUsuario();
    
    //Muestro una alerta que el usuario se ha guardado
    JOptionPane.showMessageDialog(vista, "Usuario guardado");
    }
    
    //Clic al boton de ir al login
    
    }
    
    

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
