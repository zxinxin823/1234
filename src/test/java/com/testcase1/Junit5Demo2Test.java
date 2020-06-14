package com.testcase1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("junit5测试演示类2")
public class Junit5Demo2Test {

    @Test
    @DisplayName("测试方法eat")
    @Tag("uatcase")
    void eat(){
        System.out.println("eating");
    }
}
