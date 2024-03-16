package com.spring;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("Person")
public interface PersonInterface {


    @BeforeEach
    default void setUp() {
        System.out.println("BeforeEach................");
    }


    @BeforeAll
    default void beforeAll() {
        System.out.println("beforeAll................");
    }

    @Test
    default void myTest() {
        System.out.println("myTest................");
    }



//    default void fun(){
//        System.out.println("I am fun");
//    }
}
