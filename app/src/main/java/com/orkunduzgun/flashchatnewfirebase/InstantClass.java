package com.orkunduzgun.flashchatnewfirebase;

/**
 * Created by orkundzgn on 2.01.2018.
 */

public class InstantClass {

    private String message;
    private String author;

    public InstantClass(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantClass() {

    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
    
}
