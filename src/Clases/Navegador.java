package Clases;

import vista.*;

public class Navegador {
    public gestionConductores gCond;
    public vistaPrincipal index;
    public regConductores rCond;
    public gestionVehiculos gVeh;
    public regVehiculo rVeh;
    public regSE rse;
    public login log;
    public Navegador(){
        log = new login(this);
        gCond = new gestionConductores(this);
        index = new vistaPrincipal(this);
        rCond = new regConductores(this);
        gVeh = new gestionVehiculos(this);
        rVeh = new regVehiculo(this);
        rse = new regSE(this);
    }
}
