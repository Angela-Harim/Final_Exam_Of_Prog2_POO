package school;

import java.time.Instant;
import java.util.List;

public class Cours {
    private int id;
    private String Label;
    private int credits;
    private List<Enseignants>enseignants;

    public Cours(int id, String label, int credits, List<Enseignants> enseignants) {
        this.id = id;
        Label = label;
        this.credits = credits;
        this.enseignants = enseignants;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return Label;
    }

    public int getCredits() {
        return credits;
    }

    public List<Enseignants> getEnseignants() {
        return enseignants;
    }

    public double getCoursGrade(Cours cours, Etudiants etudiants, Instant t) {

    }

}
