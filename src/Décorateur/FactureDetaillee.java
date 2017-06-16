package Décorateur;
import java.util.Date;

/**
 * Created by melvin on 14/06/17.
 */
public class FactureDetaillee extends Facture {
    public FactureDetaillee(String n, Date d) {
        super(n, d);
    }

    @Override
    public void imprimeToi() {
        System.out.println("Facture Detaillee " + getNom() + " à la date de " + getDate());
    }
}
