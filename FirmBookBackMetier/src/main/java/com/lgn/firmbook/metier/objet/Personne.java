package com.lgn.firmbook.metier.objet;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "person")
@XmlRootElement
public class Personne implements Serializable {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "last_name")
  private String nom;
  @Column(name = "first_name")
  private String prenom;
  @Column(name = "birth_date")
  private Date dateDeNaissance;
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "sexe_id")
  private Sexe sexe;
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "post_id")
  private Poste poste;
  @Column(name = "room_place")
  private String emplacementBureau;
  @Column(name = "arrive_date")
  private Date dateArrive;
  @Column(name = "email")
  private String email;

  public Personne() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Date getDateDeNaissance() {
    return dateDeNaissance;
  }

  public void setDateDeNaissance(Date dateDeNaissance) {
    this.dateDeNaissance = dateDeNaissance;
  }

  public Sexe getSexe() {
    return sexe;
  }

  public void setSexe(Sexe sexe) {
    this.sexe = sexe;
  }

  public Poste getPoste() {
    return poste;
  }

  public void setPoste(Poste poste) {
    this.poste = poste;
  }

  public String getEmplacementBureau() {
    return emplacementBureau;
  }

  public void setEmplacementBureau(String emplacementBureau) {
    this.emplacementBureau = emplacementBureau;
  }

  public Date getDateArrive() {
    return dateArrive;
  }

  public void setDateArrive(Date dateArrive) {
    this.dateArrive = dateArrive;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
