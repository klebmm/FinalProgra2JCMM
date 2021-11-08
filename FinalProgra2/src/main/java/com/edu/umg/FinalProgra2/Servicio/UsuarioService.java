/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Servicio;

import com.edu.umg.FinalProgra2.Tb_usuario;
import java.util.List;

/**
 *
 * @author Caleb
 */

public interface UsuarioService { //esta interfaz solo es la lista usuarios
    public List<Tb_usuario>LUsers();
    
    public void saveUser(Tb_usuario user);
    
    public void deleteUser(Tb_usuario user);
    
    public Tb_usuario findUser(Tb_usuario user);    
}
