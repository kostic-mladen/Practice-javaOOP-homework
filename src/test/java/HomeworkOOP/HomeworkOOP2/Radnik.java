package HomeworkOOP2;

public class Radnik {

    String ime;
    String pozicija;
    double plata;

    public Radnik(String ime, String pozicija, double plata) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.plata = plata;
    }

    public double vecaPlata(Radnik radnik1, Radnik radnik2) {
        double vecaPlata;
        if (radnik1.plata < radnik2.plata) {
            vecaPlata = radnik2.plata;
        } else {
            vecaPlata = radnik1.plata;
        } return vecaPlata;
    }
    public void stampa(Radnik radnik1, Radnik radnik2) {
        if (vecaPlata(radnik1, radnik2) == radnik1.plata) {
            System.out.println(radnik1.ime + " ima veću platu i iznosi " +
                    (radnik1.plata * 1.2) + " sa povećanjem od 20%.");
        } else {
            System.out.println(radnik2.ime + " ima veću platu i iznosi " +
                    (radnik2.plata * 1.2) + " sa povećanjem od 20%.");
        }
}
    }
