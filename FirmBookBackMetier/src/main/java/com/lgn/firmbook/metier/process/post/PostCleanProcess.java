package com.lgn.firmbook.metier.process.post;

import com.lgn.firmbook.metier.objet.Poste;

import java.util.Arrays;
import java.util.List;

public class PostCleanProcess {


    public void clean(Poste... posts) {
        clean(Arrays.asList(posts));
    }

    public void clean(List<Poste> posts) {
        for (Poste post: posts) {
            doClean(post);
        }
    }

    private void doClean(Poste post) {
        if (post.getResponssable() != null) {
            post.getResponssable().setPoste(null);
        }
        if (post.getPersonne() != null) {
            post.getPersonne().setPoste(null);
        }
    }
}
