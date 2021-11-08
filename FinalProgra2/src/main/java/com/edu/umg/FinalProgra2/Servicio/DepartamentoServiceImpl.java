/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Servicio;

import com.edu.umg.FinalProgra2.Dao.DepartamentoDaoI;
import com.edu.umg.FinalProgra2.Tb_departamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Caleb
 */

//aca se maneja e imlementa lo de la nterface anterior (DepartamentoService)
@Service //lo defino como servicio
public class DepartamentoServiceImpl implements DepartamentoService{
    @Autowired 
    private DepartamentoDaoI DepartamentoDaoI;
   
    @Override
    @Transactional(readOnly = true)
    public List<Tb_departamento> LDepartamentos() {
        return (List<Tb_departamento>) DepartamentoDaoI.findAll();       
    }
}
