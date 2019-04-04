package sda.hibernate.entity.przyklad2.przed;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "klient")
public class Klient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Column
    private String nrTelefonnu;
    @Column
    private Date dataModyfikacji;
    @Column
    private Integer idModyfikujacego;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getDataModyfikacji() {
        return dataModyfikacji;
    }

    public void setDataModyfikacji(Date dataModyfikacji) {
        this.dataModyfikacji = dataModyfikacji;
    }

    public Integer getIdModyfikujacego() {
        return idModyfikujacego;
    }

    public void setIdModyfikujacego(Integer idModyfikujacego) {
        this.idModyfikujacego = idModyfikujacego;
    }
}
