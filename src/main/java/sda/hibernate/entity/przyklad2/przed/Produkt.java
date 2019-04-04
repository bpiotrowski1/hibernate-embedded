package sda.hibernate.entity.przyklad2.przed;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "produkt")
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nazwa;
    @Column
    private String producent;
    @Column
    private Integer cena;
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

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
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
