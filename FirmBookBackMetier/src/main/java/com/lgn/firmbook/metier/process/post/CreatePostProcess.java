package com.lgn.firmbook.metier.process.post;

import com.lgn.firmbook.metier.manager.PosteManager;
import com.lgn.firmbook.metier.objet.Poste;

public class CreatePostProcess {
    public Poste create(Poste poste) {
        PosteManager manager = new PosteManager();
        return manager.create(poste);
    }
}
