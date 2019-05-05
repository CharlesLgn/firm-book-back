package com.lgn.firmbook.metier.manager;

import com.lgn.firmbook.metier.objet.Utilisateur;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class UtilisateurManager extends HibernateFactory<Utilisateur> {

  public UtilisateurManager() {
    super(Utilisateur.class);
  }

  public Utilisateur exist(String user, String psw) {
    Session session = getSession();
    Query query = session.createQuery("SELECT utilisateur from Utilisateur as utilisateur where utilisateur.login = :user and utilisateur.motDePasse = :psw");
    query.setParameter("user", user);
    query.setParameter("psw", psw);
    Utilisateur res = (Utilisateur)query.getSingleResult();
    session.close();
    return res;
  }

  @Override
  public List<Utilisateur> getAll() {
    Session session = getSession();
    Query query = session.createQuery("SELECT utilisateur from Utilisateur as utilisateur");
    List<Utilisateur> res = (List<Utilisateur>)query.getResultList();
    session.close();
    return res;
  }
}
