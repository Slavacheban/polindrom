package com.polindrom.demo.utils;

import java.util.ArrayList;
import java.util.List;

public class PolindromUtils {
    public static Integer[] getPolindroms(int N, int count) {
        Integer[] ii = new Integer[count];
        int j = 0;
        for (int i = N; i < Integer.MAX_VALUE; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(N));
            StringBuilder revers = sb.reverse();
            if(sb.equals(revers) && ii.length < count) {
                ii[j++] = i;
            }
        }
        return ii;
    }
}
