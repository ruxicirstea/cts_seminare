package spital.decorator.main;

import spital.decorator.classes.IRezultat;
import spital.decorator.classes.Rezultat;
import spital.decorator.classes.RezultatOnline;
import spital.decorator.classes.RezultatOnlineAbstract;

public class Main {
    public static void main(String[] args) {
        IRezultat rezultat=new Rezultat(23,"Gigel");
        rezultat.afiseazaRezultat();

        RezultatOnlineAbstract rezultatOnline=new RezultatOnline(new Rezultat(12,"Ion"));
        rezultatOnline.afiseazaRezultat();
        rezultatOnline.afiseazaRezultateOnline();
    }
}
