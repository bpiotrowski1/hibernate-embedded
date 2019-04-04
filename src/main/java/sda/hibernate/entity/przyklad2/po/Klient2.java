package sda.hibernate.entity.przyklad2.po;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "klient2")
public class Klient2 extends MainEntity {

    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Column
    private String nrTelefonnu;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrTelefonnu() {
        return nrTelefonnu;
    }

    public void setNrTelefonnu(String nrTelefonnu) {
        this.nrTelefonnu = nrTelefonnu;
    }

}
