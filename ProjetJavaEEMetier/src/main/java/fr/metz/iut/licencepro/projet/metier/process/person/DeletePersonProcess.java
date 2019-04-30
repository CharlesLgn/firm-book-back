package fr.metz.iut.licencepro.projet.metier.process.person;

import fr.metz.iut.licencepro.projet.metier.manager.PersonneManager;
import fr.metz.iut.licencepro.projet.metier.objet.Personne;

public class DeletePersonProcess {

  public boolean delete(int id) {
    PersonneManager manager = new PersonneManager();
    Personne personne = manager.read(id);
    manager.delete(personne);
    return true;
  }
}
