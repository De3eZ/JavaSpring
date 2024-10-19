package ru.spring.dez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = (Music) context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = (Music) context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.playMusic();

        context.close();
    }
}
