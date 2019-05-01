package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.objet.Personne;

public class UpdatePersonProcess {

  public boolean update(Personne personne) {
    PersonneManager manager = new PersonneManager();
    manager.update(personne);
    return true;
  }
}
