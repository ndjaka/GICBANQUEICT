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
@DiscriminatorValue("DEP")
public class Depot extends Operation implements Serializable {

    public Depot() {
    }

    public Depot(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }

    
}
