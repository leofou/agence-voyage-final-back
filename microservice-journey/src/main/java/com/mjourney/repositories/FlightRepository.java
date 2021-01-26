package com.mjourney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjourney.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
