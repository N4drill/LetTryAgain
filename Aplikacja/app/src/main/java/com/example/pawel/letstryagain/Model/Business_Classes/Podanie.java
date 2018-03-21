package com.example.pawel.letstryagain.Model.Business_Classes;

import com.example.pawel.letstryagain.Model.Data;

import java.util.ArrayList;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Podanie {
    private Data data_zalozenia;
    private boolean zatwierdzony = false; // domyślne podanie jest niezatwierdzone;
    private Data data_zatwierdzenia;
    private int numer_podania;
    private String screen_url;
    private Student organizator;
    private ArrayList<Student> studenci_uczestniczacy_ArrayList = new ArrayList<>();
    private Sala sala;
    private Opinia opinia_podanie;
    private Kurs dotyczy_kursu;

    public Podanie(Data data_zalozenia, int numer_podania, Student organizator, Sala sala, Opinia opinia_podanie, Kurs dotyczy_kursu) {
        this.data_zalozenia = data_zalozenia;
        this.numer_podania = numer_podania;
        this.organizator = organizator;
        this.sala = sala;
        this.opinia_podanie = opinia_podanie;
        this.dotyczy_kursu = dotyczy_kursu;

    }

    public Data getData_zalozenia() {
        return data_zalozenia;
    }

    public void setData_zalozenia(Data data_zalozenia) {
        this.data_zalozenia = data_zalozenia;
    }

    public boolean isZatwierdzony() {
        return zatwierdzony;
    }

    public void setZatwierdzony(boolean zatwierdzony) {
        this.zatwierdzony = zatwierdzony;
    }

    public Data getData_zatwierdzenia() {
        return data_zatwierdzenia;
    }

    public void setData_zatwierdzenia(Data data_zatwierdzenia) {
        this.data_zatwierdzenia = data_zatwierdzenia;
    }

    public int getNumer_podania() {
        return numer_podania;
    }

    public void setNumer_podania(int numer_podania) {
        this.numer_podania = numer_podania;
    }

    public String getScreen_url() {
        return screen_url;
    }

    public void setScreen_url(String screen_url) {
        this.screen_url = screen_url;
    }

    public Student getOrganizator() {
        return organizator;
    }

    public void setOrganizator(Student organizator) {
        this.organizator = organizator;
    }

    public ArrayList<Student> getStudenci_uczestniczacy_ArrayList() {
        return studenci_uczestniczacy_ArrayList;
    }

    public void setStudenci_uczestniczacy_ArrayList(ArrayList<Student> studenci_uczestniczacy_ArrayList) {
        this.studenci_uczestniczacy_ArrayList = studenci_uczestniczacy_ArrayList;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Opinia getOpinia() {
        return opinia_podanie;
    }

    public void setOpinia(Opinia opinia) {
        this.opinia_podanie = opinia;
    }

    public Opinia getOpinia_podanie() {
        return opinia_podanie;
    }

    public void setOpinia_podanie(Opinia opinia_podanie) {
        this.opinia_podanie = opinia_podanie;
    }

    public Kurs getDotyczy_kursu() {
        return dotyczy_kursu;
    }

    public void setDotyczy_kursu(Kurs dotyczy_kursu) {
        this.dotyczy_kursu = dotyczy_kursu;
    }
}
