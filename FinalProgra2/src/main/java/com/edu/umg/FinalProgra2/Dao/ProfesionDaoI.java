/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Dao;

import com.edu.umg.FinalProgra2.Tb_profesion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Caleb
 */
//en esta parte genero todo el crud en el objeto Profesion para implemetarlo en esta interface
public interface ProfesionDaoI extends  CrudRepository<Tb_profesion, Long> {
    
}
