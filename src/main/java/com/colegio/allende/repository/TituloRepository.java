package com.colegio.allende.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.allende.entity.TituloEntity;

import java.util.List;

@Repository
public interface TituloRepository extends JpaRepository<TituloEntity, Integer> {

}
