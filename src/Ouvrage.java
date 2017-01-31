
import java.util.GregorianCalendar;

public class Ouvrage {

    private String numISBN;
    private String titreOuvrage;
    private String nomEditeur;
    private GregorianCalendar dateParution;
    private String nomAuteur;
    private Public publicCible;
    private TreeSet<Exemplaire> exemplaireTreeSet;

    Ouvrage(String numISBN, String titreOuvrage, String nomEditeur, String nomAuteur, GregorianCalendar dateParution, Public publicCible) {
        this.setNumISBN(numISBN);
        this.setTitreOuvrage(titreOuvrage);
        this.setNomEditeur(nomEditeur);
        this.setNomAuteur(nomAuteur);
        this.setDateParution(dateParution);
        this.setPublicCible(publicCible);
        exemplaireTreeSet = new TreeSet<>();
    }

    public ArrayList<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    public void setNumISBN(String numISBN) {
        this.numISBN = numISBN;
    }

    public void setTitreOuvrage(String titreOuvrage) {
        this.titreOuvrage = titreOuvrage;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public void setDateParution(GregorianCalendar dateParution) {
        this.dateParution = dateParution;
    }

    public void setPublicCible(Public publicCible) {
        this.publicCible = publicCible;
    }

    public void setExemplaireTreeSet(TreeSet<Exemplaire> exemplaireTreeSet) {
        this.exemplaireTreeSet = exemplaireTreeSet;
    }
}