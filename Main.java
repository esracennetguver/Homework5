import business.concretes.CustomerCheckManager;
import business.concretes.CustomerManager;
import business.concretes.MailVerificationManager;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setFirstName("Esra Cennet");
		customer1.setLastName("Güver");
		customer1.setEmail("esraaa@gmail.com");
		customer1.setPassword("123456");
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setFirstName("Hülya");
		customer2.setLastName("Güver");
		customer2.setEmail("Hülyagüver@hotmail.com");
		customer2.setPassword("123456");
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(3);
		customer3.setFirstName("Eda");
		customer3.setLastName("Güver");
		customer3.setEmail("edaaagüver@gmail.com");
		customer3.setPassword("123456");

		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(),new MailVerificationManager(),new HibernateCustomerDao());
		
		customerManager.signUp(customer1);
		customerManager.signUp(customer2);
		
	
		
	}

}
