package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.objet.Personne;

import java.util.List;

/**
 * process pour récupérer toute les personne de la BDD
 */
public class GetPeopleProcess {

  public List<Personne> get() {
    PersonneManager manager = new PersonneManager();
    List<Personne> people = manager.getAll();
    new PersonCleanProcess().clean(people);
    return people;
  }
}
