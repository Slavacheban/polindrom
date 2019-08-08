package com.polindrom.demo.utils;

import java.util.ArrayList;
import java.util.List;

public class PolindromUtils {
    public static List<Integer> getPolindroms(int N, int count) {
        List<Integer> list = new ArrayList<>();
        for (int i = N; i < Integer.MAX_VALUE; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(N));
            StringBuilder revers = sb.reverse();
            if(sb.equals(revers) && list.size() < count) {
                list.add(N);
            }
        }
        return list;
    }
}