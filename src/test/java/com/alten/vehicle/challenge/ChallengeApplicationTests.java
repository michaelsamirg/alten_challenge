package com.alten.vehicle.challenge;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alten.vehicle.challenge.dao.CustomerRepository;
import com.alten.vehicle.challenge.dao.VehicleRepository;
import com.alten.vehicle.challenge.model.Customer;
import com.alten.vehicle.challenge.model.Vehicle;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallengeApplicationTests {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testVehicleList() {
		List<Vehicle> list = vehicleRepository.findAll();
		
		assertNotNull(list);
	}
	
	@Test
	public void testVehicleListWithCustomer() {
		List<Vehicle> list = vehicleRepository.findByCustomer(1L, null);
		
		assertNotNull(list);
	}
	
	@Test
	public void testVehicleListWithCustomerNotExists() {
		List<Vehicle> list = vehicleRepository.findByCustomer(10000L, null);
		
		assertTrue(list.size() == 0);
	}
	
	@Test
	public void testCustomerList() {
		List<Customer> list = customerRepository.findAll();
		
		assertNotNull(list);
	}

}
