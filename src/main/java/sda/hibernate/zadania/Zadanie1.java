package sda.hibernate.zadania;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.zadania.entity.OsobaUpo;
import sda.hibernate.zadania.entity.Pacjent;

public class Zadanie1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Pacjent pacjent = new Pacjent("Pacjent1","Nazwisko", "12345678911",
                new OsobaUpo("ImieUpo1", "NazwiskoUpo1", "NrDOWODU", "15/15/15"),
                new OsobaUpo("ImieUpo2", "NazwiskoUop2", "NrDOWODU", "12/15/15"),
                new OsobaUpo("ImieUpo3", "NazwiskoUpo3", "NrDOWODU", "13/15/15"));

        session.persist(pacjent);
        session.flush();
        session.close();
    }
}
