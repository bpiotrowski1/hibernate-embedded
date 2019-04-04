package sda.hibernate.entity.przyklad2.przed;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "adres")
public class Adres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
