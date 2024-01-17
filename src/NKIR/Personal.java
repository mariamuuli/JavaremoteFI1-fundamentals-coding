package NKIR;

public class Personal {
    private String nimi;
    private int vanus;
    private String ametiNimetus;

    Personal (String nimi, int vanus, String ametiNimetus){
        this.nimi = nimi;
        this.vanus = vanus;
        this.ametiNimetus = ametiNimetus;
    }
    public void Display(){
        System.out.println("Töötaja nimi: " + nimi + "\nTöötaja vanus: " + vanus + "\nTöötaja ametinimetus: " + ametiNimetus);
    }
}
