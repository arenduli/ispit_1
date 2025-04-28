import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {

    private List<Vozilo> vozila = new ArrayList<>();

    public void dodajVozilo(Vozilo vozilo) {
        vozila.add(vozilo);
    }

    public void spremiPodatkeUDatoteku(String file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Vozilo vozilo : vozila) {
                if (vozilo instanceof Automobil) {
                    Automobil automobil = (Automobil) vozilo;
                    writer.write("Automobil," + automobil.getRegistarskiBroj() + ", " + automobil.getMarka() + ", " +
                            automobil.getGodinaProizvodnje() + ", " + automobil.getBrojVrata());
                } else if (vozilo instanceof Motocikl) {
                    Motocikl motocikl = (Motocikl) vozilo;
                    writer.write("Motocikl," + motocikl.getRegistarskiBroj() + ", " + motocikl.getMarka() + ", " +
                            motocikl.getGodinaProizvodnje() + ", " + motocikl.getTipMotora());
                }
                writer.newLine();
            }
        }
    }

    public void ucitajPodatkeIzDatoteke(String file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals("Automobil")) {
                    Automobil automobil = new Automobil(parts[1], parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]));
                    vozila.add(automobil);
                } else if (parts[0].equals("Motocikl")) {
                    Motocikl motocikl = new Motocikl(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]);
                    vozila.add(motocikl);
                }
            }
        } catch (NeispravniPodaciException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayAllVehicles() {
        for (Vozilo vozilo : vozila) {
            vozilo.prikaziPodatke();
            System.out.println();
        }
    }
}
