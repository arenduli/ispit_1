import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        EvidencijaVozila evidencija = new EvidencijaVozila();

        try {
            Automobil automobil1 = new Automobil("ZG1254jk", "Toyota", 2020, 4);
            Automobil automobil2 = new Automobil("ST2344jk", "Renault", 2014, 3);
            Motocikl motocikl1 = new Motocikl("SI7654es", "Yamaha", 2018, "Sport");
            Motocikl motocikl2 = new Motocikl("KR4587es", "Honda", 2023, "Elegance");

            evidencija.dodajVozilo(automobil1);
            evidencija.dodajVozilo(automobil2);
            evidencija.dodajVozilo(motocikl1);
            evidencija.dodajVozilo(motocikl2);

            evidencija.spremiPodatkeUDatoteku("src/vozila.txt");
            evidencija.ucitajPodatkeIzDatoteke("src/vozila.txt");
            evidencija.displayAllVehicles();
        }
        catch (NeispravniPodaciException | IOException e) {
            System.err.println("Greška: " + e.getMessage());
        }
    }
}
