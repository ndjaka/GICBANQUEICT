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
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte implements Serializable {
    private double taux_interet;

    public CompteEpargne() {
        super();
    }

    public CompteEpargne(double taux_interet, String codecompte, double solde, Date datecreation) {
        super(codecompte, solde, datecreation);
        this.taux_interet = taux_interet;
    }

    public double getTaux_interet() {
        return taux_interet;
    }

    public void setTaux_interet(double taux_interet) {
        this.taux_interet = taux_interet;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" + "taux_interet=" + taux_interet + '}';
    }

   
    
}
