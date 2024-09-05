package Controlador;

import Vista.frmMenuAdmin;
import Vista.panelAgregarUsuarios;
import Vista.panelPrincipaladmin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlpanelPrincipaladmin implements MouseListener{
    
    frmMenuAdmin Vista;
    panelAgregarUsuarios VistapanelAgregarUsuarios;
    panelPrincipaladmin Panel;
    panelAgregarUsuarios PanelAgregarUsuarios;
    
    public ctrlpanelPrincipaladmin (frmMenuAdmin vista,panelAgregarUsuarios vistapagregarus, panelPrincipaladmin panel, panelAgregarUsuarios panelagregus){
        
        this.Vista = vista;
        this.VistapanelAgregarUsuarios = vistapagregarus;
        this.Panel = panel;
        this.PanelAgregarUsuarios = panelagregus;
        
        Vista.btnHome.addMouseListener(this);
        Vista.btnCalendar.addMouseListener(this);
        Vista.btnSettings.addMouseListener(this);
        
        Panel.btnPagregarus.addMouseListener(this);
        Panel.btnPasishoras.addMouseListener(this);
        Panel.btnPverhishoras.addMouseListener(this);
        Panel.btnPverus.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == Panel.btnPagregarus) {
            panelAgregarUsuarios objAgregarUsuarios = new panelAgregarUsuarios();
            
            Vista.jpContenedor.removeAll();
            Vista.jpContenedor.add(objAgregarUsuarios);
            Vista.jpContenedor.revalidate();
            Vista.jpContenedor.repaint();
            
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
    
    
}
