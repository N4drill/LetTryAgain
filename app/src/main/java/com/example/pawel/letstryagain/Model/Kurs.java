package com.example.pawel.letstryagain.Model;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Kurs {
    private float liczbaGodz;
    private int ECTS;
    private int kod_kursu;

    public Kurs(float liczbaGodz, int ECTS, int kod_kursu) {
        this.liczbaGodz = liczbaGodz;
        this.ECTS = ECTS;
        this.kod_kursu = kod_kursu;
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
}
