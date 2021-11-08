/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2.Controller;

import com.edu.umg.FinalProgra2.Tb_profesion;
import com.edu.umg.FinalProgra2.Tb_usuario;
import com.edu.umg.FinalProgra2.Servicio.DepartamentoService;
import com.edu.umg.FinalProgra2.Servicio.ProfesionService;
import com.edu.umg.FinalProgra2.Servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Caleb
 */

@Controller
public class ClsController {

    @Autowired //Autowired sirve para inyectar la dependecia de UsuarioDaoI, generalmente se utiliza para inyectar una dependencia con otra
    private UsuarioService usuarioService;
    
    @Autowired //Autowired sirve para inyectar la dependecia de DepartamentoDaoI
    private DepartamentoService departamentoService;
        
    @Autowired //Autowired sirve para inyectar la dependecia de ProfesionDaoI
    private ProfesionService profesionService;
    
    @GetMapping("/")
    public String begin(Model model) {
        var Users = usuarioService.LUsers();
        model.addAttribute("usuario", Users);
        var States = departamentoService.LDepartamentos();
        model.addAttribute("dep", States);
        var Professions = profesionService.LProff();
        model.addAttribute("prof", Professions);
        return "Index";
    }
    
    @GetMapping("/agregar")
    public String insertUser(Tb_usuario user, Model model) {
        var States = departamentoService.LDepartamentos();
        model.addAttribute("dep", States);
        var Professions = profesionService.LProff();
        model.addAttribute("rof", Professions);
        model.addAttribute("separador", " - ");
        return "InsertUser";
    }
    
    @PostMapping("/guardar")
    public String saveUser(Tb_usuario user) {
        usuarioService.saveUser(user);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar/{id_usuario}")
    public String deleteUser(Tb_usuario user) {
        usuarioService.deleteUser(user);
        return "redirect:/";
    }

    @GetMapping("/agregar2")
    public String insertProff(Tb_profesion proff) {
        return "InsertProff";
    }


    @PostMapping("/guardar2")
    public String saveProff(Tb_profesion proff) {
        profesionService.saveProff(proff);
        return "redirect:/";
    }

    @GetMapping("/eliminar2/{id_profesion}")
    public String deleteProff(Tb_profesion proff) {
        profesionService.deleteProff(proff);
        return "redirect:/";
    }

    @GetMapping("/editar/{id_usuario}")
    public String editar(Tb_usuario user, Model model) {
        user = usuarioService.findUser(user);
        model.addAttribute("usuario", user);
        var states=departamentoService.LDepartamentos();
        model.addAttribute("departamento",states);
        model.addAttribute("separador", "-");
        var proff=profesionService.LProff();
        model.addAttribute("profesiones",proff);
        return "UpdateUser";
    }
    
    @GetMapping("/editar2/{id_profesion}")
    public String updateProff(Tb_profesion proff, Model model) {
        proff = profesionService.findProff(proff);
        model.addAttribute("profesion", proff);
        return "UpdateProff";
    }
}
