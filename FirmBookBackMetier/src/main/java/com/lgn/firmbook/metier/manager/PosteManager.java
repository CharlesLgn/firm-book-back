package com.lgn.firmbook.metier.manager;

import com.lgn.firmbook.metier.objet.Poste;

public class PosteManager extends HibernateFactory<Poste> {

  PosteManager() {
    super(Poste.class);
  }
}
