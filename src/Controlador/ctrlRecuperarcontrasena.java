package Controlador;

import Modelo.Usuario;
import Vista.frmRecuperarcontrasena;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlRecuperarcontrasena implements MouseListener, KeyListener{
    
    private Usuario ModeloUsrecucontra;
    private frmRecuperarcontrasena VistaRecucontrasena;
    
    public ctrlRecuperarcontrasena(Usuario ModeUsRecuperarcontrasena, frmRecuperarcontrasena VisRecuperarcontrasena){
    
        this.ModeloUsrecucontra = ModeUsRecuperarcontrasena;
        this.VistaRecucontrasena = VisRecuperarcontrasena;
        
        VisRecuperarcontrasena.txtCorreorecu.addMouseListener(this);
        VisRecuperarcontrasena.btnSiguiente.addMouseListener(this);
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
