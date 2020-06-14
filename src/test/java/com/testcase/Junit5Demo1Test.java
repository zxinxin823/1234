package com.testcase;


import org.junit.jupiter.api.*;

@DisplayName("junit5测试演示类")
public class Junit5Demo1Test {

    @BeforeAll
    static void before(){
        System.out.println("before");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");
    }

    @Test
    @DisplayName("测试方法fun")
//    @RepeatedTest(3)
    @Tag("testcase")
    void fun(){
        System.out.println("fun");
    }

    @Test
//    @Disabled
    @DisplayName("测试方法fun1")
    @Tag("uatcase")
    void fun1(){
        System.out.println("fun1");
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }

    @AfterAll
    static void after(){
        System.out.println("after");
    }
}
