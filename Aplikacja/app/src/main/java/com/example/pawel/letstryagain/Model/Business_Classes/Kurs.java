package com.example.pawel.letstryagain.Model.Business_Classes;

import java.util.ArrayList;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Kurs {
    private float liczbaGodz;
    private String nazwa_kursu;
    private int ECTS;
    private int kod_kursu;
    private ArrayList<Podanie> podania_o_powtorke_ArrayList = new ArrayList<>();
    private ArrayList<Prowadzacy> prowadzacyKurs_ArrayList = new ArrayList<>();


    public Kurs(String nazwa_kursu, float liczbaGodz, int ECTS, int kod_kursu) {
        this.liczbaGodz = liczbaGodz;
        this.ECTS = ECTS;
        this.kod_kursu = kod_kursu;
        this.nazwa_kursu= nazwa_kursu;
    }

    public float getLiczbaGodz() {
        return liczbaGodz;
    }

    public void setLiczbaGodz(float liczbaGodz) {
        this.liczbaGodz = liczbaGodz;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public int getKod_kursu() {
        return kod_kursu;
    }

    public void setKod_kursu(int kod_kursu) {
        this.kod_kursu = kod_kursu;
    }

    public ArrayList<Podanie> getPodania_o_powtorke_ArrayList() {
        return podania_o_powtorke_ArrayList;
    }

    public void setPodania_o_powtorke_ArrayList(ArrayList<Podanie> podania_o_powtorke_ArrayList) {
        this.podania_o_powtorke_ArrayList = podania_o_powtorke_ArrayList;
    }

    public String getNazwa_kursu() {
        return nazwa_kursu;
    }

    public void setNazwa_kursu(String nazwa_kursu) {
        this.nazwa_kursu = nazwa_kursu;
    }

    public ArrayList<Prowadzacy> getProwadzacyKurs_ArrayList() {
        return prowadzacyKurs_ArrayList;
    }

    public void setProwadzacyKurs_ArrayList(ArrayList<Prowadzacy> prowadzacyKurs_ArrayList) {
        this.prowadzacyKurs_ArrayList = prowadzacyKurs_ArrayList;
    }
}
