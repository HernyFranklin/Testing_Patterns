package com.testing.test;

import com.testing.test.builder_pattern.User;
import com.testing.test.builder_pattern.UserBuilder;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
@SpringBootTest
public class Builder_Pattern_Test {
    @Test
    void test_user_is_able_to_make_action_with_enough_access_level() {
        User user = (new UserBuilder().withAccessLevel(3).build());
        Assert.assertTrue(user.canMakeAction());
    }

    @Test
    void test_user_is_not_able_to_make_action_without_enough_access_level() {
        User user = (new UserBuilder().withAccessLevel(1).build());
        Assert.assertFalse(user.canMakeAction());
    }


}
