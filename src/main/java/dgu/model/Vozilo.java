package dgu.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vozilo",
        uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class Vozilo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "inventarni_broj")
    private int inventarniBroj;

    @Column(name = "podrucni_ured")
    private String podrucniUred;

    @Column(name = "zaduzena_osoba")
    private String zaduzenaOsoba;

    @Column(name = "registarska_oznaka")
    private String registarskaOznaka;

    @Column(name = "marka_vozila")
    private String markaVozila;

    @Column(name = "tip_vozila")
    private String tipVozila;

    public Vozilo() {
    }

    public Vozilo(int id, int inventarniBroj, String podrucniUred, String zaduzenaOsoba, String registarskaOznaka, String markaVozila, String tipVozila) {
        this.id = id;
        this.inventarniBroj = inventarniBroj;
        this.podrucniUred = podrucniUred;
        this.zaduzenaOsoba = zaduzenaOsoba;
        this.registarskaOznaka = registarskaOznaka;
        this.markaVozila = markaVozila;
        this.tipVozila = tipVozila;
    }

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
