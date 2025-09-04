package school;

import java.time.Instant;
import java.util.Date;

public class Notes {
    private double valeurInitiale;
    private double valeurFinale;
    private Date dateInitiale;
    private Date dateFinale;

    public Notes(double valeurInitiale, double valeurFinale, Date dateInitiale, Date dateFinale) {
        this.valeurInitiale = valeurInitiale;
        this.valeurFinale = valeurFinale;
        this.dateInitiale = dateInitiale;
        this.dateFinale = dateFinale;
    }

    public double getValeurInitiale() {
        return valeurInitiale;
    }

    public double getValeurFinale() {
        return valeurFinale;
    }

    public Date getDateInitiale() {
        return dateInitiale;
    }

    public Date getDateFinale() {
        return dateFinale;
    }



}
