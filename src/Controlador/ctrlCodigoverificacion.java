package Controlador;

import Modelo.Usuario;
import Vista.frmCodigoverificacion;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlCodigoverificacion implements MouseListener, KeyListener{
    
    private Usuario Modelous;
    private frmCodigoverificacion  VisCodigoverificacion;
    
    public ctrlCodigoverificacion(Usuario usuarios, frmCodigoverificacion VisCodigoverificacion){

        this.Modelous = usuarios;
        this.VisCodigoverificacion = VisCodigoverificacion;
        
        VisCodigoverificacion.txtCodigo.addMouseListener(this);
        VisCodigoverificacion.btnVerificarcodigo.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
