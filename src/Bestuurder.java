public class Bestuurder {

    private String name;
    private int leeftijd;


    public Bestuurder(String name, int leeftijd) {
        this.name = name;
        this.leeftijd = leeftijd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
