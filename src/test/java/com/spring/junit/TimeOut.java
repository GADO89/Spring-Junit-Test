package com.spring.junit;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeOut {


     @Test
    void timeOutTest1(){

         Assertions.assertTimeout(Duration.ofMillis(1000),
                 () ->{
             Thread.sleep(2000);
                     System.out.println("time Out Test 1");
                 }
                 );
    }

    @Test
    void timeOutTest2(){
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(1000),
                () ->{
                    Thread.sleep(2000);
                    System.out.println("time Out Test 2");
                }
        );
    }

}
