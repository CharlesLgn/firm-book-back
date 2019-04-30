package fr.metz.iut.licencepro.projet.metier.process.person;

import fr.metz.iut.licencepro.projet.metier.manager.PersonneManager;
import fr.metz.iut.licencepro.projet.metier.objet.Personne;

public class UpdatePersonProcess {

  public boolean update(Personne personne) {
    PersonneManager manager = new PersonneManager();
    manager.update(personne);
    return true;
  }
}
