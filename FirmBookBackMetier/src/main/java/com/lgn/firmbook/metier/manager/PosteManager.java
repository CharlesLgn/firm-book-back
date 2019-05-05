package com.lgn.firmbook.metier.manager;

import com.lgn.firmbook.metier.objet.Poste;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PosteManager extends HibernateFactory<Poste> {

  public PosteManager() {
    super(Poste.class);
  }

  @Override
  public List<Poste> getAll() {
    Session session = getSession();
    Query query = session.createQuery("SELECT poste from Poste as poste");
    List<Poste> res = (List<Poste>)query.getResultList();
    session.close();
    return res;
  }

  public List<Poste> getAllNonAssign() {
    Session session = getSession();
    Query query = session.createQuery("SELECT poste from Poste as poste where poste.personne is null");
    List<Poste> res = (List<Poste>)query.getResultList();
    session.close();
    return res;
  }
}
