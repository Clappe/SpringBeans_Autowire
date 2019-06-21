package com.BeansAutowire;

public class BeansAutowire_TextEditor {
    private BeansAutowire_SpellChecker beansAutowire_spellChecker;
    private String name;

    public void setBeansAutowire_spellChecker(BeansAutowire_SpellChecker beansAutowire_spellChecker) {
        this.beansAutowire_spellChecker = beansAutowire_spellChecker;
    }

    public BeansAutowire_SpellChecker getBeansAutowire_spellChecker() {
        return beansAutowire_spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void spellCheck(){
        beansAutowire_spellChecker.checkSpelling();
    }
}
