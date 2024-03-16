package com.spring.junit;

public class Student {

    private static String name="gado";
    private static String age="35";

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        Student.name = name;
    }

    public String getAge() {
        return age;
    }

    public  void setAge(int age) {
        Student.age = String.valueOf(age);
    }

    public String findById(int id){
        if (id== 5){
            return "gado";
        } else if (id== 6) {
            return "Ahmed";
        }
        else {
           return null;
        }
    }

    public void getException(){
        throw new SpecialException();
    }
}
