// Subklass Köttätande växt
class KöttätandeVäxt extends Växt {
    public KöttätandeVäxt(String namn, double längd) {
        super(namn, längd);
    }

    @Override
    public double beräknaVätska() {
        return 0.1 + (0.2 * getLängd());  // Beräkna mängden proteindryck per dag
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VätskeTyp.PROTEINDRYCK;  // Köttätande växt behöver proteindryck
    }

}