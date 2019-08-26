package com.polindrom.demo.utils;

import java.util.ArrayList;
import java.util.List;

public class PolindromUtils {
    public static Integer getPolindrom(int N) {
        int polindrom = 0;
        for (int i = N; i < Integer.MAX_VALUE; i++) {
            StringBuilder sb = new StringBuilder(Integer.valueOf(i));
            if(sb.equals(sb.reverse())) {
                polindrom = i;
            }
        }
        return polindrom;
    }
}
