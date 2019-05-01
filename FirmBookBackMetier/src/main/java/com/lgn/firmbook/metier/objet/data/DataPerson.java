package com.lgn.firmbook.metier.objet.data;

public class DataPerson {
    private String nom;
    private String prenom;
    private int sexeId;
    private String emplacementBureau;
    private String email;

    public DataPerson(String non, String prenom, int sexeId, String emplacementBureau, String email) {
        this.nom = non;
        this.prenom = prenom;
        this.sexeId = sexeId;
        this.emplacementBureau = emplacementBureau;
        this.email = email;
    }

    public DataPerson() {
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

    public int getSexeId() {
        return sexeId;
    }

    public void setSexeId(int sexeId) {
        this.sexeId = sexeId;
    }

    public String getEmplacementBureau() {
        return emplacementBureau;
    }

    public void setEmplacementBureau(String emplacementBureau) {
        this.emplacementBureau = emplacementBureau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
