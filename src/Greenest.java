import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Huvudklass för att hantera inmatning och utskrift
public class Greenest {
    public static void main(String[] args) {
        // Skapa en ArrayList och lägg till växter
        List<Växt> växter = new ArrayList<>();
        växter.add(new Kaktus("Igge", 0.2));
        växter.add(new Palm("Laura", 5.0));
        växter.add(new KöttätandeVäxt("Meatloaf", 0.7));
        växter.add(new Palm("Olof", 1.0));

        // Användarinteraktion: Fråga efter växtens namn via en dialogruta
        String växtNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
        boolean växtHittad = false;

        // Sök efter växten och visa rätt vätskemängd och typ
        for (Växt växt : växter) {
            if (växt.getNamn().equalsIgnoreCase(växtNamn)) {
                String meddelande = växt.getNamn() + " behöver " + växt.beräknaVätska() +
                        " liter " + växt.getVätskeTyp().toString().toLowerCase() + ".";
                JOptionPane.showMessageDialog(null, meddelande);
                växtHittad = true;
                break;
            }
        }

        // Om växten inte hittades, visa ett felmeddelande
        if (!växtHittad) {
            JOptionPane.showMessageDialog(null, "Växten med namnet " + växtNamn + " finns inte på hotellet.");
        }
    }
    }