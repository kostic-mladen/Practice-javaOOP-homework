package HomeworkOOP1;

public class Knjiga {

    String nazivKnjige;
    String zanr;

    public Knjiga(String nazivKnjige, String zanr) {
        this.nazivKnjige = nazivKnjige;
        this.zanr = zanr;
    }
    public static void stampa (Knjiga knjiga1, Knjiga knjiga2) {
        if (knjiga1.nazivKnjige.equals(knjiga2.nazivKnjige) && knjiga1.zanr.equals(knjiga2.nazivKnjige)) {
            System.out.println("Ista knjiga!");
        } else if (knjiga1.zanr.equals(knjiga2.zanr)) {
            System.out.println("Žanr obe knjige je isti - " + knjiga1.zanr);
        } else {
            System.out.println("U pitanju su dve različite knjige. ");
        }
    }
}
