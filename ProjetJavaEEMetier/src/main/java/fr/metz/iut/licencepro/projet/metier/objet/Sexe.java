package fr.metz.iut.licencepro.projet.metier.objet;

import javax.persistence.*;

@Entity
@Table(name = "sexe")
public class Sexe {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "lib")
  private String libele;

  public Sexe() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLibele() {
    return libele;
  }

  public void setLibele(String libele) {
    this.libele = libele;
  }
}
