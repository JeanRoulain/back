package com.restservice;

import java.awt.*;
import java.util.ArrayList;

public class Greeting {
    private final long id;
    private String content;


    public Greeting() {
        this.id = 1;
        this.content = "Test";
    }
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public static ArrayList<String> Boucle(Greeting greeting){
        ArrayList<String> noms = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            noms.add(greeting.content);
        }
        return noms;
    }
}
