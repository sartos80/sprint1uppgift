// Abstrakt basklass Växt - Inkapsling för gemensamma egenskaper
abstract class Växt implements VätskeBehov {
    private String namn;  // Inkapsling av växtens namn
    private double längd; // Inkapsling av växtens längd i meter

    public Växt(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    public String getNamn() {
        return namn;
    }

    public double getLängd() {
        return längd;
    }

}
