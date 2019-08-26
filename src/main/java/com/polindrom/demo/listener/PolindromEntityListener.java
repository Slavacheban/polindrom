package com.polindrom.demo.listener;

import com.polindrom.demo.model.PolindromDataEntity;
import com.polindrom.demo.utils.PolindromUtils;

import javax.persistence.PrePersist;

public class PolindromEntityListener {
    @PrePersist
    public void prePersist(PolindromDataEntity entity) {
        entity.setPolindrom(PolindromUtils.getPolindrom(entity.getNumber()));
    }
}
