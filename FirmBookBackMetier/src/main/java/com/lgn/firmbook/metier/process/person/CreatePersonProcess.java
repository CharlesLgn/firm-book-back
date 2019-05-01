package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.objet.Personne;

public class CreatePersonProcess {
  
  public Personne create(Personne personne) {
    PersonneManager manager = new PersonneManager();
    Personne res = manager.create(personne);
    return personne;
  }
}
