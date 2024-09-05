package Controlador;

import Modelo.Comite;
import Modelo.Grado;
import Modelo.Rol;
import Modelo.Usuario;
import Vista.panelAgregarUsuarios;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class ctrlpanelAgregarUsuarios implements MouseListener, KeyListener{
    
    private panelAgregarUsuarios VistaUs;
    private Usuario ModeloUsuario;
    private Rol ModeloRol;
    private Grado ModeloGrado;
    private Comite ModeloComite;
    
    public ctrlpanelAgregarUsuarios(panelAgregarUsuarios vistaAgregarUsuarios, Usuario modUs, Rol modRol, Grado modGrado, Comite modComite){
        
        this.VistaUs = vistaAgregarUsuarios;
        this.ModeloUsuario = modUs;
        this.ModeloRol = modRol;
        this.ModeloGrado = modGrado;
        this.ModeloComite = modComite;
        
        this.VistaUs.btnAgregarusuario.addMouseListener(this);
        this.VistaUs.imgbtnEditar.addMouseListener(this);
        this.VistaUs.imgbtnEliminar.addMouseListener(this);
        this.VistaUs.jtbUsuarios.addMouseListener(this);
        
        this.VistaUs.cbGrado.addMouseListener(this);
        this.ModeloGrado.CargarComboboxGrados(VistaUs.cbGrado);
        this.VistaUs.cbRol.addMouseListener(this);
        this.ModeloRol.CargarComboboxRoles(VistaUs.cbRol);
        this.VistaUs.cbComite.addMouseListener(this);
        this.ModeloComite.CargarComboboxComites(VistaUs.cbComite);
        
        VistaUs.cbRol.addActionListener(e ->{
            if(e.getSource()== VistaUs.cbRol){
            Rol selectedItem =(Rol) VistaUs.cbRol.getSelectedItem();
            if(selectedItem != null){
                int idr=selectedItem.getId_rol();
                ModeloRol.setId_rol(idr);
            }
        }
        });
        
        VistaUs.cbGrado.addActionListener(e ->{
            if(e.getSource()== VistaUs.cbGrado){
                System.out.println("Combobox seleccionado");
            Grado selectedItem =(Grado) VistaUs.cbGrado.getSelectedItem();
            if(selectedItem != null){
                int idg=selectedItem.getId_grado();
                ModeloGrado.setId_grado(idg);
            }
            else{
                
            }
        }
        });
        
        VistaUs.cbComite.addActionListener(e ->{
            if(e.getSource()== VistaUs.cbComite){
            Comite selectedItem =(Comite) VistaUs.cbComite.getSelectedItem();
            if(selectedItem != null){
                String idc=selectedItem.getComite();
                ModeloComite.setComite(idc);
            }
        }
        });
        
        ModeloUsuario.Mostrar(VistaUs.jtbUsuarios);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource()== VistaUs.btnAgregarusuario){
            
            if (VistaUs.txtNombreus.getText().isEmpty()) {

                JOptionPane.showMessageDialog(VistaUs, "El nombre es obligatorio");
                return;
            } 
            
            if (!VistaUs.txtCorreous.getText().contains("@") || !VistaUs.txtCorreous.getText().contains(".com")) {
                JOptionPane.showMessageDialog(VistaUs, "Ingrese un correo válido");
                return;
            } 
            
            if (VistaUs.txtContraus.getText().length() < 7) {

                JOptionPane.showMessageDialog(VistaUs, "La contraseña debe tener más de 7 caracteres");
                return;
            } 
            
            ModeloUsuario.setNombre(VistaUs.txtNombreus.getText());
            ModeloUsuario.setCorreo_electronico(VistaUs.txtCorreous.getText());
            ModeloUsuario.setContraseña(VistaUs.txtContraus.getText());
            
            ModeloUsuario.GuardarUsuario();
            ModeloUsuario.Mostrar(VistaUs.jtbUsuarios);
  
        }
        
        if(e.getSource()== VistaUs.imgbtnEditar){
            
            ModeloUsuario.setNombre(VistaUs.txtNombreus.getText());
            ModeloUsuario.setCorreo_electronico(VistaUs.txtCorreous.getText());
            ModeloUsuario.setContraseña(VistaUs.txtContraus.getText());
            
            ModeloUsuario.ActualizarUsuario(VistaUs.jtbUsuarios);
            ModeloUsuario.Mostrar(VistaUs.jtbUsuarios);
  
        }
        
        if(e.getSource()== VistaUs.imgbtnEliminar){
            
            System.err.println("Se ha eliminado un Usuario");
            ModeloUsuario.EliminarUsuario(VistaUs.jtbUsuarios);
            ModeloUsuario.Mostrar(VistaUs.jtbUsuarios);
  
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
