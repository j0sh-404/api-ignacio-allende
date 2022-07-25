package com.colegio.allende.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.allende.entity.VideoEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Integer> {
    public List<VideoEntity>findByPath(String path);
    public List<VideoEntity> findByIdLectura(Integer id_titulo);
}
