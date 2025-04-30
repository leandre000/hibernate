package rca.hibernate.demoHibernateB;

import com.models.Bike;
import com.models.Car;
import com.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoHibernateBApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHibernateBApplication.class, args);

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