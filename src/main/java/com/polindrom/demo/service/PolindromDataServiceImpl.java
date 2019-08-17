package com.polindrom.demo.service;

import com.polindrom.demo.model.PolindromDataEntity;
import com.polindrom.demo.repository.PolindromDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolindromDataServiceImpl implements PolindromDataService {
    @Autowired
    PolindromDataRepository repository;

    @Override
    public void savePolindromData(PolindromDataEntity entity) {
        repository.save(entity);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public List<PolindromDataEntity> findAll() {
        return repository.findAll();
    }
}
