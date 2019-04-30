package fr.metz.iut.licencepro.projet.metier.process.person;

import fr.metz.iut.licencepro.projet.metier.manager.PersonneManager;
import fr.metz.iut.licencepro.projet.metier.objet.Personne;

public class CreatePersonProcess {
  
  public Personne create(Personne personne) {
    PersonneManager manager = new PersonneManager();
    Personne res = manager.create(personne);
    return personne;
  }
}
