/*Przykład 1
 * Pokazanie jak dziala @Embedded i @Embeddable*/

package sda.hibernate.przyklad1;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.przyklad1.Adres;
import sda.hibernate.entity.przyklad1.Uzytkownik;
import sda.hibernate.entity.przyklad1.Uzytkownik2;

public class przyklad1 {

    public static void main(String[] arg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Uzytkownik uzytkownik = new Uzytkownik();
        uzytkownik.setImie("Robert");
        uzytkownik.setNazwisko("persist");
        uzytkownik.setUlucaZam("Morska");
        uzytkownik.setNrDomuZam("1d");
        uzytkownik.setNrMieszkaniaZam("30");
        uzytkownik.setKodPocztowyZam("80-151");
        uzytkownik.setMiejscowoscZam("Sopot");

        session.persist(uzytkownik);


        Uzytkownik2 uzytkownik2 = new Uzytkownik2();
        uzytkownik2.setImie("Robert");
        uzytkownik2.setNazwisko("persist");
        Adres adresZameldowania=new Adres();
        adresZameldowania.setUlucaZam("Morska");
        adresZameldowania.setNrDomuZam("1d");
        adresZameldowania.setNrMieszkaniaZam("30");
        adresZameldowania.setKodPocztowyZam("80-151");
        adresZameldowania.setMiejscowoscZam("Sopot");
        uzytkownik2.setAdresZameldowania(adresZameldowania);

        session.persist(uzytkownik2);
        session.flush();
        session.close();
    }
}
