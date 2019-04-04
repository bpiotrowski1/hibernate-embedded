package sda.hibernate.entity.przyklad2.po;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "produkt2")
public class Produkt2 extends MainEntity {

    @Column
    private String nazwa;
    @Column
    private String producent;
    @Column
    private Integer cena;

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
}
