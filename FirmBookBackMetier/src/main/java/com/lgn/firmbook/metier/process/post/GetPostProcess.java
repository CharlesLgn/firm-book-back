package com.lgn.firmbook.metier.process.post;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.manager.PosteManager;
import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.objet.Poste;
import com.lgn.firmbook.metier.process.person.PersonCleanProcess;

public class GetPostProcess {

  public Poste get(int id) {
    PosteManager manager = new PosteManager();
    Poste post = manager.read(id);
    new PostCleanProcess().clean(post);
    return post;
  }
}
