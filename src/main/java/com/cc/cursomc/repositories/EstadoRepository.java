package com.cc.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cc.cursomc.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}