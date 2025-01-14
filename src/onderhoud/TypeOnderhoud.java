package onderhoud;

public class TypeOnderhoud {

     private int kosten;
     private String naam;
     private String Monteur;

    public TypeOnderhoud(int kosten, String naam, String monteur) {
        this.kosten = kosten;
        this.naam = naam;
        Monteur = monteur;
    }

    public int getKosten() {
        return kosten;
    }

    public void setKosten(int kosten) {
        this.kosten = kosten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getMonteur() {
        return Monteur;
    }

    public void setMonteur(String monteur) {
        Monteur = monteur;
    }
}
