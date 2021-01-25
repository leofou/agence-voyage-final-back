package com.mvoyageur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvoyageur.entities.Voyageur;

@Repository
public interface VoyageurRepository extends JpaRepository<Voyageur, Long>{

}
