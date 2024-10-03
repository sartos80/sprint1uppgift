// Enum för vätsketyp
enum VätskeTyp {
    KRANVATTEN, PROTEINDRYCK, MINERALVATTEN
}
// Interface för vätskeberäkning
interface VätskeBehov {
    double beräknaVätska(); // returnerar mängden vätska som växten behöver per dag

    VätskeTyp getVätskeTyp();
// returnerar vilken typ av vätska växten behöver
}


