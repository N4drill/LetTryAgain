package com.example.pawel.letstryagain.Model;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Podanie {
    private Data data_zalozenia;
    private boolean zatwierdzony = false; // domyślne podanie jest niezatwierdzone;
    private Data data_zatwierdzenia;
    private int numer_podania;
    private String screen_url;

    public Podanie(Data data_zalozenia, boolean zatwierdzony, Data data_zatwierdzenia, int numer_podania) {
        this.data_zalozenia = data_zalozenia;
        this.zatwierdzony = zatwierdzony;
        this.data_zatwierdzenia = data_zatwierdzenia;
        this.numer_podania = numer_podania;
    }

    public Podanie(Data data_zalozenia, boolean zatwierdzony, Data data_zatwierdzenia, int numer_podania, String screen_url) {
        this.data_zalozenia = data_zalozenia;
        this.zatwierdzony = zatwierdzony;
        this.data_zatwierdzenia = data_zatwierdzenia;
        this.numer_podania = numer_podania;
        this.screen_url = screen_url;
    }

    public Podanie(Data data_zalozenia, Data data_zatwierdzenia, int numer_podania) {
        this.data_zalozenia = data_zalozenia;
        this.data_zatwierdzenia = data_zatwierdzenia;
        this.numer_podania = numer_podania;
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
}
