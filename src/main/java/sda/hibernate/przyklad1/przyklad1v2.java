package sda.hibernate.przyklad1;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.przyklad1.*;

public class przyklad1v2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        UzytkownikExtraData uzytkownik = new UzytkownikExtraData();
        uzytkownik.setImie("Robert");
        uzytkownik.setNazwisko("persist");
        uzytkownik.setUlucaZam("Morska");
        uzytkownik.setNrDomuZam("1d");
        uzytkownik.setNrMieszkaniaZam("30");
        uzytkownik.setKodPocztowyZam("80-151");
        uzytkownik.setMiejscowoscZam("Sopot");
        uzytkownik.setUlucaKor("Morska");
        uzytkownik.setNrDomuKor("1d");
        uzytkownik.setNrMieszkaniaKor("30");
        uzytkownik.setKodPocztowyKor("80-151");
        uzytkownik.setMiejscowoscKor("Sopot");

        session.persist(uzytkownik);


        UzytkownikExtraData2 uzytkownik2 = new UzytkownikExtraData2();
        uzytkownik2.setImie("Robert");
        uzytkownik2.setNazwisko("persist");

        Adres adresZameldowania = new Adres();
        adresZameldowania.setUlucaZam("Morska");
        adresZameldowania.setNrDomuZam("1d");
        adresZameldowania.setNrMieszkaniaZam("30");
        adresZameldowania.setKodPocztowyZam("80-151");
        adresZameldowania.setMiejscowoscZam("Sopot");

        uzytkownik2.setAdresZameldowania(adresZameldowania);
        uzytkownik2.setAdresKorespondencyjny(adresZameldowania);

        session.persist(uzytkownik2);
        session.flush();
        session.close();
    }
}
