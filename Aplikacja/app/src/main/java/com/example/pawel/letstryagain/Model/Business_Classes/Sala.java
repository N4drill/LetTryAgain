package com.example.pawel.letstryagain.Model.Business_Classes;

import java.util.ArrayList;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Sala {

    private int godzinaZajec;
    private String budynek;
    private int sala;
    private ArrayList<Podanie> podania_rezerwujace_ArrayList = new ArrayList<>();


    public Sala(int godzinaZajec, String budynek, int sala) {
        this.godzinaZajec = godzinaZajec;
        this.budynek = budynek;
        this.sala= sala;
    }

    public int getGodzinaZajec() {
        return godzinaZajec;
    }

    public void setGodzinaZajec(int godzinaZajec) {
        this.godzinaZajec = godzinaZajec;
    }

    public String getBudynek() {
        return budynek;
    }

    public void setBudynek(String budynek) {
        this.budynek = budynek;
    }

    public ArrayList<Podanie> getPodania_rezerwujace_ArrayList() {
        return podania_rezerwujace_ArrayList;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setPodania_rezerwujace_ArrayList(ArrayList<Podanie> podania_rezerwujace_ArrayList) {
        this.podania_rezerwujace_ArrayList = podania_rezerwujace_ArrayList;
    }
}
