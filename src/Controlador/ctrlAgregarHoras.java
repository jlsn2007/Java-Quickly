package Controlador;

import Modelo.AgregarHoras;
import Vista.frmAgregarHoras;


public class ctrlAgregarHoras {
    
    private AgregarHoras Modelo;
    private frmAgregarHoras Vista;
    
    public ctrlAgregarHoras(AgregarHoras modelo, frmAgregarHoras vista){
        this.Modelo = modelo;
        this.Vista = vista;
        agregarHoras();
    }
    
    public void agregarHoras(){
        
    }
    
}
