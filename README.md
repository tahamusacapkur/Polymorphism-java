# Polymorphism-java

### Polimorfizm Nedir? (Örneklerle Açıklama)



Polimorfizm, nesne yönelimli programlamada (OOP) bir metodun farklı sınıflarda farklı davranışlar sergileyebilmesini sağlayan özelliktir. Bu sayede, aynı isimde bir metod farklı sınıflarda farklı işlevler gerçekleştirebilir.



---



## *Örnek 1: Temel Polimorfizm Mantığı*



Bir Sekil sınıfımız olsun ve içinde ciz() adında bir metod tanımlayalım:



```java

class Sekil {

    void ciz() {

        System.out.println("Bir şekil çiziliyor");

    }

}





Şimdi Dikdortgen, Daire ve Ucgen gibi alt sınıfları oluşturalım ve ciz() metodunu kendi içlerinde ezelim (@Override ile):



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



Şimdi main metodunda bu sınıfları kullanalım:



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



### Çalışma Mantığı

- Sekil referansı ile farklı nesneler oluşturduk.

- Her nesne kendi sınıfındaki ciz() metodunu çağırıyor.

- Çalıştırdığımızda *override edilen metotlar* çalışıyor.
