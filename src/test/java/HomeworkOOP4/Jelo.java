package HomeworkOOP4;


import java.util.ArrayList;

public class Jelo {
    String naziv;
    ArrayList<String> listaSastojaka;
    boolean bezLaktoze;

    public Jelo(String naziv) {
        this.naziv = naziv;
        this.listaSastojaka = new ArrayList<>();
        bezLaktoze = true;

    }

    public Jelo(String naziv, ArrayList<String> listaSastojaka) {
        this.naziv = naziv;
        bezLaktoze = true;
        for (int i = 0; i < listaSastojaka.size(); i++) {
            if (listaSastojaka.equals("Mleko")) {
                bezLaktoze = false;
                break;
            }
        }
        this.listaSastojaka = listaSastojaka;
    }

    public void dodajSastojak(String noviSastojak) {
        if (noviSastojak.equals("Mleko")) {
            bezLaktoze = false;

        }

        listaSastojaka.add(noviSastojak);
    }

    public void stampaLaktoza() {
        if (bezLaktoze) {
            System.out.println("U jelu nema mleka, tako da je lactose-free.");
        } else {
            System.out.println("U jelu ima mleka, tako da nije lactose-free.");
        }
    }

    public void stampaLista() {
        System.out.println("Lista sastojaka je: " + listaSastojaka);
    }
}