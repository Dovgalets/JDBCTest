package Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List<City> cities = session.createQuery("FROM City", City.class).list();
            for (Iterator<City> iterator = cities.iterator(); iterator.hasNext(); ) {
                City city = iterator.next();
                System.out.print("First Name: " + city.getId());
                System.out.print("  Last Name: " + city.getName());
                System.out.println("  Salary: " + city.getPopulation());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

//        session.save(cityEntity);
//        session.getTransaction().commit();

        session.close();


    }
}
