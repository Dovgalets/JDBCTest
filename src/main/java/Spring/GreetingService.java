package Spring;

import Hibernate.City;
import Hibernate.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class GreetingService {
    public List<City> getCities(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction tx = null;
        List<City> cities = null;

        try {
            tx = session.beginTransaction();
            cities = session.createQuery("FROM City", City.class).list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cities;
    }
}
