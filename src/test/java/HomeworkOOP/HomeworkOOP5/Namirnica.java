package HomeworkOOP5;

public class Namirnica {

   // Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.

    String naziv;
    int cena;

    public Namirnica(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }
}
