/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4d.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name="CLIENTS") 
public class Client extends User implements Serializable {
    private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(name="CODE_CLIENT",unique=true,nullable = false,length = 10)
  private String code_client;
@Column(name="NOM_CLIENT",nullable = false,length = 30)
    private String nom_client;
@Column(name="NUM_TEL",nullable = false,length = 15)
  private String numero_tel ;
    @OneToOne
    private Compte compte;
    @ManyToMany
         @JoinTable(name="CLT_MESS",joinColumns =
         @JoinColumn(name = "CODE_CLIENT"),
         inverseJoinColumns = @JoinColumn(name = "ID_MESSAGE"))
         private Collection<Message> messages;
    public Client() {
    }

    public Client(String code_client, String nom_client, String numero_tel) {
        this.code_client = code_client;
        this.nom_client = nom_client;
        this.numero_tel = numero_tel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode_client() {
        return code_client;
    }

    public void setCode_client(String code_client) {
        this.code_client = code_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getNumero_tel() {
        return numero_tel;
    }

    public void setNumero_tel(String numero_tel) {
        this.numero_tel = numero_tel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.code_client);
        hash = 17 * hash + Objects.hashCode(this.nom_client);
        hash = 17 * hash + Objects.hashCode(this.numero_tel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.code_client, other.code_client)) {
            return false;
        }
        if (!Objects.equals(this.nom_client, other.nom_client)) {
            return false;
        }
        if (!Objects.equals(this.numero_tel, other.numero_tel)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", code_client=" + code_client + ", nom_client=" + nom_client + ", numero_tel=" + numero_tel + '}';
    }
    
    
}
