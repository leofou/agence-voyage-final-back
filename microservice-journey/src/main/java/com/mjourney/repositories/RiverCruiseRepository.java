package com.mjourney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjourney.entities.RiverCruise;

@Repository
public interface RiverCruiseRepository extends JpaRepository<RiverCruise, Long> {

}
