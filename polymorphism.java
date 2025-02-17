class Sekil {
    void ciz() {
        System.out.println("Bir şekil çiziliyor");
    }
}

class Dikdortgen extends Sekil {
    @Override
    void ciz() {
        System.out.println("Bir dikdörtgen çiziliyor");
    }
}

class Daire extends Sekil {
    @Override
    void ciz() {
        System.out.println("Bir daire çiziliyor");
    }
}

class Ucgen extends Sekil {
    @Override
    void ciz() {
        System.out.println("Bir üçgen çiziliyor");
    }
}

public class PolimorfizmOrnegi {
    public static void main(String[] args) {
        Sekil benimSekil = new Sekil();
        Sekil benimDikdortgen = new Dikdortgen();
        Sekil benimDaire = new Daire();
        Sekil benimUcgen = new Ucgen();

        benimSekil.ciz();
        benimDikdortgen.ciz();
        benimDaire.ciz();
        benimUcgen.ciz();
    }
}
