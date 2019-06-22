package com.BeansAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeansAutowire_byType_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        SpringBeansAutowire_byType_TextEditor springBeansAutowire_byType_textEditor =
                (SpringBeansAutowire_byType_TextEditor) applicationContext.getBean("SpringBeansAutowire_byType_TextEditor");
        springBeansAutowire_byType_textEditor.checkSpell();
    }
}
