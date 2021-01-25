package com.magencevoyage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magencevoyage.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
