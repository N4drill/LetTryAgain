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
    private String katedra;
    private Kurs kurs;
    private ArrayList<Kurs> kursy_prowadzone_ArrayList;

    public Prowadzacy(int pensum, String imie, String nazwisko, int numer_pracownika, String tytul_naukowy, String katedra) {
        this.pensum = pensum;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_pracownika = numer_pracownika;
        this.tytul_naukowy = tytul_naukowy;
        this.kursy_prowadzone_ArrayList = new ArrayList<>();
        this.katedra=katedra;
    }

    public Prowadzacy(int pensum, String imie, String nazwisko, int numer_pracownika, String tytul_naukowy, String katedra, ArrayList<Kurs> kursy_prowadzone_ArrayList) {
        this.pensum = pensum;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_pracownika = numer_pracownika;
        this.tytul_naukowy = tytul_naukowy;
        this.kursy_prowadzone_ArrayList = kursy_prowadzone_ArrayList;
        this.katedra=katedra;
    }

    // konstruktor potrzebny do arraylisty wyswietlanej
    public Prowadzacy(String imie, String nazwisko, String tytul_naukowy, String katedra, Kurs kurs) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tytul_naukowy = tytul_naukowy;
        this.katedra = katedra;
        this.kurs = kurs;
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

    public String getKatedra() {
        return katedra;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }

    public ArrayList<Kurs> getKursy_prowadzone_ArrayList() {
        return kursy_prowadzone_ArrayList;
    }

    public void setKursy_prowadzone_ArrayList(ArrayList<Kurs> kursy_prowadzone_ArrayList) {
        this.kursy_prowadzone_ArrayList = kursy_prowadzone_ArrayList;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
