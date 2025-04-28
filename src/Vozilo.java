import java.io.Serializable;

public class Vozilo implements Serializable {

    private String registarskiBroj;
    private String marka;
    private int godinaProizvodnje;

    public Vozilo(String registarskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje vozila ne može biti negativna.");
        }
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void ucitajPodatke(String registarskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje vozila ne može biti negativna.");
        }
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void prikaziPodatke() {
        System.out.println("Broj registracije je: " + registarskiBroj);
        System.out.println("Marka vozila je: " + marka);
        System.out.println("Godina proizvodnje vozila je: " + godinaProizvodnje);
    }
}
