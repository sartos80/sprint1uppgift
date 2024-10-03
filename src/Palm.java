
// Subklass Palm
class Palm extends Växt {
    public Palm(String namn, double längd) {
        super(namn, längd);
    }

    @Override
    public double beräknaVätska() {
        return 0.5 * getLängd();  // Beräkna mängden kranvatten per dag
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VätskeTyp.KRANVATTEN;  // Palmen behöver kranvatten
    }
}