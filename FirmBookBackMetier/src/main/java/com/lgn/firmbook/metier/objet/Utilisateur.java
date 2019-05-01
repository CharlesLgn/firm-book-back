package com.lgn.firmbook.metier.objet;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "utilisateur")
@XmlRootElement
public class Utilisateur implements Serializable {
  @Id
  @Column(name = "login")
  private String login;
  @Id
  @Column(name = "password")
  private String motDePasse;
  @Column(name = "level")
  private String rang;

  public Utilisateur() {
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getMotDePasse() {
    return motDePasse;
  }

  public void setMotDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
  }

  public String getRang() {
    return rang;
  }

  public void setRang(String rang) {
    this.rang = rang;
  }
}
