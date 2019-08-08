package com.polindrom.demo.model;

import com.polindrom.demo.utils.PolindromUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class PolindromDataEntity extends BaseEntity {
    @Column(name = "number")
    private Integer number;
    @Column(name = "count")
    private Integer count;
    @Column(name = "list_polindroms")
    private List<Integer> listPolindroms = new ArrayList<>();;

    @PostConstruct
    private void initList() {
        listPolindroms = PolindromUtils.getPolindroms(number, count);
    }
}
