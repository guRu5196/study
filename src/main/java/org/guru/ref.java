//package org.guru;
//
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[] args) {
//      Student s1 = new Student();
//      Student s2 = null;
//      s1.setAge(50);
//      s1.setRollno(101);
//      s1.setName("gurunanthan");
//
//
//
//
//      SessionFactory sf = new Configuration().configure().addAnnotatedClass(org.guru.Student.class).buildSessionFactory();
//
//
//      Session session = sf.openSession();
//
//      Transaction transaction = session.beginTransaction();
//
//      //session.merge(s1);
//      s2 = session.get(Student.class, 0);
//      session.remove(s2);
//      transaction.commit();
//      session.close();
//      sf.close();
//
//
//
//
//    }
//}