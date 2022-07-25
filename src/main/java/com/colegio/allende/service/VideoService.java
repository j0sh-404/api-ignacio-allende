package com.colegio.allende.service;

import java.util.List;
import java.util.Optional;

import com.colegio.allende.entity.VideoEntity;


public interface VideoService {

   public List<VideoEntity>findByPath_video(String path);

   public List<VideoEntity> findById_titulo_lectura(Integer id_titulo);

   public VideoEntity add(VideoEntity videoEntity);

   public void delete(Integer id);

   public Optional findById(Integer id);

   public List<VideoEntity>findAll();

}
