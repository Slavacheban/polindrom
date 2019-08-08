package com.polindrom.demo.service;

import com.polindrom.demo.model.PolindromDataEntity;

public interface PolindromDataService {
    void savePolindromData(PolindromDataEntity entity);
    void deleteAll();
}
