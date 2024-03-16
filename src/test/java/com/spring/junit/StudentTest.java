package com.spring.junit;


import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

//@Disabled
@Tag("Student")
public class StudentTest {


   // @Test
    @DisplayName("funRepeated Function")
    @RepeatedTest(3)
    void funRepeated(TestInfo testInfo, RepetitionInfo repetitionInfo){

                        System.out.println(testInfo.getDisplayName());
                        System.out.println(testInfo.getTestClass());
                        System.out.println(testInfo.getTestMethod());
                        System.out.println(testInfo.getTags());
                        System.out.println(repetitionInfo.getCurrentRepetition());

    }

}

//    @BeforeEach
//    void setUp() {
//        System.out.println("out");
//    }
//
//    @Test
//    void newTest() {
//        Student student = new Student();
//        //Assertions.assertThat(student.getName()).isEqualTo("gado");
//
//        MatcherAssert.assertThat(student.getName(), Matchers.is("gado"));
//
//
//    }
//
//
//    @Nested
//    class nestedStudent{
//        @BeforeEach
//        void setUp() {
//            System.out.println("in");
//        }
//
//        @Test
//        void newTest() {
//            Student student = new Student();
//            //Assertions.assertThat(student.getName()).isEqualTo("gado");
//
//            MatcherAssert.assertThat(student.getName(), Matchers.is("gado"));
//
//
//            }
//        }
//}

//    @Test
//    void personTest1(){
//        System.out.println("11111");
//    }
//
//    @Test
//void personTest2(){
//        System.out.println("22222");
     //   Person person =new Person();
//    Assertions.assertAll("Student Data",
//            ()-> Assertions.assertEquals(person.getfName(),"mahmoud"),
//            ()-> Assertions.assertEquals(person.getlName(),"gado"),
//            ()-> Assertions.assertEquals(person.getPhone1(),"01125589989"),
//            ()-> Assertions.assertEquals(person.getPhone2(),"01444449989")
//
//
//            );


//        Assertions.assertAll("person data",
//                () -> Assertions.assertAll(
//                        "person namses",
//                        () -> Assertions.assertEquals(person.getfName(),"mahmoud",""),
//                        () -> Assertions.assertEquals(person.getlName(),"gado","")
//                ),
//        () -> Assertions.assertAll(
//                "person phones",
//                () -> Assertions.assertEquals(person.getPhone1(),"01125589989",""),
//                () -> Assertions.assertEquals(person.getPhone2(),"01444449989","")
//        ));
//


//}

//}





//@Test
//void testing(){
//    Student student =new Student();
//    Assertions.assertAll("Student Data",
//            ()-> Assertions.assertEquals(student.getName(),"gado"),
//            ()-> Assertions.assertEquals(student.getAge(),"35"));
//}

//@BeforeEach
//void beforeEach() {
//    student=new Student();
//    System.out.println(" @BeforeEach.......");
//
//}
//
//@Test
//void getName() {
//    //Assertions.assertEquals(student.getName(),"Gado", "Name not matches");
//    Assertions.assertTrue("Gado".equals(student.getName()),() ->"Name not matches" );
//}
//
//@Test
//void getAge() {
//    //Assertions.assertEquals(student.getAge(),30, "Age not matches");
//    Assertions.assertTrue("25".equals(student.getAge()),() ->"Age not matches" );
//}
//
//
