package com.lgn.firmbook.metier.manager;

import com.lgn.firmbook.metier.objet.Personne;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PersonneManager extends HibernateFactory<Personne> {

  public PersonneManager() {
    super(Personne.class);
  }

  @Override
  public List<Personne> getAll() {
    Session session = getSession();
    Query query = session.createQuery("SELECT person from Personne as person");
    List<Personne> res = (List<Personne>)query.getResultList();
    session.close();
    return res;
  }
}
