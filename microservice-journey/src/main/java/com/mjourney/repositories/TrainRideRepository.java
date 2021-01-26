package com.mjourney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjourney.entities.TrainRide;

@Repository
public interface TrainRideRepository extends JpaRepository<TrainRide, Long> {

}
