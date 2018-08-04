package com.johannlau.jokelibrary;

import java.util.Random;

public class Joke {

    private String[] jokeRepository = {
            "According to my calculations the problem doesn't exist.",
            "A bug in the code is worth two in the documentation.",
            "A computer's attention span is as long as its power cord."
    };

    public String returnJoke() {
        int index = new Random().nextInt(jokeRepository.length);
        return jokeRepository[index];
    }
}
