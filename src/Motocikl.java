public class Motocikl extends Vozilo {

    private String tipMotora;

    public Motocikl(String registarskiBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnje);
        this.tipMotora = tipMotora;
    }

    public void ucitajPodatke(String registarskiBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super.ucitajPodatke(registarskiBroj, marka, godinaProizvodnje);
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Tip motora je: " + tipMotora);
    }
}
