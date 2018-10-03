package com.ntech.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntech.software.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
