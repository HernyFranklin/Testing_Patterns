package com.testing.test.builder_pattern;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
public class UserBuilder {
    private Long id;
    private String name;
    private int accessLevel;

    public UserBuilder() {
        this.id = 0L;
        this.name = "name";
        this.accessLevel = 55;
    }

    public UserBuilder withAccessLevel(int accessLevel){
        this.accessLevel=accessLevel;
        return this;
    }

    public User build(){
        return new User (this.id,this.name,this.accessLevel);
    }
}
