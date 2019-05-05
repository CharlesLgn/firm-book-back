package com.lgn.firmbook.metier.process.post;

import com.lgn.firmbook.metier.manager.PosteManager;
import com.lgn.firmbook.metier.objet.Poste;

import java.util.List;

public class GetAllPostProcess {

    public List<Poste> get() {
        PosteManager manager = new PosteManager();
        List<Poste> posts = manager.getAll();
        new PostCleanProcess().clean(posts);
        return posts;
    }
}
