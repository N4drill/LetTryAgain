package com.example.pawel.letstryagain.Model.Business_Classes;

import java.util.ArrayList;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Prowadzacy {
    private int pensum;
    private String imie;
    private String nazwisko;
    private int numer_pracownika;
    private String tytul_naukowy;
    private ArrayList<Podanie> kursy_prowadzone_ArrayList;

    public Prowadzacy(int pensum, String imie, String nazwisko, int numer_pracownika, String tytul_naukowy, ArrayList<Podanie> kursy_prowadzone_ArrayList) {
        this.pensum = pensum;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_pracownika = numer_pracownika;
        this.tytul_naukowy = tytul_naukowy;
        this.kursy_prowadzone_ArrayList = kursy_prowadzone_ArrayList;
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


    public ArrayList<Podanie> getKursy_prowadzone() {
        return kursy_prowadzone_ArrayList;
    }

    public void setKursy_prowadzone(ArrayList<Podanie> kursy_prowadzone) {
        this.kursy_prowadzone_ArrayList = kursy_prowadzone;
    }
}
