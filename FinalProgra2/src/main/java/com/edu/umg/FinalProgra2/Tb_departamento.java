/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.umg.FinalProgra2;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Caleb
 */

@Data
@Entity
@Table(name = "tb_departamento")
public class Tb_departamento implements Serializable{    
    private  static final long seialVersionUTD=1L;
    @Id //llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para que lo autoincremente
    private Long id_depto;
    private String descripcion_depto;
}
