package com.testing.test.object_mother;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 30/7/2020
 */
@Value
@Data
@Builder
public class AccessLevel {
    int value;
    int dir;
}
