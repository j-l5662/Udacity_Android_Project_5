package com.udacity.gradle.builditbigger.backend;

import com.johannlau.jokelibrary.Joke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData() {
        Joke joke = new Joke();
        myData = joke.returnJoke();
    }
}