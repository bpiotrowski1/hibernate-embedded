package sda.hibernate.entity.przyklad1;

import javax.persistence.*;

@Embeddable
public class Adres {
    @Column
    private String ulucaZam;
    @Column
    private String nrDomuZam;
    @Column
    private String nrMieszkaniaZam;
    @Column
    private String kodPocztowyZam;
    @Column
    private String miejscowoscZam;

    public String getUlucaZam() {
        return ulucaZam;
    }

    public void setUlucaZam(String ulucaZam) {
        this.ulucaZam = ulucaZam;
    }

    public String getNrDomuZam() {
        return nrDomuZam;
    }

    public void setNrDomuZam(String nrDomuZam) {
        this.nrDomuZam = nrDomuZam;
    }

    public String getNrMieszkaniaZam() {
        return nrMieszkaniaZam;
    }

    public void setNrMieszkaniaZam(String nrMieszkaniaZam) {
        this.nrMieszkaniaZam = nrMieszkaniaZam;
    }

    public String getKodPocztowyZam() {
        return kodPocztowyZam;
    }

    public void setKodPocztowyZam(String kodPocztowyZam) {
        this.kodPocztowyZam = kodPocztowyZam;
    }

    public String getMiejscowoscZam() {
        return miejscowoscZam;
    }

    public void setMiejscowoscZam(String miejscowoscZam) {
        this.miejscowoscZam = miejscowoscZam;
    }
}
