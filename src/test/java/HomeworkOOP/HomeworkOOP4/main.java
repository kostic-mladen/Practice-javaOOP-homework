package HomeworkOOP4;


public class main {
    public static void main(String[] args) {
        //Napraviti klasu Jelo, koje će imati atribute za naziv, listu sastojaka, i boolean vrednost bezLaktoze. Klase Corba,
        //Torta i Sarma nasleđuju klasu Jelo.
        //Ukoliko je jedan od sastojaka mleko, podesicemo boolean vrednost za laktozu false, u suprotnom na true.
        //U main klasi kreirati i istampati bar tri jela
        //(njihov naziv, sastojke i da li je lactose-free)

        Jelo jelo1 = new Jelo("Corba");
        Jelo jelo2 = new Jelo ("Sarma");
        Jelo jelo3 = new Jelo ("Torta");

        Corba corba1 = new Corba("Čorba sa povrćem");
        Sarma sarma1 = new Sarma ("Kupus sarma");
        Torta torta1 = new Torta("Sacher");

        jelo1.dodajSastojak("Voda");
        jelo1.dodajSastojak("Povrće");
        System.out.println("Naziv jela: " + corba1.naziv);
        jelo1.stampaLista();
        jelo1.stampaLaktoza();

        System.out.println("--------------------------------");

        jelo2.dodajSastojak("Kupus");
        jelo2.dodajSastojak("Mleveno meso");
        jelo2.dodajSastojak("Voda");
        jelo2.dodajSastojak("Pirinač");
        System.out.println("Naziv jela: " + sarma1.naziv);
        jelo2.stampaLista();
        jelo2.stampaLaktoza();

        System.out.println("--------------------------------");

        jelo3.dodajSastojak("Voda");
        jelo3.dodajSastojak("Brašno");
        jelo3.dodajSastojak("Mleko");
        jelo3.dodajSastojak("Šlag");
        jelo3.dodajSastojak("Čokolada");
        System.out.println("Naziv jela: " + torta1.naziv);
        jelo3.stampaLista();
        jelo3.stampaLaktoza();

    }
}
