package com.example.bazededate1;

import java.io.Serializable;

public class PersonalMedical implements Serializable {

    private String nume;
    private String functie;
    private int nrOreLucrate; //seekbar
    private int oraTura; //timepick
    private boolean angajatVechi; //checkbox

    public PersonalMedical(String nume, String functie, int nrOreLucrate, int oraTura, boolean angajatVechi) {
        this.nume = nume;
        this.functie = functie;
        this.nrOreLucrate = nrOreLucrate;
        this.oraTura = oraTura;
        this.angajatVechi = angajatVechi;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }

    public int getOraTura() {
        return oraTura;
    }

    public void setOraTura(int oraTura) {
        this.oraTura = oraTura;
    }

    public boolean isAngajatVechi() {
        return angajatVechi;
    }

    public void setAngajatVechi(boolean angajatVechi) {
        this.angajatVechi = angajatVechi;
    }

    @Override
    public String toString() {
        return "PersonalMedical{" +
                "nume='" + nume + '\'' +
                ", functie='" + functie + '\'' +
                ", nrOreLucrate=" + nrOreLucrate +
                ", oraTura=" + oraTura +
                ", angajatVechi=" + angajatVechi +
                '}';
    }
}
