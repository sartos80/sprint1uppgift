
// Subklass Kaktus
class Kaktus extends Växt {
    public Kaktus(String namn, double längd) {
        super(namn, längd);
    }

    @Override
    public double beräknaVätska() {
        return 0.02;  // Kaktusen behöver 2 cl (0.02 liter) mineralvatten per dag
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VätskeTyp.MINERALVATTEN;  // Kaktusen behöver mineralvatten
    }
}