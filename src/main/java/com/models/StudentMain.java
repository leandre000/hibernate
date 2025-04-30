package com.models;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utility.HibernateUtil;



public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		NameDetails names=new NameDetails();
		Laptop laptop = new Laptop();
		names.setFirstName("Izere");
		names.setMiddleName("Shema");
		names.setLastName("Leandre");
		laptop.setLapDesc("Lenovo");
		Student st=new Student();
		st.setNames(names);
		st.setAge(1);
		st.setLaptop(laptop);
		session.persist(st);
		session.persist(laptop);
		tx.commit();
		session.close();

	}

}