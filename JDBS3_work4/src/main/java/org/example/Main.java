package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    private static void setSession(Object object){
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
    }

    public static void main(String[] args) {
        Arhiv arhiv = new Arhiv();
        arhiv.setId(11);
        arhiv.setFond(118);
        arhiv.setName_fond("Revizki kazky");
        arhiv.setOpys(14);
        arhiv.setSprava(256);
        arhiv.setName_sprava("Revizki kazky odnodvortsiv Volynskoii gubernii");
        arhiv.setYear(1858);
        arhiv.setCount_stor(1453);

        setSession(arhiv);
    }
}