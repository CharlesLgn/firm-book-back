package com.lgn.firmbook.metier.process.post;

import com.lgn.firmbook.metier.manager.PosteManager;
import com.lgn.firmbook.metier.objet.Poste;

import java.util.function.BiConsumer;

public class UpdatePostProcess {

  public Poste update(int id, Poste data) {
    PosteManager manager = new PosteManager();
    Poste poste = manager.read(id);
    doUpdate(poste, data,
            this::setLib,
            this::setLvl
            );
    manager.update(data);
    return data;
  }

  @SafeVarargs
  private final void doUpdate(Poste poste, Poste data, BiConsumer<Poste, Poste>... updaters) {
    for (BiConsumer<Poste, Poste> updater : updaters) {
      updater.accept(poste, data);
    }
  }

  private void setLib(Poste poste, Poste data) {
    if (data.getLibelle() != null && !"".equals(data.getLibelle())) {
      poste.setLibelle(data.getLibelle());
    }
  }

  private void setLvl(Poste poste, Poste data) {
    if (data.getNiveau() >= 0) {
      poste.setNiveau(data.getNiveau());
    }
  }
}
