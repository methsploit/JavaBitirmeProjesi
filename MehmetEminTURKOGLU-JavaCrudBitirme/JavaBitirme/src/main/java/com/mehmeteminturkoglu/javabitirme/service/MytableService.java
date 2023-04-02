package com.mehmeteminturkoglu.javabitirme.service;

import com.mehmeteminturkoglu.javabitirme.dao.DaoMytable;
import com.mehmeteminturkoglu.javabitirme.repository.MytableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class MytableService {
    @Autowired
    MytableRepository mytableRepository;
    public List<DaoMytable> getMyTables (){
        return mytableRepository.findAll();
    }

    public void createMytable (DaoMytable tablo){
        mytableRepository.save(tablo);
    }

    public void deleteMytable (Long id) {
        mytableRepository.deleteById(id);
    }
    public Optional<DaoMytable> getMyTable (Long id){
        return mytableRepository.findById(id);
    }

}
