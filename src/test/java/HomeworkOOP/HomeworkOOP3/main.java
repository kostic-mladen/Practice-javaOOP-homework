package HomeworkOOP3;

public class main {

    public static void main(String[] args) {

        //Zadatak 1.
        //Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
        // SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje
        // je do sada digao. Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene i fizikalcu ako
        // imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.

        Radnik fizikalac = new Radnik(22, "Pera", 4, 1000);
        Radnik sefSmene = new Radnik(15, "Mika", 15, 3000);
        Radnik investitor = new Radnik(1, "Žika", 12, 5000);


        Fizikalac fiz1 = new Fizikalac(fizikalac.id, fizikalac.nazivRadnika, fizikalac.godineIskustva, fizikalac.plata);
        fiz1.stampaFizikalac();

        SefSmene sef1 = new SefSmene(sefSmene.id, sefSmene.nazivRadnika, sefSmene.godineIskustva, sefSmene.plata);
        sef1.stampaSefSmene();

        Investitor inv1 = new Investitor(investitor.id, investitor.nazivRadnika, investitor.godineIskustva, investitor.plata,7);
        inv1.stampaInvestitor();
    }
}
