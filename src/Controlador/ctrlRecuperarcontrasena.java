package Controlador;

import Modelo.EnviarCorreos;
import Modelo.Usuario;
import Vista.frmRecuperarcontrasena;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


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
        if(e.getSource() == VistaRecucontrasena.btnSiguiente){
        
             Random random = new Random();
        
            int numeroAleatorio = 1000 + random.nextInt(9000);

            String recipient = VistaRecucontrasena.txtCorreorecu.getText();
            String subject = "Recuperacion de contraseña";
            String content = "Este es el codigo de recuperacion" + numeroAleatorio;

            EnviarCorreos.enviarCorreo(recipient, subject, content);

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
