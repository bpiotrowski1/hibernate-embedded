package sda.hibernate.zadania.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OsobaUpo {
    @Column
    private String imieUpo1;
    @Column
    private String nazwiskoUpo1;
    @Column
    private String nrDowodu1;
    @Column
    private String dataDodaniaUpo1;

    public OsobaUpo() {
    }

    public OsobaUpo(final String imieUpo, final String nazwiskoUpo, final String nrDowodu, final String dataDodaniaUpo) {
        this.imieUpo1 = imieUpo;
        this.nazwiskoUpo1 = nazwiskoUpo;
        this.nrDowodu1 = nrDowodu;
        this.dataDodaniaUpo1 = dataDodaniaUpo;
    }
}
