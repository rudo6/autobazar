package sk.upjs.ics.autobazar;

import java.util.LinkedList;
import java.util.List;

public class Pouzivatel {
    
    private Long id;
    
    private String uzivatelskeMeno;
    
    private String heslo;
    
    private String meno;
    
    private String priezvisko;
    
    private String adresa;
    
    private String mesto;
    
    private String psc;
     
    private String krajina;
    
    private String telefonneCislo;
    
    private String email;
    
    private List<InzeratOsobne> inzeratyOsobne = new LinkedList<>();
    private List<InzeratNakladne> inzeratyNakladne = new LinkedList<>();
    private List<InzeratMotocykel> inzeratyMotocykel = new LinkedList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUzivatelskeMeno() {
        return uzivatelskeMeno;
    }

    public void setUzivatelskeMeno(String uzivatelskeMeno) {
        this.uzivatelskeMeno = uzivatelskeMeno;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getKrajina() {
        return krajina;
    }

    public void setKrajina(String krajina) {
        this.krajina = krajina;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getTelefonneCislo() {
        return telefonneCislo;
    }

    public void setTelefonneCislo(String telefonneCislo) {
        this.telefonneCislo = telefonneCislo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.uzivatelskeMeno;
    }

    public List<InzeratOsobne> getInzeratyOsobne() {
        return inzeratyOsobne;
    }

    public void setInzeratyOsobne(List<InzeratOsobne> inzeratyOsobne) {
        this.inzeratyOsobne = inzeratyOsobne;
    }

    public List<InzeratNakladne> getInzeratyNakladne() {
        return inzeratyNakladne;
    }

    public void setInzeratyNakladne(List<InzeratNakladne> inzeratyNakladne) {
        this.inzeratyNakladne = inzeratyNakladne;
    }

    public List<InzeratMotocykel> getInzeratyMotocykel() {
        return inzeratyMotocykel;
    }

    public void setInzeratyMotocykel(List<InzeratMotocykel> inzeratyMotocykel) {
        this.inzeratyMotocykel = inzeratyMotocykel;
    }
    
    
}
