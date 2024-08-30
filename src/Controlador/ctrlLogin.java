package Controlador;

import Modelo.Usuario;
import Vista.frmLogin;
import Vista.frmRecuperarcontrasena;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlLogin implements MouseListener, KeyListener{
    
     Usuario ModeloUsuario;
     frmLogin Vistalogin;
    
    public ctrlLogin(Usuario usuarios, frmLogin frmlogin){
        
        this.ModeloUsuario = usuarios;
        this.Vistalogin = frmlogin;
        
        frmlogin.btntxtRecucontra.addMouseListener(this);
        frmlogin.btnSiguiente.addMouseListener(this);
        frmlogin.txtCorreo.addMouseListener(this);
        frmlogin.txtContrasena.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == Vistalogin.btntxtRecucontra) {
            Vistalogin.setVisible(false);

            frmRecuperarcontrasena recuperarForm = new frmRecuperarcontrasena();

            recuperarForm.setVisible(true);
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

