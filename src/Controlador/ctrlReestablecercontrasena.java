package Controlador;

import Modelo.Usuario;
import Vista.frmReestablecercontrasena;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ctrlReestablecercontrasena implements MouseListener, KeyListener{
    
    private Usuario ModeloUsrescontra;
    private frmReestablecercontrasena VistafrmRescontra;
    
    public ctrlReestablecercontrasena(Usuario ModeUsrescontra, frmReestablecercontrasena Visfrmrescontra){
        
        this.ModeloUsrescontra = ModeUsrescontra;
        this.VistafrmRescontra = Visfrmrescontra;
        
        Visfrmrescontra.txtNewcontra.addMouseListener(this);
        Visfrmrescontra.txtNewcontradnv.addMouseListener(this);
        Visfrmrescontra.btnSiguiente.addMouseListener(this);
        Visfrmrescontra.btnVolverrescontra.addMouseListener(this);
        
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == VistafrmRescontra.btnVolverrescontra) {
           Vista.frmCodigoverificacion.initfrmCodigoveri();
           VistafrmRescontra.dispose();
           return;
        }
         
        if (e.getSource() == VistafrmRescontra.btnSiguiente) {
            
            if (VistafrmRescontra.txtNewcontra.getText().length() < 7) {

                JOptionPane.showMessageDialog(VistafrmRescontra, "La contraseña debe tener más de 7 caracteres");
                return;
            }
            
            if (VistafrmRescontra.txtNewcontradnv.getText().length() < 7) {

                JOptionPane.showMessageDialog(VistafrmRescontra, "La contraseña debe tener más de 7 caracteres");
                return;
            } 
                      
        }
        
        else {
                Vista.frmContrasenarestablecida.initfrmContrares();
                VistafrmRescontra.dispose();
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
