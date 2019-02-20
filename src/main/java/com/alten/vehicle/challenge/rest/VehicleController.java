package com.alten.vehicle.challenge.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alten.vehicle.challenge.dao.VehicleRepository;
import com.alten.vehicle.challenge.model.Vehicle;

@RestController
@RequestMapping(value="/vehicle")
public class VehicleController {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/list")
	@ResponseBody
	public List<Vehicle> listVehicle(@RequestParam(name = "customer", required=false) String customer,
			@RequestParam(name = "status", required=false) Integer status)
	{
		List<Vehicle> list = new ArrayList<Vehicle>();

		try {
			list = vehicleRepository.findByCustomer(customer != null ? Long.parseLong(customer) : null, status);
		} catch (Exception e) {
			list = new ArrayList<Vehicle>();
		}
		
		//update status
		if(status == null)
		{
			for (Iterator<Vehicle> iterator = list.iterator(); iterator.hasNext();) {
				Vehicle vehicle = (Vehicle) iterator.next();
				
				Random rand = new Random();
				vehicle.setStatus(rand.nextInt(100000) % 2);
				
				vehicleRepository.save(vehicle);
			}
		}
		
		return list;
	}
}
