package com.example.pawel.letstryagain.Model;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Sala {

    private int godzinaZajec;
    private String budynek;

    public Sala(int godzinaZajec, String budynek) {
        this.godzinaZajec = godzinaZajec;
        this.budynek = budynek;
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
}
