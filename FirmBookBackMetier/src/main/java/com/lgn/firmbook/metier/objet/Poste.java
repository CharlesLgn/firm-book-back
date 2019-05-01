package com.lgn.firmbook.metier.objet;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "poste")
@XmlRootElement
public class Poste implements Serializable {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "lib")
  private String libelle;
  @Column(name = "level")
  private int niveau;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "person_id")
  private Personne personne;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "boss_id")
  private Personne responssable;

  public Poste() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public int getNiveau() {
    return niveau;
  }

  public void setNiveau(int niveau) {
    this.niveau = niveau;
  }

  public Personne getPersonne() {
    return personne;
  }

  public void setPersonne(Personne personne) {
    this.personne = personne;
  }

  public Personne getResponssable() {
    return responssable;
  }

  public void setResponssable(Personne responssable) {
    this.responssable = responssable;
  }
}
