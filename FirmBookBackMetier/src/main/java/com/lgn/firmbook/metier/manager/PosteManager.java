package com.lgn.firmbook.metier.manager;

import com.lgn.firmbook.metier.objet.Poste;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PosteManager extends HibernateFactory<Poste> {

  PosteManager() {
    super(Poste.class);
  }

  @Override
  public List<Poste> getAll() {
    Session session = getSession();
    Query query = session.createQuery("SELECT poste from Poste as poste");
    return (List<Poste>)query.getResultList();
  }
}
