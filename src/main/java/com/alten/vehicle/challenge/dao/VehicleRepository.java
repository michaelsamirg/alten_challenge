package com.alten.vehicle.challenge.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alten.vehicle.challenge.model.Vehicle;

@Repository
@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	@Query("SELECT v FROM Vehicle v inner join v.customers c WHERE c.id=:pCustomer")
	List<Vehicle> findByCustomer(@Param("pCustomer") Long pCustomer);
}
