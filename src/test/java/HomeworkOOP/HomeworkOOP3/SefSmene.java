package HomeworkOOP3;

public class SefSmene extends Radnik{


    public SefSmene(int id, String nazivRadnika, int godineIskustva, int plata) {
        super(id, nazivRadnika, godineIskustva, plata);


    }
    public void stampaSefSmene() {
        if (this.godineIskustva > 5) {
            System.out.println("Šef smene " + this.nazivRadnika + " koji ima ID " + this.id + " ima " + this.godineIskustva
                    + " godine iskstva i njegova plata sa uvećanjem od 20% iznosi " + (this.plata * 1.2) + " eura.");
        } else {
            System.out.println("Šef smene " + this.nazivRadnika + " koji ima ID " + this.id + " ima " + this.godineIskustva +
                    " godine iskustva i njegova plata iznosi " + this.plata + " eura bez uvećanja.");
        }
    }
}
