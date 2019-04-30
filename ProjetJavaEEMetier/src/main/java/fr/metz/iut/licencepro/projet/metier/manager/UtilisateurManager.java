package fr.metz.iut.licencepro.projet.metier.manager;

import org.hibernate.Session;
import org.hibernate.query.Query;

import fr.metz.iut.licencepro.projet.metier.objet.Utilisateur;

public class UtilisateurManager extends HibernateFactory<Utilisateur> {

  public UtilisateurManager() {
    super(Utilisateur.class);
  }

  public Utilisateur exist(String user, String psw) {
    Session session = getSession();
    Query query = session.createQuery("from Utilisateur as utilisateur where utilisateur.login = :user and utilisateur.motDePasse = :psw");
    query.setParameter("user", user);
    query.setParameter("psw", psw);
    return (Utilisateur)query.getSingleResult();
  }
}
