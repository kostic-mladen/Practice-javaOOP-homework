package HomeworkOOP2;

public class Main {
    public static void main(String[] args) {

        //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti
        // dva radnika, proveriti cija je plata veca, istampati informacije
        // radnika cija je plata veca, uz 20% vecu platu

        Radnik radnik1 = new Radnik("Luka", "bankar", 150000);
        Radnik radnik2 = new Radnik("Vukašin", "blagajnik", 200000);

        double vecaPlata = 0;

        if (radnik1.plata < radnik2.plata) {
            vecaPlata = radnik2.plata;
        } else {
            vecaPlata = radnik1.plata;
        }

        if (vecaPlata == radnik1.plata) {
            System.out.println(radnik1.ime + " ima veću platu i iznosi " +
                    (radnik1.plata * 1.2) + " sa povećanjem od 20%.");
        } else {
            System.out.println(radnik2.ime + " ima veću platu i iznosi " +
                    (radnik2.plata * 1.2) + " sa povećanjem od 20%.");
        }

        System.out.println("---------------------DRUGI NAČIN-----------------------");

        radnik1.stampa(radnik1, radnik2);
    }
}
