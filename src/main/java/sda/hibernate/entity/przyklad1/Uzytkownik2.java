package sda.hibernate.entity.przyklad1;

import javax.persistence.*;

@Entity
@Table(name = "uzytkownik2")
public class Uzytkownik2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    //adres zameldowania
    @Embedded
    private Adres adresZameldowania;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Adres getAdresZameldowania() {
        return adresZameldowania;
    }

    public void setAdresZameldowania(Adres adresZameldowania) {
        this.adresZameldowania = adresZameldowania;
    }

}
