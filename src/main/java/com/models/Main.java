package com.models;

import com.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args){

        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        Car car= new Car();
        car.setManufacturer("Benz");
        car.setNumOfDoors(5);
        Bike bike= new Bike();
        bike.setManufacturer("Samsung");
        bike.setHasCarrier(true);

        session.persist(car);
        System.out.println("Car persisted");
        session.persist(bike);

        session.close();
    }
}