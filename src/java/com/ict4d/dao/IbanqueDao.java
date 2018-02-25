/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4d.dao;

import com.ict4d.entities.Client;
import com.ict4d.entities.Compte;
import com.ict4d.entities.Employe;
import com.ict4d.entities.Message;
import com.ict4d.entities.Operation;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ndjaka
 */
public interface IbanqueDao {
    Compte creerCompteClient(Compte compte,Client client);
    Employe creerCompteEmp(Employe emp);
    void deleteEmploye(int id);
    void deleteMessage(int id);
    Compte updateCompteClient(Compte compte);
    Employe updateEmploye(Employe employe);
    
    void SendMessage(Message m);
    Operation addOperation(Operation op,String codeCp,Long codeEmp); 
    
    void imprimerFacture(String nomClient,Double montant,Date dateImpression,String numCompte);
    List<Employe> listerEmploye();
    List<Message> listerMessage();
    List<Client> listerClient();
    List<Client>  rechercherClientParMC(String MC);
    List<Employe>  rechercherEmployeParMC(String MC);
    
    void retrait(Long codeEmploye,String codeCompte,double montant,String numeroTel);
    void depot(Long codeEmploye,String codeCompte,double montant,String numeroTel);
    void virementEffectuerParEmp(String codeCompte1,String codeCompte2,double montant,Long codeEmploye);
    
    boolean confirmerRetrait(String codeClient);
    double consultersonSolde(String codeCompte,String codeClient);

    void virementEffectuerParCli(String codeCompte1,String codeCompte2,double montant);
    List<String> voirInformation();
    List<Operation> voirTransation(String codeClient);

   
}
