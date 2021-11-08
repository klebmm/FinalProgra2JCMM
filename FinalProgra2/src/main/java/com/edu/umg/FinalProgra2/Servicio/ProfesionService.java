/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Servicio;

import com.edu.umg.FinalProgra2.Tb_profesion;
import java.util.List;

/**
 *
 * @author Caleb
 */

public interface ProfesionService { //esta interfaz solo es la lista profesiones
    public List<Tb_profesion>LProff();
    
    public void saveProff(Tb_profesion proff);
    
    public void deleteProff(Tb_profesion proff);
    
    public Tb_profesion findProff(Tb_profesion proff);    
}
