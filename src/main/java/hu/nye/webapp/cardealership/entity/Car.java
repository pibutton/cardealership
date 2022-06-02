package hu.nye.webapp.cardealership.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rendszam;
    private String marka;
    private String tipus;
    private int evjarat;
    private int motorterfogat;
    private String uzemanyagFajta;
    private int kmAllas;
    private String szin;
    private int ar;

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    public int getMotorterfogat() {
        return motorterfogat;
    }

    public void setMotorterfogat(int motorterfogat) {
        this.motorterfogat = motorterfogat;
    }

    public String getUzemanyagFajta() {
        return uzemanyagFajta;
    }

    public void setUzemanyagFajta(String uzemanyagFajta) {
        this.uzemanyagFajta = uzemanyagFajta;
    }

    public int getKmAllas() {
        return kmAllas;
    }

    public void setKmAllas(int kmAllas) {
        this.kmAllas = kmAllas;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }
}
