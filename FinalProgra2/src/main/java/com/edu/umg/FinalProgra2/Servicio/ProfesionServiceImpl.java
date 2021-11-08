/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Servicio;

import com.edu.umg.FinalProgra2.Tb_profesion;
import com.edu.umg.FinalProgra2.Dao.ProfesionDaoI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Caleb
 */

//aca se maneja e imlementa lo de la nterface anterior (ProfesionService)
@Service //lo defino como servicio
public class ProfesionServiceImpl implements ProfesionService {
    @Autowired
    private ProfesionDaoI ProfesionDaoI;

    @Override
    @Transactional(readOnly = true)
    public List<Tb_profesion> LProff() {
        return (List<Tb_profesion>) ProfesionDaoI.findAll();       
    }

    @Override
    @Transactional
    public void saveProff(Tb_profesion proff) {
       ProfesionDaoI.save(proff);      
    }

    @Override
    @Transactional
    public void deleteProff(Tb_profesion proff) {
        ProfesionDaoI.delete(proff);        
    }

    @Override
    @Transactional(readOnly = true)
    public Tb_profesion findProff(Tb_profesion proff) {
       return ProfesionDaoI.findById(proff.getId_profesion()).orElse(null);       
    }  
}
