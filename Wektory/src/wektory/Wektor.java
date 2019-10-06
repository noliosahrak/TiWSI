/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wektory;

/**
 *
 * @author Wojciech
 */
public class Wektor {
    
    int[] wspolrzedne;
    
    public Wektor(int[] wspolrzedne) {
        this.wspolrzedne = wspolrzedne;
    }
    
    public void wypisz() {
        for (int i = 0; i < wspolrzedne.length; i++) {
            System.out.print(wspolrzedne[i]+", ");
        }
        System.out.println();
    }
    
    public Wektor dodaj(Wektor drugi) {
        int[] wynik = new int[wspolrzedne.length];
        for (int i = 0; i < wynik.length; i++) {
            wynik[i] = wspolrzedne[i] + drugi.wspolrzedne[i];
        }
        return new Wektor(wynik);
    }
    
    public Wektor odejmij(Wektor drugi) {
        int[] wynik = new int[wspolrzedne.length];
        for (int i = 0; i < wynik.length; i++) {
            wynik[i] = wspolrzedne[i] - drugi.wspolrzedne[i];
        }
        return new Wektor(wynik);
    }
    
    public Wektor pomnożLiczbe(int liczba) {
        int[] wynik = new int[wspolrzedne.length];
        for (int i = 0; i < wynik.length; i++) {
            wynik[i] = wspolrzedne[i] * liczba;
        }
        return new Wektor(wynik);
    }
    
    public int mnożenieSkalarne(Wektor drugi) {
        int wynik = 0;
        for (int i = 0; i < wspolrzedne.length; i++) {
            wynik += wspolrzedne[i] * drugi.wspolrzedne[i];
        }
        return wynik;
    }
    
    public double dlugosc() {
        double wynik = 0;
        for (int i = 0; i < wspolrzedne.length; i++) {
            wynik += wspolrzedne[i] * wspolrzedne[i];
        }
        return Math.sqrt(wynik);
    }
}
