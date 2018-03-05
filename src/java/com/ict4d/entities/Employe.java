/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4d.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name="EMPLOYE")
public class Employe extends User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="CODE_EMP")
    private Long codeEmploye;
    @Column(name="NOM_EMP")
    private String nomEmploye;
         public Employe() {
        super();
        
    }
    public Employe(Long codeEmploye, String nomEmploye, String login, String password) {
        super(login, password);
        this.codeEmploye = codeEmploye;
        this.nomEmploye = nomEmploye;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodeEmploye() {
        return codeEmploye;
    }

    public void setCodeEmploye(Long codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    @Override
    public String getRole() {
        //throw new UnsupportedOperationException("Not supported yet."); 
       //To change body of generated methods, choose Tools | Templates.
       return "Employe";
    }
    
}
