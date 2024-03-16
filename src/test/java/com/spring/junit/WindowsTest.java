package com.spring.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class WindowsTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_8)
    void WindowsTest(){
        System.out.println("WINDOWS.............");
    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_8)
    void JAVA_8Test(){
        System.out.println("JAVA_8.............");
    }

    @Test
    @EnabledOnOs(OS.MAC)
    @EnabledOnJre(JRE.JAVA_8)
    void MacTest(){
        System.out.println("MAC.............");
    }
    @Test
    @EnabledOnOs(OS.LINUX)
    @EnabledOnJre(JRE.JAVA_8)
    void LinuxTest(){
        System.out.println("LINUX.............");
    }
    @EnabledIfEnvironmentVariable(named = "USERNAME",matches = "Mahmoud Gado")
    @Test
    void userName1(){

    }
    @EnabledIfEnvironmentVariable(named = "USERNAME",matches = "Eslam Khder")
    @Test
    void userName2(){

    }
}
