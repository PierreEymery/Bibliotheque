
import java.util.GregorianCalendar;


public class Exemplaire{
    
    //attributs
    
    private int numExemplaire;
    private GregorianCalendar dateReception;
    private boolean empruntable;
    
    //constructeur
    
    public Exemplaire(String numISBN, int numExemplaire, GregorianCalendar dateReception, Boolean empruntable){
        if(!(((getOuvrage(numISBN)).listeExemplaires).contains(numExemplaire))){
            this.setDateReception(dateReception);
            this.setEmpruntable(empruntable);
            this.setNumExemplaire(numExemplaire);
        }
        else {
            System.out.println("L'exemplaire existe déjà pour cet ouvrage");
        }
    }
    
    //methodes

    /**
     * @return the numExemplaire
     */
    public int getNumExemplaire() {
        return numExemplaire;
    }

    /**
     * @param numExemplaire the numExemplaire to set
     */
    public void setNumExemplaire(int numExemplaire) {
        this.numExemplaire = numExemplaire;
    }

    /**
     * @return the dateReception
     */
    public GregorianCalendar getDateReception() {
        return dateReception;
    }

    /**
     * @param dateReception the dateReception to set
     */
    public void setDateReception(GregorianCalendar dateReception) {
        this.dateReception = dateReception;
    }

    /**
     * @return the empruntable
     */
    public boolean isEmpruntable() {
        return empruntable;
    }

    /**
     * @param empruntable the empruntable to set
     */
    public void setEmpruntable(boolean empruntable) {
        this.empruntable = empruntable;
    }
    
}
