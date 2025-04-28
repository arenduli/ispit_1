public class Automobil extends Vozilo {

    private int brojVrata;

    public Automobil(String registarskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnje);
        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Broj vrata na vozilu ne može biti negativan.");
        }
        this.brojVrata = brojVrata;
    }

    public void ucitajPodatke(String registarskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super.ucitajPodatke(registarskiBroj, marka, godinaProizvodnje);
        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Broj vrata na vozilu ne može biti negativan.");
        }
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata na vozilu: " + brojVrata);
    }
}
