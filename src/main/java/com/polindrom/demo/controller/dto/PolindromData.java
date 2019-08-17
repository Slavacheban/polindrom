package com.polindrom.demo.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class PolindromData {
    private Integer number;
    private Integer count;
    private Integer[] listPolindroms;
}
