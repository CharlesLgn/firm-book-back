package com.lgn.firmbook.metier.process.post;

import com.lgn.firmbook.metier.manager.PersonneManager;
import com.lgn.firmbook.metier.manager.PosteManager;
import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.objet.Poste;

public class UpdatePostPersonProcess {

    public void update(int postId, int person) {
        PersonneManager personneManager = new PersonneManager();
        PosteManager manager = new PosteManager();
        Poste poste = manager.read(postId);
        Personne newPers = personneManager.read(person),
                 oldPers = poste.getPersonne();
        if (oldPers != null) {
            oldPers.setPoste(null);
            personneManager.update(oldPers);
        }
        newPers.setPoste(poste);
        poste.setPersonne(newPers);
        personneManager.update(newPers);
        manager.update(poste);
    }
}
