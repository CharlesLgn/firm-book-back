package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.objet.Personne;

public class DeletePersonProcess {

  public boolean delete(int id) {
    PersonneManager manager = new PersonneManager();
    Personne personne = manager.read(id);
    manager.delete(personne);
    return true;
  }
}
