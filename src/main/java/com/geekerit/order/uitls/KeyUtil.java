package com.geekerit.order.uitls;

import java.util.Random;

public class KeyUtil {

    public static synchronized String genSquine(){


        Random random = new Random();
        Integer i = random.nextInt(90000) + 90000;

        return System.currentTimeMillis() + String.valueOf(i);
    }
}
