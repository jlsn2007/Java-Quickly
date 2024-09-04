package Controlador;

import Vista.frmMenuAdmin;
import Vista.panelCalendario;
import Vista.panelConfiguracion;
import Vista.panelPrincipaladmin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlfrmMenuAdmin implements MouseListener{
    
    frmMenuAdmin vista;
    panelPrincipaladmin Panel;
    
    public ctrlfrmMenuAdmin(frmMenuAdmin Vista, panelPrincipaladmin panel){
        
        this.vista = Vista;
        this.Panel = panel;
        
        vista.btnHome.addMouseListener(this);
        vista.btnCalendar.addMouseListener(this);
        vista.btnSettings.addMouseListener(this);
        Panel.btnPagregarus.addMouseListener(this);
        Panel.btnPasishoras.addMouseListener(this);
        Panel.btnPverhishoras.addMouseListener(this);
        Panel.btnPverus.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnHome){
            panelPrincipaladmin objpadmin = new panelPrincipaladmin();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objpadmin);
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        if(e.getSource() == vista.btnCalendar){
            panelCalendario objcal = new panelCalendario();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objcal);
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        if(e.getSource() == vista.btnSettings){
            panelConfiguracion objconfig = new panelConfiguracion();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objconfig);
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
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
