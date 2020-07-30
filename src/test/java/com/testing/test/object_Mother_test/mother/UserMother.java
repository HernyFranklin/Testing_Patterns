package com.testing.test.object_Mother_test.mother;

import com.testing.test.object_mother.AccessLevel;
import com.testing.test.object_mother.User;
import com.testing.test.object_mother.UserId;
import com.testing.test.object_mother.UserName;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
public class UserMother {
    public static User.UserBuilder complete(){
        return User.builder().userId(UserIdMother.complete().build())
                                        .userName(UserNameMother.complete().build())
                                        .accessLevel(AccessLevelMother.complete().build());
    }


}
