package school;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class Examens {
    private int id;
    private String titre;
    private List<Cours>coursRattaches;
    private Timestamp dateExamen;
    private int coefficient;

    public Examens(int id, String titre, List<Cours> coursRattaches, Timestamp dateExamen, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.coursRattaches = coursRattaches;
        this.dateExamen = dateExamen;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public List<Cours> getCoursRattaches() {
        return coursRattaches;
    }

    public Timestamp getDateExamen() {
        return dateExamen;
    }

    public int getCoefficient() {
        return coefficient;
    }


}
