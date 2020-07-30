package com.testing.test.object_Mother_test.mother;

import com.testing.test.object_mother.UserId;

import java.util.Random;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
public class UserIdMother {
    public static UserId.UserIdBuilder complete(){
        return UserId.builder().value(new Random().nextLong());
    }

}
