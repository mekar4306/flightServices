package com.karadayi.flightservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karadayi.flightservices.entities.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
