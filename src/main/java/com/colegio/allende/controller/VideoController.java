package com.colegio.allende.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.colegio.allende.entity.VideoEntity;
import com.colegio.allende.service.VideoService;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

     @GetMapping("/{id_titulo}")
    public List<VideoEntity>getDataVideo(@PathVariable Integer id_titulo){
         List<VideoEntity> existe =videoService.findById_titulo_lectura(id_titulo);
         if (!existe.isEmpty()){
             return existe;
         }
         return null;
    }

    @GetMapping("/path/{path}")
    public List<VideoEntity>getDataVideoName(@PathVariable String path){
         System.out.println(path);
         List<VideoEntity> existe =videoService.findByPath_video(path);
         if (!existe.isEmpty()){
             return  existe;
         }
         return null;
    }

    @PutMapping("/id")
    public String actualizar(@RequestBody VideoEntity entity,@PathVariable Integer id){
         Optional<VideoEntity> existe= videoService.findById(id);
         if (existe.isPresent()){
             VideoEntity videoActualizado=existe.get();
             videoActualizado.setSubtitulo(entity.getSubtitulo());
             videoActualizado.setCodigo(entity.getCodigo());
             videoActualizado.setLectura(entity.getLectura());
             videoActualizado.setPath(entity.getPath());
             videoService.add(videoActualizado);
             return  "Actualizado";
         }
         return "El video no existe";
    }

    @GetMapping("/all")
    public List<VideoEntity>getAll(){
         return videoService.findAll();
    }
}
