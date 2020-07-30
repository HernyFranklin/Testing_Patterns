package com.testing.test.object_mother;

import lombok.*;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
@Getter
@Setter
@Data
@Builder
public class User {
    final int MIN_LEVEL_TO_MAKE_ACTION = 3;

    private UserId userId;
    private UserName userName;
    private AccessLevel accessLevel;

    public User(UserId userId, UserName userName, AccessLevel accessLevel) {
        this.userId = userId;
        this.userName = userName;
        this.accessLevel = accessLevel;
    }

    public boolean canMakeAction(){
        return this.accessLevel.getValue()>=this.MIN_LEVEL_TO_MAKE_ACTION;
    }
}
