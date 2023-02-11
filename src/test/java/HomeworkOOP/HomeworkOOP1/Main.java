package HomeworkOOP1;

public class Main {

    public static void main(String[] args) {

        //Zadatak 1.
        //Napraviti klasu Knjiga koja ce imati naziv i zanr. U glavnoj klasi napraviti dve knjige,
        // zatim proveriti da li imaju isti zanr i naziv, ako imaju, ispisati poruku da je
        // u pitanju ista knjiga, ako je samo zanr isti, ispisati poruku koji je to zanr, ako
        // nista od toga nije isto, ispisati poruku da su u pitanju dve razlicite knjige.

        Knjiga knjiga1 = new Knjiga("Bez daha", "Triler");
        Knjiga knjiga2 = new Knjiga("Aurora u tami", "Triler");

        if (knjiga1.nazivKnjige.equals(knjiga2.nazivKnjige) && knjiga1.zanr.equals(knjiga2.nazivKnjige)) {
            System.out.println("Ista knjiga!");
        } else if (knjiga1.zanr.equals(knjiga2.zanr)) {
            System.out.println("Žanr obe knjige je isti - " + knjiga1.zanr);
        } else {
            System.out.println("U pitanju su dve različite knjige. ");
        }
        System.out.println("------------------DRUGI NAČIN-----------------------");

        Knjiga.stampa(knjiga1, knjiga2);

    }
}
