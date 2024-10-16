package dgu.model.dto;

public class VoziloDto {
    private int id;
    private int inventarniBroj;
    private String podrucniUred;
    private String zaduzenaOsoba;
    private String registarskaOznaka;
    private String markaVozila;
    private String tipVozila;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInventarniBroj() {
        return inventarniBroj;
    }

    public void setInventarniBroj(int inventarniBroj) {
        this.inventarniBroj = inventarniBroj;
    }

    public String getPodrucniUred() {
        return podrucniUred;
    }

    public void setPodrucniUred(String podrucniUred) {
        this.podrucniUred = podrucniUred;
    }

    public String getZaduzenaOsoba() {
        return zaduzenaOsoba;
    }

    public void setZaduzenaOsoba(String zaduzenaOsoba) {
        this.zaduzenaOsoba = zaduzenaOsoba;
    }

    public String getRegistarskaOznaka() {
        return registarskaOznaka;
    }

    public void setRegistarskaOznaka(String registarskaOznaka) {
        this.registarskaOznaka = registarskaOznaka;
    }

    public String getMarkaVozila() {
        return markaVozila;
    }

    public void setMarkaVozila(String markaVozila) {
        this.markaVozila = markaVozila;
    }

    public String getTipVozila() {
        return tipVozila;
    }

    public void setTipVozila(String tipVozila) {
        this.tipVozila = tipVozila;
    }
}
