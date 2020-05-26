package com.karadayi.flightservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karadayi.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
