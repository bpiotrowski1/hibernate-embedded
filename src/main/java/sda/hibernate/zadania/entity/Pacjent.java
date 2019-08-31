package sda.hibernate.zadania.entity;

import javax.persistence.*;

@Entity
@Table(name = "pacjent")
public class Pacjent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Column
    private String pesel;
    @Embedded
    private OsobaUpo osobaUpo1;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "imieUpo1", column = @Column(name = "imieUpo2")),
            @AttributeOverride(name = "nazwiskoUpo1", column = @Column(name = "nazwiskoUpo2")),
            @AttributeOverride(name = "nrDowodu1", column = @Column(name = "nrDowodu2")),
            @AttributeOverride(name = "dataDodaniaUpo1", column = @Column(name = "dataDodaniaUpo2")),
    })
    private OsobaUpo osobaUpo2;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "imieUpo1", column = @Column(name = "imieUpo3")),
            @AttributeOverride(name = "nazwiskoUpo1", column = @Column(name = "nazwiskoUpo3")),
            @AttributeOverride(name = "nrDowodu1", column = @Column(name = "nrDowodu3")),
            @AttributeOverride(name = "dataDodaniaUpo1", column = @Column(name = "dataDodaniaUpo3")),
    })
    private OsobaUpo osobaUpo3;

    public Pacjent() {
    }

    public Pacjent(final String imie, final String nazwisko, final String pesel, final OsobaUpo osobaUpo1, final OsobaUpo osobaUpo2, final OsobaUpo osobaUpo3) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.osobaUpo1 = osobaUpo1;
        this.osobaUpo2 = osobaUpo2;
        this.osobaUpo3 = osobaUpo3;
    }
}
