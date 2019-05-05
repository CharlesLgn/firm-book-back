package com.lgn.firmbook.metier.process.person;

import com.lgn.firmbook.metier.objet.Personne;

import java.util.Arrays;
import java.util.List;

/**
 * process permettant de ne pas faire planter le JSON renvoyer en blocant les cycle
 * personne-Poste-Personne
 */
public class PersonCleanProcess {

    public void clean(Personne... people) {
        clean(Arrays.asList(people));
    }

    public void clean(List<Personne> people) {
        for (Personne person : people) {
            doClean(person);
        }
    }

    private void doClean(Personne person) {
        if (person.getPoste() != null) {
            person.getPoste().setPersonne(null);
            person.getPoste().setResponssable(null);
        }
    }
}
