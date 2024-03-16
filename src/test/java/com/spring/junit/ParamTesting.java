package com.spring.junit;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.spring.DataArguments;

public class ParamTesting {

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} =====> {arguments}")
   // @ValueSource(strings={"Eslam","Ahemed","Karim","Jo"})
    @EnumSource(Gender.class)
    void myParamTesting1(Gender value){

        System.out.println(value);
    }

//    @DisplayName("Param Test")
//    @ParameterizedTest(name = "{displayName}: {index} =====> {arguments}")
//    @CsvSource({
//            "Ahmed, 21 ,01235",
//            "Karim,19,012245",
//            "Jo,12,0125551",
//    })
//    void myParamTesting2( String name, int age, String phone){
//
//        System.out.println("name "+ name);
//        System.out.println("name "+ age);
//        System.out.println("name "+ phone);
//
//    }
    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} =====> {arguments}")
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    @MethodSource("getData")
    void myParamTesting3( String name, int age, String phone){

        System.out.println("name "+ name);
        System.out.println("name "+ age);
        System.out.println("name "+ phone);

    }

    static Stream<Arguments> getData(){
        return Stream.of(
                Arguments.of("Ahmed" ,21, "01235"),
                Arguments.of("Karim" ,19, "012254"),
                Arguments.of("Jo" ,17, "0125558")
        );
    }
    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} =====> {arguments}")
   // @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    @ArgumentsSource(DataArguments.class)
    void myParamTesting5( String name, int age, String phone){

        System.out.println("name "+ name);
        System.out.println("name "+ age);
        System.out.println("name "+ phone);

    }

}
