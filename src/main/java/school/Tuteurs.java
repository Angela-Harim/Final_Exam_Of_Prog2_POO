package school;

import java.util.Date;

public class Tuteurs {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String telephone;
    private String description;

    public Tuteurs(int id, String nom, String prenom, Date dateNaissance, String email, String telephone, String description) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDescription() {
        return description;
    }
}
