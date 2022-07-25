package com.colegio.allende.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.colegio.allende.entity.TituloEntity;
import com.colegio.allende.repository.TituloRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TituloImplementService implements TituloService{

    @Autowired()
    private TituloRepository tituloRepository;

    @Override
    public Optional<TituloEntity> findById(Integer id) {
        return tituloRepository.findById(id);
    }

    @Override
    public List<TituloEntity> findAll() {
        return tituloRepository.findAll();
    }

    @Override
    public TituloEntity save(TituloEntity tituloEntity) {
         return tituloRepository.save(tituloEntity);
    }

    @Override
    public Page<TituloEntity> findAll(Pageable pageable) {
        return tituloRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
       tituloRepository.deleteById(id);
    }
}
