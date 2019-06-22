package com.BeansAutowire;

public class SpringBeansAutowire_byType_TextEditor {
    private SpringBeansAutowire_byType_SpellChecker springBeansAutowire_byType_spellChecker;
    private String name;

    public void setSpringBeansAutowire_byType_spellChecker(SpringBeansAutowire_byType_SpellChecker springBeansAutowire_byType_spellChecker) {
        this.springBeansAutowire_byType_spellChecker = springBeansAutowire_byType_spellChecker;
    }

    public SpringBeansAutowire_byType_SpellChecker getSpringBeansAutowire_byType_spellChecker() {
        return springBeansAutowire_byType_spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void checkSpell(){
        springBeansAutowire_byType_spellChecker.spellChecking();
    }
}
