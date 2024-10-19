package ru.spring.dez;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "This is a rock music";
    }
}
