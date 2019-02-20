package com.alten.vehicle.challenge.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alten.vehicle.challenge.model.Customer;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
