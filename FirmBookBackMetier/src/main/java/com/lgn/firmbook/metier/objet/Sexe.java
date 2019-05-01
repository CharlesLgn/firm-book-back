package com.lgn.firmbook.metier.objet;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "sexe")
@XmlRootElement
public class Sexe implements Serializable {
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
