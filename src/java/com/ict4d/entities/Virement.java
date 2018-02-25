/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4d.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ndjaka
 */
@Entity
@DiscriminatorValue("VIR")
@Table(name="VIREMENT")
public class Virement extends Operation implements  Serializable {

   
 
    @Column(name="NUM_CPTE_DEB")
    private String num_compte_debite;
    @Column(name="NUM_CPTE_CRE")
    private String num_compte_credite;
    @ManyToOne
    @JoinColumn(name="CODE_CLIENT")
    private Client client;

    public Virement() {
        
    }

    public Virement(String num_compte_debite, String num_compte_credite, Date dateOperation, double montant) {
        super(dateOperation, montant);
        this.num_compte_debite = num_compte_debite;
        this.num_compte_credite = num_compte_credite;
    }



    public String getNum_compte_debite() {
        return num_compte_debite;
    }

    public void setNum_compte_debite(String num_compte_debite) {
        this.num_compte_debite = num_compte_debite;
    }

    public String getNum_compte_credite() {
        return num_compte_credite;
    }

    public void setNum_compte_credite(String num_compte_credite) {
        this.num_compte_credite = num_compte_credite;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        
        hash = 79 * hash + Objects.hashCode(this.num_compte_debite);
        hash = 79 * hash + Objects.hashCode(this.num_compte_credite);
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
        final Virement other = (Virement) obj;
        if (!Objects.equals(this.num_compte_debite, other.num_compte_debite)) {
            return false;
        }
        if (!Objects.equals(this.num_compte_credite, other.num_compte_credite)) {
            return false;
        }
       
        return true;
    }
    
    
    
}
