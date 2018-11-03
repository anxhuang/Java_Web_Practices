package com.domain;

import java.io.Serializable;

public class Bmi implements Serializable {

    private float cm;
    private float kg;

    public Bmi() {
    }

    public float getCm() {
        return cm;
    }

    public float getKg() {
        return kg;
    }

    public void setCm(float cm) {
        this.cm = cm;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

    public float getBmi() {
        float m = cm / 100f;
        return kg / m / m;
    }
}
