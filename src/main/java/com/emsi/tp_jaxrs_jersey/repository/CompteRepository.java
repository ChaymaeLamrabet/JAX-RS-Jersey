package com.emsi.tp_jaxrs_jersey.repository;

import com.emsi.tp_jaxrs_jersey.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}

