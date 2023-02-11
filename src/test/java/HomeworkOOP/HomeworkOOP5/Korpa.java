package HomeworkOOP5;

import java.util.ArrayList;

public class Korpa {

    //Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
    //Osim konstuktora definisati:
    ArrayList<Namirnica> listaNamirnica;
    public Korpa() {
        listaNamirnica = new ArrayList<>();
    }
    public void dodavanjeNamirnica(Namirnica namirnica){
        listaNamirnica.add(namirnica);
    }
    //metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.

    public int suma(ArrayList<Namirnica> lista) {
        int suma = 0;
        for (int i = 0; i < listaNamirnica.size(); i++) {
            suma = suma + listaNamirnica.get(i).getCena();
        } return suma;
    }

    // - metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.

    public boolean nalaziSe(Namirnica n) {
        boolean provera = false;
        for (int i = 0; i < listaNamirnica.size(); i++) {
            if (listaNamirnica.get(i).getNaziv().equals(n.getNaziv())) {
                provera = true;
            }
        } return provera;
    }
    public void stampaProvere(Namirnica n){
        boolean provera = false;
    for(int i = 0; i < listaNamirnica.size();i++) {
        if (listaNamirnica.get(i).getNaziv().equals(n.getNaziv())) {
            provera = true;
        }
    }
    if (provera) {
        System.out.println("Namirnica je u korpi.");
    } else {
        System.out.println("Namirnica nije u korpi.");
    }
        }

    // - metoda stampaj() - istampace sve namirnice iz liste.
    public void stampa() {
        System.out.println("Namirnice su: ");
        for (int i = 0; i < listaNamirnica.size(); i++) {
            System.out.println(listaNamirnica.get(i).getNaziv());
        }
        System.out.println("Cena svih namirnica u korpi je " + suma(listaNamirnica));
        }
    }



