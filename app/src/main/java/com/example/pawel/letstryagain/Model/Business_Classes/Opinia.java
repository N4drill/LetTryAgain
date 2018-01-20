package com.example.pawel.letstryagain.Model.Business_Classes;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Opinia {
    private boolean zaopiniowany;
    private String tresc_opinii;
    private Podanie dotyczaca_podania;
    private Prowadzacy dotyczaca_prowadzacego;

    public Opinia(boolean zaopiniowany, String tresc_opinii, Podanie dotyczaca_podania, Prowadzacy dotyczaca_prowadzacego) {
        this.zaopiniowany = zaopiniowany;
        this.tresc_opinii = tresc_opinii;
        this.dotyczaca_podania = dotyczaca_podania;
        this.dotyczaca_prowadzacego = dotyczaca_prowadzacego;
    }

    public boolean isZaopiniowany() {
        return zaopiniowany;
    }

    public void setZaopiniowany(boolean zaopiniowany) {
        this.zaopiniowany = zaopiniowany;
    }

    public String getTresc_opinii() {
        return tresc_opinii;
    }

    public void setTresc_opinii(String tresc_opinii) {
        this.tresc_opinii = tresc_opinii;
    }

    public Podanie getDotyczaca_podania() {
        return dotyczaca_podania;
    }

    public void setDotyczaca_podania(Podanie dotyczaca_podania) {
        this.dotyczaca_podania = dotyczaca_podania;
    }

    public Prowadzacy getDotyczaca_prowadzacego() {
        return dotyczaca_prowadzacego;
    }

    public void setDotyczaca_prowadzacego(Prowadzacy dotyczaca_prowadzacego) {
        this.dotyczaca_prowadzacego = dotyczaca_prowadzacego;
    }
}
