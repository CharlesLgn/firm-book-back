package com.lgn.firmbook.metier.process;

import com.lgn.firmbook.metier.manager.UtilisateurManager;
import com.lgn.firmbook.metier.objet.Utilisateur;

public class UserConnectionProcess {

  public Utilisateur connect(String user, String psw) {
    return new UtilisateurManager().exist(user, psw);
  }
}
