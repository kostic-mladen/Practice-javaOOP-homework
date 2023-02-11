package HomeworkOOP3;

public class Investitor extends Radnik{

    int brojZgrada;

    public Investitor(int id, String nazivRadnika, int godineIskustva, int plata, int brojZgrada) {
        super(id, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }

    public void stampaInvestitor() {
        if (this.brojZgrada > 5){
            System.out.println("Investitor " + this.nazivRadnika + " koji ima ID " + this.id + " je podigao " + this.brojZgrada +
                    " zgrada i njegova plata sa uvećanjem od 30% iznosi " + (this.plata * 1.3) + " eura. Ima " + this.godineIskustva +
                    " godina iskustva.");
        } else {
            System.out.println("Investitor + " + this.nazivRadnika + " koji ima ID " + this.id + " je podigao " + this.brojZgrada +
                    " i njegova plata bez povećanja iznosi " + this.plata + " eura. Ima " + this.godineIskustva + " godina iskustva.");
        }
    }
}
