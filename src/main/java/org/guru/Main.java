package org.guru;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLap_id(1);
        l1.setBrand_name("Asus");
        l1.setModel("Tuf Gaming");
        l1.setRam(16);
        Student s1 = new Student();
        s1.setRoll(50);
        s1.setAge(21);
        s1.setName("Guru");
        s1.setLaptop(l1);


        SessionFactory sf = new Configuration().configure().addAnnotatedClass(org.guru.Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        //s2= session.get(Student.class,52);
        //session.remove(s2);
        session.persist(s1);
        session.persist(l1);
        //session.merge(s1);
        transaction.commit();
        session.close();
        sf.close();


    }
}
// guru