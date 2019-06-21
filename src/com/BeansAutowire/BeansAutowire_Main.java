package com.BeansAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansAutowire_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        BeansAutowire_TextEditor beansAutowire_textEditor =
                (BeansAutowire_TextEditor) applicationContext.getBean("BeansAutowire_TextEditor");
        beansAutowire_textEditor.spellCheck();
    }
}
