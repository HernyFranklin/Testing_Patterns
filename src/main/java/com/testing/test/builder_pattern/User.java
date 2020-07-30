package com.testing.test.builder_pattern;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */

@Setter
@Getter
public class User {
    private int MIN_LEVEL_TO_EDIT_VIDEOS = 2;
    private Long id;
    private String name;
    private int accessLevel;

    public User(Long id, String name, int accessLevel) {
        this.id = id;
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public boolean canMakeAction(){
        return this.accessLevel>= this.MIN_LEVEL_TO_EDIT_VIDEOS;
    }

}
