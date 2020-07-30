package com.testing.test.object_Mother_test.mother;

import com.testing.test.object_mother.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
@SpringBootTest
public class Object_Mother_Test {

    @Test
    void test_user_is_able_to_make_action_with_enough_access_level() {
        User user = UserMother.complete()
                                .accessLevel(AccessLevelMother.complete().value(3).dir(4).build())
                                  .build();

        Assert.assertTrue(user.canMakeAction());
    }

    @Test
    void test_user_is_not_able_to_make_action_without_enough_access_level() {
        User user = UserMother.complete()
                .accessLevel(AccessLevelMother.complete().value(1).build())
                .build();
        Assert.assertFalse(user.canMakeAction());
    }
}
