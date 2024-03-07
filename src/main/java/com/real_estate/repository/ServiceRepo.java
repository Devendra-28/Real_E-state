package com.real_estate.repository;

import com.real_estate.entities.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Services,Integer> {

}
