package HomeworkOOP5;

public class main {

    public static void main(String[] args) {
       // Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
       // Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
        //  Osim konstuktora definisati:
       // - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
       // - metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
       // - metoda stampaj() - istampace sve namirnice iz liste.
       // U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.


       Namirnica n1 = new Namirnica("kupus", 40);
       Namirnica n2 = new Namirnica("čokolada", 200);
       Namirnica n3 = new Namirnica("bakvala", 350);
       Namirnica n4 = new Namirnica("rižoto", 213);
       Namirnica n5 = new Namirnica("jafa torta", 1300);

        Korpa k1 = new Korpa();
        k1.dodavanjeNamirnica(n1);
        k1.dodavanjeNamirnica(n2);
        k1.dodavanjeNamirnica(n5);
        k1.stampa();
        k1.stampaProvere(n4);

    }
}
