package fr.metz.iut.licencepro.projet.metier.manager;

import fr.metz.iut.licencepro.projet.metier.objet.*;

public class PosteManager extends HibernateFactory<Poste> {

  PosteManager() {
    super(Poste.class);
  }
}
