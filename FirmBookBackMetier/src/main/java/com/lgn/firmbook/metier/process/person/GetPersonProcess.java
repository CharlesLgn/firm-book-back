package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.objet.Personne;

/**
 * récupérer une personne dans la BDD
 */
public class GetPersonProcess {

  public Personne get(int id) {
    PersonneManager manager = new PersonneManager();
    Personne person = manager.read(id);
    new PersonCleanProcess().clean(person);
    return person;
  }
}
