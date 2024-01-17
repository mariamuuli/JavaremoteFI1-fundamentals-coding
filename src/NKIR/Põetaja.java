package NKIR;

public class Põetaja extends Personal{

    private int palk;
    private int tööTunnid;

    Põetaja(String nimi, int vanus, String ametiNimetus) {
        super(nimi, vanus, ametiNimetus);
        this.palk = 1200;
        this.tööTunnid = 168;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Palk: " + palk + "\nTöötunnid: " + tööTunnid);
    }
}
