package com.spring.junit;

import java.util.MissingFormatArgumentException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.spring.PersonInterface;


class PersonTest implements PersonInterface {


//    @BeforeEach
//    void setUp() {
//        System.out.println("BeforeEach................");
//    }


   // @BeforeEach
    @Test
    void simpleTest() {
        System.out.println("simpleTest................");
    }


    //    @Test
//    @DisplayName("Hi Function")
//    @RepeatedTest(5)
//    void myTest() {
//        System.out.println("welcome");
//    }
//

//     @Test
//    void newTest(){
//        Assertions.assertTrue("gado".equalsIgnoreCase("gadOo"));
//    }

//    @Test
//    @DisplayName("Test Student by Id")
//    //@Disabled
//    void findById(){
//        //System.out.println("Student 3333");
//        Student student=new Student();
//       // Assertions.assertEquals(student.findById(1),null);
//        Assertions.assertThrows(MissingFormatArgumentException.class,() -> student.getException());
//    }

}
