package ru.spring.dez;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    @Override
    public String getSong(){
        return "This is a classical music";
    }
}
