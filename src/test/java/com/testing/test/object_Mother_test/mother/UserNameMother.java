package com.testing.test.object_Mother_test.mother;

import com.testing.test.object_mother.UserName;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
public class UserNameMother {
    public static UserName.UserNameBuilder complete(){
        return UserName.builder().value(RandomName());
    }

    private static String RandomName(){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }
}
