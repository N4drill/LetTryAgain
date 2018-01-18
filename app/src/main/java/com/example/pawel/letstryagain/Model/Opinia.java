package com.example.pawel.letstryagain.Model;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Opinia {
    private boolean zaopiniowany;
    private String tresc_opinii;

    public Opinia(boolean zaopiniowany, String tresc_opinii) {
        this.zaopiniowany = zaopiniowany;
        this.tresc_opinii = tresc_opinii;
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
}
