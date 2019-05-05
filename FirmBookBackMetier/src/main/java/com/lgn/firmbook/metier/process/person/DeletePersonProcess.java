package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.manager.PosteManager;
import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.objet.Poste;

/**
 * process pour suprimé une personne de la BDD
 */
public class DeletePersonProcess {

  public boolean delete(int id) {
    PersonneManager manager = new PersonneManager();
    PosteManager posteManager = new PosteManager();
    Personne personne = manager.read(id);
    if (personne != null) {
      Poste poste = personne.getPoste();
      manager.delete(personne);
      poste.setPersonne(null);
      posteManager.update(poste);
    }
    return true;
  }
}
