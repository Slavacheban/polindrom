package com.polindrom.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@Table(name = "polindrom_data")
public class PolindromDataEntity extends BaseEntity {
    @Column(name = "number")
    private Integer number;
    @Column(name = "polindrom")
    private Integer polindrom;
}
