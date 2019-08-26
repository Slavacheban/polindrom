package com.polindrom.demo.transformer;

import com.polindrom.demo.controller.dto.PolindromData;
import com.polindrom.demo.model.PolindromDataEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PolindromDataTransformer {
    public PolindromData buildPolindromData(PolindromDataEntity entity) {
        return new PolindromData().setNumber(entity.getNumber()).setPolindrom(entity.getPolindrom());
    }

    public List<PolindromData> buildPolindromDatas(List<PolindromDataEntity> entities) {
        return entities.stream().map(this::buildPolindromData).collect(Collectors.toList());
    }

    public PolindromDataEntity buildEntity (PolindromData polindromData) {
        return new PolindromDataEntity().setNumber(polindromData.getNumber())
                .setPolindrom(polindromData.getPolindrom());
    }
}
