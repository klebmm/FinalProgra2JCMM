/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Dao;

import com.edu.umg.FinalProgra2.Tb_usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Caleb
 */
//en esta parte genero todo el crud en el objeto Usuario para implemetarlo en esta interface
public interface UsuarioDaoI extends CrudRepository<Tb_usuario, Long> {
    
}
