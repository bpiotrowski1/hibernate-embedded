/*Przykład 2
* Pokazanie jak dziala dziedziczenie w JPA. Pokazano jak działa adnotacja @MappedSuperclass*/
package sda.hibernate.przyklad2;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.przyklad2.po.Adres2;
import sda.hibernate.entity.przyklad2.przed.Adres;

import java.sql.Date;
import java.time.LocalDate;

public class przyklad2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Adres adres = new Adres();
        adres.setMiejscowoscZam("Spoot");
        adres.setUlucaZam("Piwna");
        adres.setNrDomuZam("32a");
        adres.setNrMieszkaniaZam("23");
        adres.setKodPocztowyZam("22-985");
        adres.setIdModyfikujacego(15);
        adres.setDataModyfikacji(Date.valueOf(LocalDate.now()));
        session.persist(adres);

        Adres2 adres2 = new Adres2();
        adres2.setMiejscowoscZam("Spoot");
        adres2.setUlucaZam("Piwna");
        adres2.setNrDomuZam("32a");
        adres2.setNrMieszkaniaZam("23");
        adres2.setKodPocztowyZam("22-985");
        adres2.setIdModyfikujacego(15);
        adres2.setDataModyfikacji(Date.valueOf(LocalDate.now()));
        session.persist(adres2);
        session.flush();
        session.close();
    }
}
