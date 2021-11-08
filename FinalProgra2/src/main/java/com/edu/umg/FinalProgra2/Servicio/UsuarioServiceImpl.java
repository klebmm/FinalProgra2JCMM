/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Servicio;

import com.edu.umg.FinalProgra2.Tb_usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.umg.FinalProgra2.Dao.UsuarioDaoI;

/**
 *
 * @author Caleb
 */

//aca se maneja e imlementa lo de la nterface anterior (UsuarioService)
@Service //lo defino como servicio
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDaoI UsuarioDaoI;
  
    
    @Override
    @Transactional(readOnly = true)
    public List<Tb_usuario> LUsers() {
        return (List<Tb_usuario>) UsuarioDaoI.findAll();
    }

    @Override
    @Transactional
    public void saveUser(Tb_usuario user) {
       UsuarioDaoI.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Tb_usuario user) {
       UsuarioDaoI.delete(user);
    }

    @Override
    @Transactional(readOnly = true)
    public Tb_usuario findUser(Tb_usuario user) {
        return  UsuarioDaoI.findById(user.getId_usuario()).orElse(null);
    }   
}
