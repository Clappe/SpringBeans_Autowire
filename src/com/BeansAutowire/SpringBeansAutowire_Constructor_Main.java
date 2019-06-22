package com.BeansAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeansAutowire_Constructor_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        SpringBeansAutowire_Constructor_TextEditor springBeansAutowire_constructor_textEditor =
                (SpringBeansAutowire_Constructor_TextEditor) applicationContext.getBean("SpringBeansAutowire_Constructor_TextEditor");
        springBeansAutowire_constructor_textEditor.checkSpell();
    }
}
