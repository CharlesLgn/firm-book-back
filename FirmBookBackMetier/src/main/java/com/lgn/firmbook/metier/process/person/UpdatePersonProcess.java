package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.manager.SexeManager;
import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.objet.Sexe;
import com.lgn.firmbook.metier.objet.data.DataPerson;

import java.util.function.BiConsumer;

public class UpdatePersonProcess {

  public Personne update(int id, DataPerson data) {
    PersonneManager manager = new PersonneManager();
    Personne personne = manager.read(id);
    doUpdate(personne, data,
            this::setNom,
            this::setPrenom,
            this::setSexe,
            this::setEmplacement,
            this::setEmail
            );
    manager.update(personne);
    return personne;
  }

  @SafeVarargs
  private final void doUpdate(Personne personne, DataPerson data, BiConsumer<Personne, DataPerson>... updaters) {
    for (BiConsumer<Personne, DataPerson> updater : updaters) {
      updater.accept(personne, data);
    }
  }

  private void setNom(Personne personne, DataPerson data) {
    if (data.getNom() != null && !"".equals(data.getNom())) {
      personne.setNom(data.getNom());
    }
  }

  private void setPrenom(Personne personne, DataPerson data) {
    if (data.getPrenom() != null && !"".equals(data.getPrenom())) {
      personne.setPrenom(data.getPrenom());
    }
  }

  private void setSexe(Personne personne, DataPerson data) {
    SexeManager manager = new SexeManager();
    Sexe sexe = manager.read(data.getSexeId());
    if (sexe != null) {
      personne.setSexe(sexe);
    }
  }

  private void setEmplacement(Personne personne, DataPerson data) {
    personne.setEmplacementBureau(data.getEmplacementBureau());
  }

  private void setEmail(Personne personne, DataPerson data) {
    if (data.getEmail() != null && !"".equals(data.getEmail())) {
      personne.setEmail(data.getEmail());
    }
  }
}
