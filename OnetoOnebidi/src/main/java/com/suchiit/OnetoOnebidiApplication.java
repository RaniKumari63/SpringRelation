package com.suchiit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suchiit.model.Address;
import com.suchiit.model.Order;
import com.suchiit.repo.AddressRepo;
import com.suchiit.repo.OrderRepo;

import java.math.BigDecimal;
@SpringBootApplication
public class OnetoOnebidiApplication  implements CommandLineRunner{

	public static void main(String[] args)  {
		SpringApplication.run(OnetoOnebidiApplication.class, args);
	}
@Autowired
	private AddressRepo addressrepo;
@Autowired
private OrderRepo orderrepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Order order = new Order();

        order.setOrderTrackingNumber("1000");
        order.setStatus("COMPLETED");
        order.setTotalPrice(2000);
        order.setTotalQuantity(5);
        Address billingAddress = new Address();
       billingAddress.setStreet("kothrud");
        billingAddress.setCity("pune");
        billingAddress.setState("Maharashra");
       billingAddress.setCountry("India");
        billingAddress.setZipCode("11048");
		//addressrepo.save(billingAddress);
        order.setBillingAddress(billingAddress);
        orderrepo.save(order);
	}

}
