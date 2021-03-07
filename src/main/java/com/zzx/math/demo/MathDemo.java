package com.zzx.math.demo;

import java.math.BigDecimal;

public class MathDemo {

    public static void main(String[] args) {
        int i = 1;
        System.out.println(i / 100);
        int l = (int) (i * 0.01);
        System.out.println(l);
        BigDecimal bigDecimal = BigDecimal.valueOf(i);
        System.out.println(bigDecimal.multiply(BigDecimal.valueOf(0.01)));
    }

}
