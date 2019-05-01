package com.lgn.firmbook.metier.manager;

import com.lgn.firmbook.metier.objet.Sexe;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SexeManager extends HibernateFactory<Sexe> {

  public SexeManager() {
    super(Sexe.class);
  }

  @Override
  public List<Sexe> getAll() {
    Session session = getSession();
    Query query = session.createQuery("SELECT sexe from Sexe as sexe");
    return (List<Sexe>)query.getResultList();
  }
}
