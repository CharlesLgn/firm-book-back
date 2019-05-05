package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.process.mail.SendMailProcess;

import java.time.Instant;
import java.util.Date;

/**
 * Process pour créer une personne </br>
 * cré la personne, la met en BDD et envoie un mail à la personne
 */
public class CreatePersonProcess {
  
  public Personne create(Personne personne) {
    PersonneManager manager = new PersonneManager();
    personne.setDateArrive(Date.from(Instant.now()));
    Personne res = manager.create(personne);
    if (personne.getEmail() != null) {
      new SendMailProcess().send(personne.getEmail());
    }
    return res;
  }
}
