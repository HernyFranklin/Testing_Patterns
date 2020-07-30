package com.testing.test.object_Mother_test.mother;

import com.testing.test.object_mother.AccessLevel;
import com.testing.test.object_mother.UserName;

import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
public class AccessLevelMother {
    public static AccessLevel.AccessLevelBuilder complete(){
        return AccessLevel.builder().value(new Random().nextInt());
    }

}
