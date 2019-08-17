package com.polindrom.demo.service;

import com.polindrom.demo.model.PolindromDataEntity;

import java.util.List;

public interface PolindromDataService {
    void savePolindromData(PolindromDataEntity entity);
    void deleteAll();
    List<PolindromDataEntity> findAll();
}
