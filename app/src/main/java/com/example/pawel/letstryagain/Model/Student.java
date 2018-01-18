package com.example.pawel.letstryagain.Model;

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

    public Student(String imie, String nazwisko, int nr_indeksu, int semestr, String wydzial, String kierunek, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.semestr = semestr;
        this.wydzial = wydzial;
        this.kierunek = kierunek;
        this.email=email;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, int semestr, String wydzial, String kierunek, String drugie_imie, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.semestr = semestr;
        this.wydzial = wydzial;
        this.kierunek = kierunek;
        this.drugie_imie = drugie_imie;
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
}

