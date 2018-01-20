package com.example.pawel.letstryagain.Model.Business_Classes;

import java.util.ArrayList;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Student {
    private String imie;
    private String nazwisko;
    private int nr_indeksu;
    private int semestr;
    private String wydzial;
    private String kierunek;
    private String drugie_imie;
    private String email;
    private ArrayList<Podanie> uczestnik_podania_ArrayList = new ArrayList<>();
    private ArrayList<Podanie> organizowane_podania_ArrayList = new ArrayList<>();

    public Student(String imie, String nazwisko, int nr_indeksu, int semestr, String wydzial, String kierunek, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.semestr = semestr;
        this.wydzial = wydzial;
        this.kierunek = kierunek;
        this.email = email;
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

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public String getWydzial() {
        return wydzial;
    }

    public void setWydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getDrugie_imie() {
        return drugie_imie;
    }

    public void setDrugie_imie(String drugie_imie) {
        this.drugie_imie = drugie_imie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Podanie> getUczestnik_podania_ArrayList() {
        return uczestnik_podania_ArrayList;
    }

    public void setUczestnik_podania_ArrayList(ArrayList<Podanie> uczestnik_podania_ArrayList) {
        this.uczestnik_podania_ArrayList = uczestnik_podania_ArrayList;
    }

    public ArrayList<Podanie> getOrganizowane_podania_ArrayList() {
        return organizowane_podania_ArrayList;
    }

    public void setOrganizowane_podania_ArrayList(ArrayList<Podanie> organizowane_podania_ArrayList) {
        this.organizowane_podania_ArrayList = organizowane_podania_ArrayList;
    }
}

