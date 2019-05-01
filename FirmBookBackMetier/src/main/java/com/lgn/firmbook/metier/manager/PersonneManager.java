package com.lgn.firmbook.metier.manager;

import com.lgn.firmbook.metier.objet.Personne;

public class PersonneManager extends HibernateFactory<Personne> {

  public PersonneManager() {
    super(Personne.class);
  }
}
