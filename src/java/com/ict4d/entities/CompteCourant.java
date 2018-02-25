/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4d.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author admin
 */
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte implements Serializable {
   
    private double decouvert;

    public CompteCourant() {
        super();
    }
    

    public CompteCourant(double decouvert, String codecompte, double solde, Date datecreation) {
        super(codecompte, solde, datecreation);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.decouvert) ^ (Double.doubleToLongBits(this.decouvert) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CompteCourant other = (CompteCourant) obj;
        if (Double.doubleToLongBits(this.decouvert) != Double.doubleToLongBits(other.decouvert)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CompteCourant{" + "decouvert=" + decouvert + '}';
    }
 
    
   


    
}
