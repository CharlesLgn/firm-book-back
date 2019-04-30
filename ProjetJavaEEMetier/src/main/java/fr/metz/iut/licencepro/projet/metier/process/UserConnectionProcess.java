package fr.metz.iut.licencepro.projet.metier.process;

import fr.metz.iut.licencepro.projet.metier.manager.UtilisateurManager;
import fr.metz.iut.licencepro.projet.metier.objet.Utilisateur;

public class UserConnectionProcess {

  public Utilisateur connect(String user, String psw) {
    return new UtilisateurManager().exist(user, psw);
  }
}
