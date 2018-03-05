/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4d.DaoImpl;

import com.ict4d.entities.Client;
import com.ict4d.entities.Compte;
import com.ict4d.entities.Employe;
import com.ict4d.entities.Message;
import com.ict4d.entities.Operation;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ict4d.dao.IbanqueDao;
import com.ict4d.entities.CompteCourant;
import com.ict4d.entities.Depot;
import com.ict4d.entities.Retrait;
import com.ict4d.entities.Virement;
import javax.persistence.Query;

/**
 *
 * @author ndjaka
 */
@Stateless
public class BanqueDaoImpl  implements IbanqueDao{

    @PersistenceContext(unitName = "projet_bankPU")
    private EntityManager em;

    @Override
    public Compte creerCompteClient(Compte compte, Long  codecli,Long codeEmp) {
        Client client = em.find(Client.class, codecli);
        Employe employe = em.find(Employe.class, codeEmp);
        compte.setClient(client);
        compte.setEmploye(employe);
        em.persist(compte);
             
       
        //throw new UnsupportedOperationException("Not supported yet."); 
        return compte;
        
    }

    @Override
    public Employe creerCompteEmp(Employe emp) {
        em.persist(emp);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return emp;
    }

    @Override
    public void deleteEmploye(int id) {
      
       Employe employe  = em.find(Employe.class, id);
       em.remove(employe);
       
    }

    @Override
    public void deleteMessage(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compte updateCompteClient(Compte compte) {
            em.merge(compte);
            return compte;
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SendMessage(Message m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operation addOperation(Operation op, String codeCp, Long codeEmp) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Date d = new Date(),dateOp ;
        dateOp = new Date(d.getYear(), d.getMonth(), d.getDate());
        Compte cp = consulterCompte(codeCp);
        Employe employe = em.find(Employe.class, codeEmp);
        op.setCompte(cp);
        op.setEmploye(employe);
        op.setDateOperation(dateOp);
        em.persist(op);
        return op;
    }

    @Override
    public void imprimerFacture(String nomClient, Double montant, Date dateImpression, String numCompte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employe> listerEmploye() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Message> listerMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> listerClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> rechercherClientParMC(String MC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employe> rechercherEmployeParMC(String MC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*
    je vais faire appel a la fonction envoyer message
    et dans la fonction envoyer je ferai appel a la fonction recevoir qui va me retourner le dernier mesaage
    
    */

    @Override
    public void retrait(Long codeEmploye, String codeCompte, double montant) {
       addOperation(new Retrait(new Date(), montant), codeCompte, codeEmploye);
             
            Compte cpte = consulterCompte(codeCompte);
            cpte.setSolde(cpte.getSolde()-montant);
             
             
    }

    @Override
    public void depot(Long codeEmploye, String codeCompte, double montant) {
         addOperation(new Depot(new Date(), montant), codeCompte, codeEmploye);
             
            Compte cpte = consulterCompte(codeCompte);
            cpte.setSolde(cpte.getSolde()+montant);
     }

    @Override
    public void virementEffectuerParEmp(String codeCompte1, String codeCompte2, double montant, Long codeEmploye) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools| Templates.
        retrait(codeEmploye, codeCompte1, montant);
        depot(codeEmploye, codeCompte2, montant);
         Operation versement_parEmp = new Virement(codeCompte1, codeCompte2,new Date(), montant);
         em.persist(versement_parEmp);
         
    }

    @Override
    public boolean confirmerRetrait(String codeClient) {
        Client c = em.find(Client.class, codeClient);
        return c != null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void virementEffectuerParCli(String codeCompte1, String codeCompte2, double montant) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Operation versement_parCLient = new Virement(codeCompte1, codeCompte2,new Date(), montant);
         em.persist(versement_parCLient);
        
       
    }

    @Override
    public List<String> voirInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Operation> voirTransation(String codeClient) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools| Templates.
        Query query = em.createQuery("select o from Operation o where o.compte.codeCompte=:x");
        query.setParameter("x", codeClient);
        return query.getResultList();
    }

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Compte consulterCompte(String numCpte) {
        Compte cpte=em.find(Compte.class, numCpte);
        if(cpte==null) throw new RuntimeException("Compte "+numCpte+ "n'existe pas");
         
        return cpte;
    }

    @Override
    public double consulterSolde(String codeClient) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          Client cl =  em.find(Client.class, codeClient);
          if(cl!=null){
             
              return  cl.getCompte().getSolde();
          }else{
              throw new RuntimeException("Compte "+cl.getCompte()+ "n'existe pas");
          }
    }

  

  

}
