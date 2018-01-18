package com.example.pawel.letstryagain.Model;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Prowadzacy {
    private int pensum;
    private String imie;
    private String nazwisko;
    private int numer_pracownika;
    private String tytul_naukowy;

    public Prowadzacy(int pensum, String imie, String nazwisko, int numer_pracownika, String tytul_naukowy) {
        this.pensum = pensum;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_pracownika = numer_pracownika;
        this.tytul_naukowy = tytul_naukowy;
    }

    public int getPensum() {
        return pensum;
    }

    public void setPensum(int pensum) {
        this.pensum = pensum;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumer_pracownika() {
        return numer_pracownika;
    }

    public void setNumer_pracownika(int numer_pracownika) {
        this.numer_pracownika = numer_pracownika;
    }

    public String getTytul_naukowy() {
        return tytul_naukowy;
    }

    public void setTytul_naukowy(String tytul_naukowy) {
        this.tytul_naukowy = tytul_naukowy;
    }
}
