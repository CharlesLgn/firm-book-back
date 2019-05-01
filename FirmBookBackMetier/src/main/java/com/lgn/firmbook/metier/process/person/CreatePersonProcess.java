package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.objet.Personne;

import java.time.Instant;
import java.util.Date;

public class CreatePersonProcess {
  
  public Personne create(Personne personne) {
    PersonneManager manager = new PersonneManager();
    personne.setDateArrive(Date.from(Instant.now()));
    Personne res = manager.create(personne);
    return personne;
  }
}
