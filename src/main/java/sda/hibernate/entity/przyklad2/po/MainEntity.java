package sda.hibernate.entity.przyklad2.po;

import javax.persistence.*;
import java.sql.Date;

@MappedSuperclass
public class MainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
