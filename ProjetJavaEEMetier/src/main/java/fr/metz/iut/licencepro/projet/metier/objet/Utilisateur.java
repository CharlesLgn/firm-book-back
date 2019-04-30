package fr.metz.iut.licencepro.projet.metier.objet;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
  @Column(name = "login")
  private String login;
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
