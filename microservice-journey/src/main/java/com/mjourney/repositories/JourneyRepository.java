package com.mjourney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjourney.entities.Journey;

@Repository
public interface JourneyRepository extends JpaRepository<Journey, Long> {

}
