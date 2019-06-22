package com.BeansAutowire;

public class SpringBeansAutowire_Constructor_TextEditor {
    private SpringBeansAutowire_Constructor_SpellChecker springBeansAutowire_constructor_spellChecker;
    private String name;

    public SpringBeansAutowire_Constructor_TextEditor(SpringBeansAutowire_Constructor_SpellChecker springBeansAutowire_constructor_spellChecker,
                                                 String name){
        this.springBeansAutowire_constructor_spellChecker = springBeansAutowire_constructor_spellChecker;
        this.name = name;
    }

    public void checkSpell(){
        springBeansAutowire_constructor_spellChecker.spellChecking();
    }
}
