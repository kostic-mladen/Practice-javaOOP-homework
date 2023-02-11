package HomeworkOOP3;

public class Fizikalac extends Radnik{
    public Fizikalac(int id, String nazivRadnika, int godineIskustva, int plata) {
        super(id, nazivRadnika, godineIskustva, plata);
    }

    public void stampaFizikalac() {
        if (this.godineIskustva > 5) {
            System.out.println("Fizikalac " + this.nazivRadnika + " koji ima ID " + this.id +" ima " + this.godineIskustva +
                    "godine isktuva i njegova plata i sa uvećanjem od 20% iznosi " + (this.plata * 1.2) + " eura");
        } else {
            System.out.println("Fizikalac " + this.nazivRadnika + " koji ima ID " + this.id + " ima " + this.godineIskustva +
                    " godine iskustva i njegova plata iznosi " + this.plata + " eura bez uvećanja.");
        }
    }
}

