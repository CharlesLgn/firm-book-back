package fr.metz.iut.licencepro.projet.metier.manager;

import fr.metz.iut.licencepro.projet.metier.objet.Personne;

public class PersonneManager extends HibernateFactory<Personne> {

  public PersonneManager() {
    super(Personne.class);
  }
}
