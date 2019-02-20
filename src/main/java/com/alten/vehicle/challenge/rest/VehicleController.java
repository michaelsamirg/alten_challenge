package com.alten.vehicle.challenge.rest;

import java.util.ArrayList;
import java.util.List;

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
	public List<Vehicle> listVehicle(@RequestParam(name = "customer", required=false, defaultValue = "") String customer)
	{
		if(customer != null && customer.length() > 0)
		{
			try {
				return vehicleRepository.findByCustomer(Long.parseLong(customer));
			} catch (Exception e) {
				return new ArrayList<Vehicle>();
			}
		}
		else
			return vehicleRepository.findAll();
	}
}
