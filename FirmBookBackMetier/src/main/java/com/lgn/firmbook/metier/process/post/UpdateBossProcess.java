package com.lgn.firmbook.metier.process.post;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.manager.PosteManager;
import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.objet.Poste;

public class UpdateBossProcess {

    public void update(int postId, int bossId) {
        PersonneManager personneManager = new PersonneManager();
        PosteManager manager = new PosteManager();
        Personne boss = personneManager.read(bossId);
        Poste poste = manager.read(postId);
        poste.setResponssable(boss);
        manager.update(poste);
    }
}
